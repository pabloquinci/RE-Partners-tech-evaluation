package problema3;

public class Lista {
	private Nodo inicio;
	private Nodo fin;
	
	public Lista() {
        inicio=fin=null;
	}
	
	 public Nodo getInicio() {
		return inicio;
	}


	public void setInicio(Nodo inicio) {
		this.inicio = inicio;
	}



	public Nodo getFin() {
		return fin;
	}

	public void setFin(Nodo fin) {
		this.fin = fin;
	}


	public void insert(int dato){
	        Nodo nodoNuevo=new Nodo(dato);
	        if(inicio==null && fin==null){
	            inicio=nodoNuevo;
	            fin=nodoNuevo;
	        }
	        else{
	            fin.setNext(nodoNuevo);
	            nodoNuevo.setPrevious(fin);
	        }
	        fin=nodoNuevo;
	 }
	
	public int getTamanioLista() {
		int tamanio=0;
		if(inicio==null && fin==null){
			return tamanio;
			
        }else if(inicio==fin) {
        	return tamanio+1;
        }
		
		Nodo auxiliar=inicio;
		while(auxiliar!=null) {
			tamanio++;
			auxiliar=auxiliar.getNext();
		}
		
		return tamanio;
		
	}

}
