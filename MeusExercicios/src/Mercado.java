import java.util.Scanner;

import Produtos.Objetos;

public class Mercado {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		// Projeto mercado!

		System.out.println("Bem vindo ao mercado!");
		System.out.println("Selecione seu corredor:/n 1 = doces, 2 = bebidas 3 = limpeza.");
		int select = entrada.nextInt();

		switch (select) {
		case 01:
			doces();
			break;
		case 02:
			bebidas();
			break;
		case 03:
			limpeza();
			break;
		default:
			main(args);
		}
		entrada.close();

	}

	public static void doces() {

		Objetos[] corredorDoces = new Objetos[10];

		System.out.println("Quantos itens serão adicionados ao corredor de doces? ");
		int totalItens = entrada.nextInt();

		for (int i = 0; i < totalItens; i++) {
			System.out.println("Item #" + (i + 1) + ":");
			String nome = entrada.next();
			System.out.println();
			System.out.println("Quantidade: ");
			int qtd = entrada.nextInt();
			System.out.println("Valor: ");
			double valor = entrada.nextDouble();
			System.out.println();
			System.out.println("posição no vetor: ");
			int posicao = entrada.nextInt();
			corredorDoces[posicao] = new Objetos(nome, qtd, valor);

		}
		System.out.println("itens no corredor: ");

		for (int i = 0; i < 10; i++) {
			if (corredorDoces[i] != null) {
				System.out.println(i + ": " + corredorDoces[i]);
			}
		}

	}

	public static void bebidas() {
		Objetos[] corredorBebidas = new Objetos[10];

		System.out.println("Quantos itens serão adicionados ao corredor de Bebidas? ");
		int totalItens = entrada.nextInt();

		for (int i = 0; i < totalItens; i++) {
			System.out.println("Item #" + (i + 1) + ":");
			String nome = entrada.next();
			System.out.println();
			System.out.println("Quantidade: ");
			int qtd = entrada.nextInt();
			System.out.println("Valor: ");
			double valor = entrada.nextDouble();
			System.out.println();
			System.out.println("posição no vetor: ");
			int posicao = entrada.nextInt();
			corredorBebidas[posicao] = new Objetos(nome, qtd, valor);

		}
		System.out.println("itens no corredor: ");

		for (int i = 0; i < 10; i++) {
			if (corredorBebidas[i] != null) {
				System.out.println(i + ": " + corredorBebidas[i]);
			}
		}

	}

	public static void limpeza() {
		Objetos[] corredorLimpeza = new Objetos[10];
		
		System.out.println("Quantos itens serão adicionados ao corredor de Limpeza? ");
		int totalItens = entrada.nextInt();

		for (int i = 0; i < totalItens; i++) {
			System.out.println("Item #" + (i + 1) + ":");
			String nome = entrada.next();
			System.out.println();
			System.out.println("Quantidade: ");
			int qtd = entrada.nextInt();
			System.out.println("Valor: ");
			double valor = entrada.nextDouble();
			System.out.println();
			System.out.println("posição no vetor: ");
			int posicao = entrada.nextInt();
			corredorLimpeza[posicao] = new Objetos(nome, qtd, valor);

		}
		System.out.println("itens no corredor: ");

		for (int i = 0; i < 10; i++) {
			if (corredorLimpeza[i] != null) {
				System.out.println(i + ": " + corredorLimpeza[i]);
			}}

	}

}
