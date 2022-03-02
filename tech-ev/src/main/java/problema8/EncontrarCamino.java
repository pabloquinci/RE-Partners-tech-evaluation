package problema8;

import java.util.ArrayList;

public class EncontrarCamino {
	
	//Movimientos posibles en los ejes X e Y
	static int[][] movimientos= {
			{-1,0}, //movimiento para arriba
			{0,1},	//movimiento para la derecha
			{1,0},	//movimiento para abajo
			{0,-1}	// movimiento para la izquierda
	};
	public static void rellenarCaminos(Laberinto laberinto, Coordenada posActual,ArrayList<Coordenada>camino) {
		
		if(posActual.getPosX()==laberinto.getCoordenadaFinal().getPosX()-1 && posActual.getPosY()==laberinto.getCoordenadaFinal().getPosY()-1) { // Caso base de la recursividad
			laberinto.addCamino((ArrayList<Coordenada>)camino.clone());
		}
		else{
			
			int posXNueva,posYNueva;
			Coordenada casillaAux;
			
			for(int i=0; i<movimientos.length; i++) { //Itero por cada tipo de movimiento, guardo cada X e Y de acuerdo a cada movimiento posible dentro del cuadrante
				posXNueva= posActual.getPosX() + movimientos[i][0]; 
				posYNueva = posActual.getPosY() + movimientos[i][1];
				casillaAux= laberinto.getCoordenada(posXNueva, posYNueva);
				
				
				switch(i) {//Proceso los movimientos posibles dentro del tablero, de acuerdo al valor de i corresponderá a algun movimiento dentro del array de movimientos
					case 0:
						if(laberinto.arribaDisponible(posActual, casillaAux)) {//si puedo ir para arriba agrego la coordenada al camino y la seteo en visitada
							camino.add(casillaAux);
							posActual.setVisitada(true);
							rellenarCaminos(laberinto, casillaAux, camino); //llamo recursivamente a la funcion de caminos con cada coordenada que agrego
							posActual.setVisitada(false); //A este punto llega en caso de no poder realizar movimientos para alguno de los 4 puntos. Aplico BACKTRACKING, deshaciendo el movimiento
							camino.remove(casillaAux);
						}
					break;
					
					case 1:
						if(laberinto.derechaDisponible(posActual, casillaAux)) { //Idem al el movimiento hacia arriba
							camino.add(casillaAux);
							posActual.setVisitada(true);
							rellenarCaminos(laberinto, casillaAux, camino);
							posActual.setVisitada(false);
							camino.remove(casillaAux);
						}
					break;
	
					case 2:
						if(laberinto.abajoDisponible(posActual, casillaAux)) {
							camino.add(casillaAux);
							posActual.setVisitada(true);
							rellenarCaminos(laberinto, casillaAux, camino);
							posActual.setVisitada(false);
							camino.remove(casillaAux);
						}
						break;
						
					case 3:
						if(laberinto.izquierdaDisponible(posActual, casillaAux)) {
							camino.add(casillaAux);
							posActual.setVisitada(true);
							rellenarCaminos(laberinto, casillaAux, camino);
							posActual.setVisitada(false);
							camino.remove(casillaAux);
						}
					break;
					
				}

			}
		}
		
	}
}

