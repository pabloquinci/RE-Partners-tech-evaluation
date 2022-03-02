package problema5;

public class ArbolBinario {
	
	NodoArbol raiz;
	
	
	public NodoArbol getRaiz() {
		return raiz;
	}

	public void setRaiz(NodoArbol raiz) {
		this.raiz = raiz;
	}

	public void inOrden() {
		inOrden(raiz);
	}
	
	private void inOrden(NodoArbol nodo) {
		
		if(nodo==null) {
			return;
		}
		
		inOrden(nodo.getNodoIzquierdo());
		System.out.println(nodo.getValor()+" ");
		inOrden(nodo.getNodoDerecho());
		
	}

}
