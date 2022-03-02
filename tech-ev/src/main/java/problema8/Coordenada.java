package problema8;
import java.util.ArrayList;
import java.util.List;

public class Coordenada {
	
	private int posX;
	private int posY;
	private boolean visitada;
	private boolean fin;
	private String contenido;
	private boolean paso[];
	
	public Coordenada(int x, int y, boolean[] paso, boolean fin,String contenido) {
		this.posX=x;
		this.posY=y;
		this.visitada=false;
		this.paso=paso;
		this.fin=false;
		this.contenido=contenido;
	}


	public String getContenido() {
		return contenido;
	}


	public void setContenido(String contenido) {
		this.contenido = contenido;
	}


	public boolean isFin() {
		return fin;
	}
	
	public boolean arribaDisponible() {
		return paso[0];
	}
	
	public boolean derechaDisponible() {
		return paso[1];
	}
	
	public boolean abajoDisponible() {
		return paso[2];
	}
	
	public boolean izquierdaDisponible() {
		return paso[3];
	}


	public void setFin(boolean fin) {
		this.fin = fin;
	}


	
	public boolean casillaDisponible() {
		return !contenido.contentEquals("X");
	}


	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int poxY) {
		this.posY = poxY;
	}

	public boolean isVisitada() {
		return visitada;
	}

	public void setVisitada(boolean visitada) {
		this.visitada = visitada;
	}
	
	

}
