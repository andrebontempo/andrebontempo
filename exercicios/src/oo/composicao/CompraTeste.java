package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		
		compra1.cliente = "José Pereira";
		
		compra1.itens.add(new Item("Caneta", 10, 20.5));
		compra1.itens.add(new Item("Borracha", 3, 7.5));
		compra1.itens.add(new Item("Caderno", 2, 10.5));
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.obterValorTotal());
		
		System.out.println("****************************");
		System.out.println("Comprador " + compra1.cliente);
		System.out.println(compra1.itens);
		
	}
	
}
