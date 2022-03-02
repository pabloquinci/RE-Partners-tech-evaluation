package problema2;
import java.util.ArrayList;
import java.util.List;

public class ListarRangosConsecutivos {
	public static List<Rango> encontrarConsecutivos(int[] numeros, int numeroSuma) {
		List<Rango> rangos=new ArrayList<Rango>();
		
		for(int i=0; i<numeros.length;i++) {
			int offset=0;
			int sumaParcial=numeros[i];
			int rangoMin=i;
			int minActual=numeros[i];
			while(sumaParcial<numeroSuma && i+offset<numeros.length-1) {
				offset++;//1
				sumaParcial+=numeros[i+offset];
			}
			
			if(sumaParcial==numeroSuma) {
				int rangoMax=(rangoMin+offset)<numeros.length ?rangoMin+offset :numeros.length-1;
				Rango rango=new Rango(rangoMin,rangoMax);
				rangos.add(rango);
			}
		}
		
		return rangos;
	}
	
	public static void mostrarRangos(List<Rango> rangos, int numeroSuma) {
		for(Rango rango: rangos) {
			System.out.println("Los numeros entre "+"("+rango.getMin()+", "+rango.getMax()+")" + " suman " + numeroSuma);
		}
		
		System.out.println(" ");


	}
}


