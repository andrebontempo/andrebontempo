package fundamentos;

public class Wrapper {
	public static void main(String[] args) {
		
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000;
		Integer ii = Integer.parseInt("1000");
		int p = 2222;
		
		Character c = 'A';
		Boolean bo = true;
		
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(ii);
		System.out.println(bo);
		System.out.println(c);
		System.out.println(b.byteValue());
		
		
		
		String teste = Integer.toString(p);
		String teste1 = ii.toString();
		
		System.out.println("\n\n" +teste);
		System.out.println(teste1);
		
	}

}
