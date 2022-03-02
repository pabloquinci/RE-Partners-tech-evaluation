package problema7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class TotalVentasPorVendedor {
	public static List<EntradaCantidadVentas> crearArchivoSalidaConTotales(File archivoEntrada) {
		BufferedReader entrada;
		File salida=new File("Salida.txt");
		
		List<EntradaCantidadVentas> cantidadesVentasMes=new ArrayList<EntradaCantidadVentas>();
		
		try {
			entrada = new BufferedReader(new FileReader(archivoEntrada));
			PrintWriter salidaWrite = new PrintWriter(new FileWriter(salida));
			String elementoActual=entrada.readLine();
			String resultado="";
			String elementoAnterior="";
			int totalCantidadCorte=0;
			int cantEntradasVentasVendedor=0;
			
			
			while(elementoActual!=null) {
				elementoAnterior=elementoActual;
				String [] paramsElementActual=elementoActual.split("\\s+");
				String [] paramsElementAnterior=elementoAnterior.split("\\s+");
				
				while(elementoActual!=null && paramsElementActual[0].contentEquals(paramsElementAnterior[0])) {
					cantEntradasVentasVendedor++;
					totalCantidadCorte=totalCantidadCorte+Integer.valueOf(paramsElementActual[2]);
					elementoActual=entrada.readLine();
					paramsElementActual= elementoActual!=null ?elementoActual.split("\\s+") :null;
				}
				EntradaCantidadVentas entradaVenta= new EntradaCantidadVentas(totalCantidadCorte,cantEntradasVentasVendedor);
				cantidadesVentasMes.add(entradaVenta);
				cantEntradasVentasVendedor=0;
				totalCantidadCorte=0;
				
			}				
			entrada.close();
			salidaWrite.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cantidadesVentasMes;

		
	}
	
	public static void grabarArchivoSalida(String pathArchivoEentrada,List<EntradaCantidadVentas> cantidades) {
		String lineaLeida;
		BufferedReader lectura;
		File salida=new File("Salida.txt");

		try {
			lectura = new BufferedReader(new FileReader(pathArchivoEentrada));
			PrintWriter salidaWrite = new PrintWriter(new FileWriter(salida));
			lineaLeida = lectura.readLine();
			String elementoAnterior="";
			int i=0;
			int j=0;
			while(lineaLeida!=null) {
				elementoAnterior=lineaLeida;
				while(i<cantidades.get(j).getCantEntradasVendedor()) {
					salidaWrite.append(lineaLeida+" "+" "+cantidades.get(j).getCantidadVendida()+'\n');
					lineaLeida=lectura.readLine();
					i++;
				}
				i=0;
				j++;
			}
			
			System.out.println("Archivo de ventas generado correctamente.");
			System.out.println(" ");
			lectura.close();
			salidaWrite.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
	}
}
