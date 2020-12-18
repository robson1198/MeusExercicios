import java.util.Scanner;

public class ExercicioMdl4e1 {
	public static int valor;

	public static void main(String[] args) {
		operação();

	}

	public static void operação() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um valor entre 0 e 10: ");

		valor = entrada.nextInt();

		if (valor >= 0 && valor <= 10) {
			parOuImpar();

		} else {
			System.out.println("Numero incorreto!\nDigite novamente: ");
			operação();
		}

		entrada.close();

	}

	public static void parOuImpar() {

		if (valor % 2 == 0) {
			System.out.println("O valor digitado é par.");

		} else
			System.out.println("O valor digitado é impar.");

	}

}
