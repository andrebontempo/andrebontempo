package colecoes;

import java.util.ArrayList;

public class Lista {
	
	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		
		
		Usuario u1 = new Usuario("José Uria");
		
		lista.add(u1);
		lista.add(new Usuario("André"));
		lista.add(new Usuario("Luli"));
		lista.add(new Usuario("Nara"));
		lista.add(new Usuario("Alcinara"));
		
		
		System.out.println(lista.get(3));
		System.out.println(lista.get(3).nome + " !!\n");
		System.out.println("*****************************");
		
		for(Usuario user: lista) {
			System.out.println(user.nome);
		}
		
		//System.out.println(lista.remove(4));
		System.out.println("*****************************");
		System.out.println(lista);
	
	}
	
	

}
