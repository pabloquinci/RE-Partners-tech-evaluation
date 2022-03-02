package problema6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ArchivoConNovedades {
	public static void aparearArchivosNovedadesCambios(File archivo1, File archivo2) {
		try {
			BufferedReader entradaActual= new BufferedReader(new FileReader(archivo1));
			BufferedReader entradaCambios= new BufferedReader(new FileReader(archivo2));
			
			String resultado="";
			
			String lecturaActual= entradaActual.readLine();
			String lecturaCambios= entradaCambios.readLine();
			
			while(lecturaActual!=null && lecturaCambios!=null) {
				String[] partsActual=lecturaActual.split("\\s+");
				String[] partsCambios=lecturaCambios.split("\\s+");
				if(Integer.parseInt(partsActual[0])<Integer.parseInt(partsCambios[0])) {
					resultado+=lecturaActual+'\n';
					lecturaActual=entradaActual.readLine();
				}else {
					resultado+=lecturaCambios+'\n';
					lecturaCambios= entradaCambios.readLine();
				}

			}
			
			if(lecturaActual==null) {
				while(lecturaCambios!=null) {
					resultado+=lecturaCambios+'\n';
					lecturaCambios= entradaCambios.readLine();
				}
				
			}else {
				while(lecturaActual!=null) {
					resultado+=lecturaActual+'\n';
					lecturaActual=entradaActual.readLine();
				}
			}
			
			File archivoApareado=new File("Resultado.txt");
			
			PrintWriter salida=new PrintWriter(archivoApareado);
			salida.println(resultado);
			System.out.println("Archivo de novedades generado correctamente");
			System.out.println(" ");
			salida.close();
			entradaActual.close();
			entradaCambios.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
