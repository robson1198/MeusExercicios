import java.util.Scanner;

public class ProjetoShopping {

	private static int loja;
	private static double valorEmCaixa;
	private static int escolha;

	public static void main(String[] args) {
		lojas();

	}

	public static void lojas() {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Bem vindo!\nEscolha sua loja: ");
		System.out.println("01 Americanas.\n02 Ponto Frio.\n03 Casas BH.\n04 Samsung.");
		loja = entrada.nextInt();

		switch (loja) {
		case 01:
			americanas();
			break;
		case 02:
			pontoFrio();
			break;
		case 03:
			casasBH();
			break;
		case 04:
			samsung();
		default:
			lojas();

		}
		entrada.close();
	}

	public static void americanas() {
		// Produtos:
		ProdutosLojas l1 = new ProdutosLojas();
		l1.nome = "Bola";
		l1.descrição = "Edição especial da copa!";
		l1.valor = 151.30;

		ProdutosLojas l2 = new ProdutosLojas();
		l2.nome = "Facão";
		l2.descrição = "Tramontina...";
		l2.valor = 27.99;

		ProdutosLojas l3 = new ProdutosLojas();
		l3.nome = "Lacta Branco";
		l3.descrição = "Chocolate branco puro.";
		l3.valor = 4.99;

		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Quanto você tem disponivel para gastar nesta loja?");
		valorEmCaixa = entrada2.nextDouble();

		System.out.println("Escolha seu produto:\n01 - Bola\n02 - Facão\n03 - Lacta Branco");
		escolha = entrada2.nextInt();

		if (escolha >= 01 && escolha <= 03) {
			switch (escolha) {
			case 01:
				if (valorEmCaixa >= 151.30) {
					System.out.println(l1.nome + ".\n" + l1.descrição + "\nNo valor de: " + l1.valor + "R$");
				} else {
					System.out.println("Valor insuficiente para adquirir o produto.");
					americanas();
				}
				break;
			case 02:
				if (valorEmCaixa >= 27.99) {
					System.out.println(l2.nome + ".\n" + l2.descrição + "\nNo valor de: " + l2.valor + "R$");
				} else {
					System.out.println("Valor insuficiente para adquirir o produto.");
					americanas();
				}
				break;
			case 03:
				if (valorEmCaixa >= 4.99) {
					System.out.println(l3.nome + ".\n" + l3.descrição + "\nNo valor de: " + l3.valor + "R$");
				} else {
					System.out.println("Valor insuficiente para adquirir o produto.");
					americanas();
				}
				break;

			}
		} else {
			System.out.println("Opção de escolha inexistente!");
			americanas();
		}

		entrada2.close();

	}

	public static void pontoFrio() {
		// Produtos
		ProdutosLojas l4 = new ProdutosLojas();
		l4.nome = "TV";
		l4.descrição = "60pl 4K";
		l4.valor = 6059.32;

		ProdutosLojas l5 = new ProdutosLojas();
		l5.nome = "Geladeira Electrolux";
		l5.descrição = "Frost Free branca";
		l5.valor = 1099.00;

		ProdutosLojas l6 = new ProdutosLojas();
		l6.nome = "Fogão";
		l6.descrição = "4 Bocas da ESMALTEC";
		l6.valor = 501.44;

		Scanner entrada3 = new Scanner(System.in);
		System.out.println("Quanto você tem disponivel para gastar nesta loja?");

		valorEmCaixa = entrada3.nextDouble();

		System.out.println("Escolha seu produto:\n01 - TV\n02 - Geladeira\n03 - Fogão");
		escolha = entrada3.nextInt();
		if (escolha >= 01 && escolha <= 03) {
			switch (escolha) {
			case 01:
				if (valorEmCaixa >= 6059.32) {
					System.out.println(l4.nome + ".\n" + l4.descrição + "\nNo valor de: " + l4.valor + "R$");
				} else {
					System.out.println("Valor insuficiente para adquirir o produto.");
					pontoFrio();
				}
				break;
			case 02:
				if (valorEmCaixa >= 1099.00) {
					System.out.println(l5.nome + ".\n" + l5.descrição + "\nNo valor de: " + l5.valor + "R$");
				} else {
					System.out.println("Valor insuficiente para adquirir o produto.");
					pontoFrio();
				}
				break;
			case 03:
				if (valorEmCaixa >= 501.44) {
					System.out.println(l6.nome + ".\n" + l6.descrição + "\nNo valor de: " + l6.valor + "R$");
				} else {
					System.out.println("Valor insuficiente para adquirir o produto.");
					pontoFrio();
				}
				break;
			}
		} else {
			System.out.println("Opção de escolha inexistente!");
			pontoFrio();
		}

		entrada3.close();

	}

