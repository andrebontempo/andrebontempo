package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome =  entrada.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome =  entrada.nextLine();
		
		
		
		System.out.print(nome + " " + sobrenome);
		entrada.close();
		
	}

}