package problema5;

public class NodoArbol {
	private int valor;
	private NodoArbol nodoIzquierdo;
	private NodoArbol nodoDerecho;
	public NodoArbol(int valor) {
		this.valor=valor;
		this.nodoDerecho=null;
		this.nodoIzquierdo=null;
		
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public NodoArbol getNodoIzquierdo() {
		return nodoIzquierdo;
	}
	public void setNodoIzquierdo(NodoArbol nodoIzquierdo) {
		this.nodoIzquierdo = nodoIzquierdo;
	}
	public NodoArbol getNodoDerecho() {
		return nodoDerecho;
	}
	public void setNodoDerecho(NodoArbol nodoDerecho) {
		this.nodoDerecho = nodoDerecho;
	}

}
