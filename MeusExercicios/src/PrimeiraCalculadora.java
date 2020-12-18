import java.util.Scanner;

public class PrimeiraCalculadora {

	private static int primeiroValor;
	private static int segundoValor;
	private static int operação;

	public static void main(String[] args) {
		menu();

	}

	public static void menu() {

		Scanner entradaUsuario = new Scanner(System.in);

		System.out.println("Digite a operação desejada: ");
		System.out.println("1 - Soma ");
		System.out.println("2 - Divisão");
		System.out.println("3 - Subtração");
		System.out.println("4 - Multiplicação");
		System.out.println("5 - Sair");

		operação = entradaUsuario.nextInt();
		
        if (operação != 5) {
		System.out.println("Digite o primeiro valor: ");
		primeiroValor = entradaUsuario.nextInt();

		System.out.println("Digite o segundo valor: ");
		segundoValor = entradaUsuario.nextInt();
		}

		if (operação == 1) {
			soma();
		}
		if (operação == 2) {
			divisão();
		}
		if (operação == 3) {
			subtração();
		}
		if (operação == 4) {
			multiplicação();
		}
		if (operação == 5) {
			entradaUsuario.close();
			System.exit(0);

		}

	}

	public static void soma() {

		int resultado = primeiroValor + segundoValor;
		System.out.println("O Resultado da soma é: " + resultado);

		menu();

	}

	public static void divisão() {

		int resultado = primeiroValor / segundoValor;
		System.out.println("O Resultado da divisão é: " + resultado);

		menu();

	}

	public static void subtração() {

		int resultado = primeiroValor - segundoValor;
		System.out.println("O Resultado da subtração é: " + resultado);

		menu();
	}

	public static void multiplicação() {

		int resultado = primeiroValor * segundoValor;
		System.out.println("O Resultado da multiplicação é: " + resultado);

		menu();

	}

}
