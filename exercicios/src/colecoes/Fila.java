package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Ana"); //retorna falso
		fila.offer("Júlio"); //lança uma exceçao
		fila.offer("Daniel");
		fila.offer("Rafaela");
		
		
		System.out.println(fila.peek());//retorna falso
		System.out.println(fila.peek());
		System.out.println(fila.element());//lança uma exceçao
		System.out.println(fila.element());
		
		System.out.println(fila);
		
		//fila.size();
		//fila.clear();
		
//		System.out.println(fila.poll());
//		System.out.println(fila.remove());
//		System.out.println(fila.poll());
//		System.out.println(fila.poll());
//		System.out.println(fila.remove());
//		System.out.println(fila.poll());
	}
	

}
