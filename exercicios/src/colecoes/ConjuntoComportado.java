package colecoes;

import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		
		//Dados HOMOGÊNEOS
		//Set<String> lista = new HashSet<String>();
		SortedSet<String> lista = new TreeSet<String>();//respeita a ordem de inserção
		
		lista.add("Teste0");
		lista.add("Teste1");
		lista.add("Teste2");
		lista.add("Teste3");
		
		for(String candidato: lista) {
			System.out.println(candidato);
		}
		
		System.out.println("\n>>>");	
		System.out.println(lista);	
		System.out.println(">>>");
	}
	
}
