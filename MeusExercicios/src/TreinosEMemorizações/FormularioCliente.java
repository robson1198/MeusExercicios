package TreinosEMemorizações;

import java.util.Scanner;

public class FormularioCliente {

	public static void main(String[] args) {
		menu();

	}

	public static void menu() {

		System.out.println("Formulario de Candidato");

		System.out.println("Digite suas informações pessoais: ");

		Scanner entrada = new Scanner(System.in);

		System.out.println("Nome: ");
		String nome = entrada.next();

		System.out.println("RG: ");
		String rg = entrada.next();

		System.out.println("CPF: ");
		String cpf = entrada.next();

		System.out.println("Data de nascimento: ");
		String data = entrada.next();

		System.out.println("Idade: ");
		int idade = entrada.nextInt();

		System.out.println("Candidato Nº1. \nNome: " + nome + "\nRG: " + rg + "\nCPF: " + cpf + "\nData: " + data
				+ "\nIdade: " + idade);

		System.out.println("As informações estão corretas?");
		System.out.println("Digite 1(SIM) 2(NÃO): ");

		int operação = entrada.nextInt();

		if (operação == 2) {
			menu();
		}

		entrada.close();

	}

}
