
public class ProdutosDaLoja {
	public static void main(String[] args) {
		
		Produto cell1 = new Produto();
		
		cell1.nome = "Mi9t";
		cell1.preco = 1950.00;
		cell1.desconto = 0.5;
		
		System.out.println("O celular " + cell1.nome + " que custa: " + cell1.preco +
				" sairá com o desconto de: " + cell1.preco * (1 - cell1.desconto));
		
		
		
		Produto cell2 = new Produto("Note 9s", 1620.00, 0.2);
		double precoFinal = cell2.ProdutoComDesconto();
		System.out.println(cell2.nome);
		
		System.out.println("O celular " + cell2.nome + " no valor de " + cell2.preco
				+ " sairá com desconto de " + precoFinal);
		
		
		
			
		
		
		
		
		
	}

}
