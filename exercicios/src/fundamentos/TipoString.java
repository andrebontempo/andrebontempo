package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		
		System.out.println("Olá Pessoal".charAt(2));
		
		String s = "Boa Tarde";
		
		
		System.out.println(s);
		System.out.println(s.concat("!!!!"));
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.length());
		System.out.println(s.equalsIgnoreCase ("boa tarde"));
		
		var nome = "André";
		var sobrenome = "Bontempo";	
		var idade = 52;
		var salario = 4_551_572.22;
		
		System.out.printf("O Senhor %s %s \ntem %d anos \ne ganha R$%.2f",nome,sobrenome,idade,salario);
		System.out.println("\n");
		
		String frase = String.format("O Senhor %s %s \ntem %d anos \ne ganha R$%.2f",nome,sobrenome,idade,salario);
		System.out.println(frase);
	}

 	}
