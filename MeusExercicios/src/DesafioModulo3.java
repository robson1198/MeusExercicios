import java.util.Scanner;

public class DesafioModulo3 {

	public static double primeiroN;
	public static double segundoN;

	public static void main(String[] args) {
		introdução();

	}

	public static void introdução() {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Bem vindo a calculadora digital!");
		System.out.println("Digite o primeiro numero: ");

		primeiroN = entrada.nextDouble();
		System.out.println("Digite o segundo numero: ");
		segundoN = entrada.nextDouble();

		System.out.println("Digite a operação desejada: ");
		System.out.print("01 - Adição, 02 - Subtração, 03 - Divisão, 04 Multiplicação.");
		int operação = entrada.nextInt();

		if (operação == 01) {
			adição();

		} else if (operação == 02) {
			subtração();

		} else if (operação == 03) {
			divisão();

		} else if (operação == 04) {
			multiplicação();
		}

		entrada.close();
	}

	public static void adição() {
		double resultado = primeiroN + segundoN;
		System.out.println("O resultado da operação é: " + resultado);

	}

	public static void subtração() {
		double resultado = primeiroN - segundoN;
		System.out.println("O resultado da operação é: " + resultado);

	}

	public static void divisão() {
		double resultado = primeiroN / segundoN;
		System.out.println("O resultado da operação é: " + resultado);

	}

	public static void multiplicação() {
		double resultado = primeiroN * segundoN;
		System.out.println("O resultado da operação é: " + resultado);

	}

}
