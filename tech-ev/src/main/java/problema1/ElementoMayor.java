package problema1;

public class ElementoMayor {
	
	public static int encontrarMayor(int [] numeros) {
		int valorMaximo=0;
		
		for(Integer num: numeros) {
			if (num>valorMaximo) {
				valorMaximo=num;
			}
		}
		return valorMaximo;
	}

}
