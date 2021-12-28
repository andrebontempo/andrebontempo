package oo.composicao;

public class Item {

	String nome;
	int quantidade;
	double preco;
	
	Item(String nome, int quantidade, double preco){
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Item Nome= " + nome + "\n" + "Quantidade= " + quantidade + "\n" + "Preco= " + preco+ "\n";
	}

	
}
