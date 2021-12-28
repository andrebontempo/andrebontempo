package oo.composicao.desafio;

public class Sistema {
	
	public static void main(String[] args) {
		System.out.println("Iniciando o Sistema!!!");
		
		Cliente c1 = new Cliente("José Uria");
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta",1,100);
		compra1.adicionarItem(new Produto("Notebook",1088),2);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Caderno",10.33,20);
		compra2.adicionarItem(new Produto("Impressora",10.54),1);
		
		c1.adicionarCompra(compra1);
		c1.compras.add(compra2);
		
		
		System.out.println("O total éé: " + c1.obterValorTotal());
		System.out.printf("O total é:  R$%.2f",c1.obterValorTotal());
		
	}

}
