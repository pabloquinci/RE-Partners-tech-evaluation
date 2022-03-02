package problema4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindromo {
	public static boolean esPalindromo(String palabra) {
		boolean esPalindromo=false;
		
		Queue<Character> cola1 = new LinkedList<Character>();
		for (char c : palabra.toLowerCase().toCharArray()) {
		    cola1.offer(c);
		}
		
		Stack<Character> pila=new Stack();
		for (char c : palabra.toLowerCase().toCharArray()) {
		    pila.push(c);
		}
		
		int mitad= palabra.length()/2==0 ?palabra.length()/2 :palabra.length()/2+1;
		int i=0;
		
		while(cola1.size()!=0 &&pila.size()!=0 && cola1.peek()==pila.peek()) {
			cola1.remove();
			pila.pop();
			i++;
		}
		
		if(cola1.size()==0 && pila.size()==0) {
			esPalindromo=true;
		}
		
		return esPalindromo;
	}
}
