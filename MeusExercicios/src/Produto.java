
public class Produto {
	
	String nome;
	double preco;
	double desconto;
	
	Produto() {
		
	}
	
	double ProdutoComDesconto() {
		return preco * (1 - desconto);
		
	}
	
	Produto(String nomeInicial, double precoInicial, double descontoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
		desconto = descontoInicial;
		
	}
	

}


