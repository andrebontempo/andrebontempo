package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "André");
		usuarios.put(22, "Nara");
		usuarios.put(333, "Sivuca");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		for(String u: usuarios.values()) {
			System.out.println(u);
		}
			
	}                    
	
}