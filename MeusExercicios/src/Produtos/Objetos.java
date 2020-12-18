package Produtos;

public class Objetos {
	private String nome;
	private int qtd;
	private double valor;
	
	public Objetos(String nome, int qtd, double valor) {
		this.nome = nome;
		this.qtd = qtd;
		this.valor = valor;
	
	}
	
	public String toString() {
		return nome + ", qtd: " + qtd + ", R$: " + valor;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	

}
