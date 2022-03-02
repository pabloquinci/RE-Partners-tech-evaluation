package problema8;
import java.util.ArrayList;

public class Laberinto {
	
	private Coordenada[][] tablero;
	
	private ArrayList<ArrayList<Coordenada>> caminos;
	
	private Coordenada coordenadaFinal;
	
	
	public Laberinto(Coordenada[][] tablero) {
		this.tablero=tablero;
		caminos=new ArrayList<ArrayList<Coordenada>>();
		setCoordenadaFinal();
	}
	
	
	public boolean proximaDisponible(Coordenada posActual, Coordenada posDestino) {
		if (posDestino!=null && !posDestino.isVisitada()) {
			return posDestino.casillaDisponible();
		}
		
		return false;
	}
	
	
	public Coordenada getCoordenada(int x, int y){
		if(estaEnElLimite(x,y)) {
			return tablero[x][y];
		}
		
		return null;
	}
	
	public boolean estaEnElLimite(int x, int y) {
		return (x>=0 && x< tablero.length) && (y>=0 && y<tablero[0].length);
	}
	
	public void addCamino(ArrayList<Coordenada> camino) {
		if(camino!=null && !camino.isEmpty() ) {
			caminos.add(camino);
		}
	}
	
	public boolean arribaDisponible(Coordenada posActual, Coordenada posDestino) {
		
		if(posDestino!=null && !posDestino.isVisitada() && !posDestino.getContenido().contentEquals("X")) {
			return posActual.arribaDisponible();
		}
		
		return false;
	}
	
	public boolean derechaDisponible(Coordenada posActual, Coordenada posDestino) {
			
			if(posDestino!=null && !posDestino.isVisitada()&&!posDestino.getContenido().contentEquals("X")) {
				return posActual.derechaDisponible();
			}
			
			return false;
		}

	public boolean abajoDisponible(Coordenada posActual, Coordenada posDestino) {
		
		if(posDestino!=null && !posDestino.isVisitada() && !posDestino.getContenido().contentEquals("X")) {
			return posActual.abajoDisponible();
		}
		
		return false;
	}

	public boolean izquierdaDisponible(Coordenada posActual, Coordenada posDestino) {
			
			if(posDestino!=null && !posDestino.isVisitada() && !posDestino.getContenido().contentEquals("X")) {
				return posActual.izquierdaDisponible();
			}
			
			return false;
		}

	
	public void mostrarCaminos() {
		int i=1;
		
		for(ArrayList<Coordenada> camino: caminos) {
			System.out.println("Camino: " + i);
			
			for(Coordenada c : camino) {
				System.out.print("X: "+c.getPosX()+" ");
				System.out.println("Y: "+c.getPosY());
			}
			i++;
		}
	}


	public Coordenada[][] getTablero() {
		return tablero;
	}


	public void setTablero(Coordenada[][] tablero) {
		this.tablero = tablero;
	}


	public ArrayList<ArrayList<Coordenada>> getCaminos() {
		return caminos;
	}


	public void setCaminos(ArrayList<ArrayList<Coordenada>> caminos) {
		this.caminos = caminos;
	}
	
	
	public void setCoordenadaFinal() {
		this.coordenadaFinal= new Coordenada(tablero.length,tablero[0].length, new boolean[]{true,false,false,true},true,"");
		
	}


	public Coordenada getCoordenadaFinal() {
		return coordenadaFinal;
	}


	public void setCoordenadaFinal(Coordenada coordenadaFinal) {
		this.coordenadaFinal = coordenadaFinal;
	}
	
	
	
}
