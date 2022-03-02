import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import org.w3c.dom.Node;

import problema1.ElementoMayor;
import problema2.ListarRangosConsecutivos;
import problema3.Lista;
import problema4.Palindromo;
import problema5.ArbolBinario;
import problema5.NodoArbol;
import problema6.ArchivoConNovedades;
import problema7.TotalVentasPorVendedor;
import problema8.Coordenada;
import problema8.EncontrarCamino;
import problema8.Laberinto;


public class EvTecnicaApp{
	
	
	public static void main(String[] args) {
			
		//PRUEBA 1
		int [] numeros={5,8,0,-10,44,89,1,3,7,77,12,-3 };
		int mayor=ElementoMayor.encontrarMayor(numeros);
		System.out.println("Elemento mayor de la lista: "+mayor);
		System.out.println(" ");

		int[] numeros2= {6,7,5,4,3,1,2,3,5,6,7,9,0,0,1,2,4,1,2,3,5,1,2};
		
		//PRUEBA 2
		int numeroSuma=13;

		List<problema2.Rango> rangos=ListarRangosConsecutivos.encontrarConsecutivos(numeros2,numeroSuma);
		ListarRangosConsecutivos.mostrarRangos(rangos,numeroSuma);
		
		
		//PRUEBA 3
		Nodo nodo1=new Nodo(1);
		Nodo nodo2=new Nodo(3);
		Nodo nodo3=new Nodo(6);
		
		Lista lista=new Lista();
		lista.insert(1);
		lista.insert(3);
		lista.insert(6);
		
		System.out.println("La lista enlazada es de tamaño: "+lista.getTamanioLista());
		System.out.println(" ");

		//PRUEBA 4
		
		String palabra="NEUQUEN";
		String mensajeSalida=Palindromo.esPalindromo(palabra) ? palabra+" Es palindromo" : palabra+" no es palindromo";
		System.out.println(mensajeSalida);
		System.out.println(" ");

		//PRUEBA 5 
		
		//Creo un arbol con raiz y la seteo
		ArbolBinario arbol= new ArbolBinario();
		NodoArbol raiz= new NodoArbol(17);
		arbol.setRaiz(raiz);
		
		//Genero un ejemplo de arbol primero con las ramas izquierdas de la raiz y luego las derechas

		arbol.getRaiz().setNodoIzquierdo(new NodoArbol(9));
		arbol.getRaiz().getNodoIzquierdo().setNodoIzquierdo(new NodoArbol(6));
		arbol.getRaiz().getNodoIzquierdo().getNodoIzquierdo().setNodoIzquierdo(new NodoArbol(1));
		arbol.getRaiz().getNodoIzquierdo().getNodoIzquierdo().setNodoDerecho(new NodoArbol(7));
		
		arbol.getRaiz().setNodoDerecho(new NodoArbol(10));
		arbol.getRaiz().getNodoDerecho().setNodoDerecho(new NodoArbol(21));
		
		//Muestro el arbol con el recorrido InOrden, que es la forma de recorrer primero los subarboles izquierdos, luego la raiz, y luego los subarboles derechos
		System.out.println("Arbol binario: ");
		arbol.inOrden();

		//PRUEBA 6
	
		File archivo1=new File("Actual.txt");
		File archivo2=new File("Cambios.txt");
		
		ArchivoConNovedades.aparearArchivosNovedadesCambios(archivo1, archivo2);
		
		
		
		//PRUEBA 7
		
		File archivo3=new File("Entrada.txt");
		
		List<problema7.EntradaCantidadVentas> listaCantidades=TotalVentasPorVendedor.crearArchivoSalidaConTotales(archivo3);
		TotalVentasPorVendedor.grabarArchivoSalida("Entrada.txt",listaCantidades);
		
		
		//8
		
		ArrayList<Coordenada> camino= new ArrayList<Coordenada>();
		problema8.Laberinto laberinto= new problema8.Laberinto(Utils.tablero5x4);
		camino.add(Utils.tablero5x4[0][0]);
		EncontrarCamino.rellenarCaminos(laberinto, Utils.tablero5x4[0][0],camino);

		if(laberinto.getCaminos().size()!=0) {
			laberinto.mostrarCaminos();

		}else System.out.println("No existen caminos");
	}

	
}

	