	public static void casasBH() {
		// Produtos
		ProdutosLojas l7 = new ProdutosLojas();
		l7.nome = "Cama de casal";
		l7.descrição = "Cama box de boa qualidade";
		l7.valor = 1200.99;

		ProdutosLojas l8 = new ProdutosLojas();
		l8.nome = "Guarda Roupa";
		l8.descrição = "Material mdf simples";
		l8.valor = 450.00;

		ProdutosLojas l9 = new ProdutosLojas();
		l9.nome = "Sofa";
		l9.descrição = "Três Lugares!";
		l9.valor = 299.99;

		Scanner entrada4 = new Scanner(System.in);
		System.out.println("Quanto você tem disponivel para gastar nesta loja?");

		valorEmCaixa = entrada4.nextDouble();

		System.out.println("Escolha seu produto:\n01 - Cama de casal\n02 - Guarda roupa\n03 - Sofa");
		escolha = entrada4.nextInt();

		if (escolha >= 01 && escolha <= 03) {
			switch (escolha) {
			case 01:
				if (valorEmCaixa >= 1200.99) {
					System.out.println(l7.nome + ".\n" + l7.descrição + "\nNo valor de: " + l7.valor + "R$");
				} else {
					System.out.println("Valor insuficiente para adquirir o produto.");
					casasBH();
				}
				break;
			case 02:
				if (valorEmCaixa >= 450.00) {
					System.out.println(l8.nome + ".\n" + l8.descrição + "\nNo valor de: " + l8.valor + "R$");
				} else {
					System.out.println("Valor insuficiente para adquirir o produto.");
					casasBH();
				}
				break;
			case 03:
				if (valorEmCaixa >= 299.99) {
					System.out.println(l9.nome + ".\n" + l9.descrição + "\nNo valor de: " + l9.valor + "R$");
				} else {
					System.out.println("Valor insuficiente para adquirir o produto.");
					casasBH();
				}
				break;
			}
		} else {
			System.out.println("Opção de escolha inexistente!");
			casasBH();
		}

		entrada4.close();

	}

	public static void samsung() {
		// Produtos
		ProdutosLojas l10 = new ProdutosLojas();
		l10.nome = "Galaxy Note 10";
		l10.descrição = "É melhor comprar um xiaomi...";
		l10.valor = 4000.23;

		ProdutosLojas l11 = new ProdutosLojas();
		l11.nome = "Fone Bluetooth";
		l11.descrição = "Modelo Basico";
		l11.valor = 40.12;

		Scanner entrada5 = new Scanner(System.in);
		System.out.println("Quanto você tem disponivel para gastar nesta loja?");

		valorEmCaixa = entrada5.nextDouble();
		System.out.println("Escolha seu produto:\n01 - Galaxy Note10\n02 - Fone Bluetooth");
		escolha = entrada5.nextInt();

		if (escolha >= 01 && escolha <= 02) {
			switch (escolha) {
			case 01:
				if (valorEmCaixa >= 4000.23) {
					System.out.println(l10.nome + ".\n" + l10.descrição + "\nNo valor de: " + l10.valor + "R$");
				} else {
					System.out.println("Valor insuficiente para adquirir o produto.");
					samsung();

				}
				break;
			case 02:
				if (valorEmCaixa >= 40.12) {
					System.out.println(l11.nome + ".\n" + l11.descrição + "\nNo valor de: " + l11.valor + "R$");
				} else {
					System.out.println("Valor insuficiente para adquirir o produto.");
					samsung();

				}
				break;

			}
		}else {
			System.out.println("Opção de escolha inexistente!");
			samsung();
		}

		entrada5.close();

	}
}
