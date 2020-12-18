package TreinosEMemorizações;

import java.util.Scanner;

public class DuvidasScannerReslovidas {
	public static void main(String[] args) {

		// Como abrir o Scanner:

		Scanner nome = new Scanner(System.in);

		// Apos abrir o scanner, precisa associar ele a algo:
		System.out.println("Resolveu sua duvida?: ");
		//O syso... vem antes do "nome".nextLine();

		String nome1 = nome.nextLine();
		
		//Para mostrar o resultado do digitado no scanner:
		System.out.println(nome1);

		// Como fechar o scanner:

		nome.close();

	}

}
