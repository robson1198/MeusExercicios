package Array;
public class ArrayTreinosJaFeitosDefinitivo {
	public static void main(String[] args) {
		
		//TUDO SOBRE TREINOS DE ARRAY DEFINITIVO!
		
		int[] notasInteiras = new int[5];
		
		notasInteiras[0] = 2;
		notasInteiras[1] = 4;
		notasInteiras[2] = 6;
		notasInteiras[3] = 8;
		notasInteiras[4] = 10;
		
		System.out.println(notasInteiras[3]);
		
		int totalGeral = 0;
		for(int laço = 0; laço < notasInteiras.length; laço++) {
			totalGeral += notasInteiras[laço];
		}
		
		System.out.println(totalGeral / notasInteiras.length);
		
		System.out.println();
		int[] arrayAr = new int [10];
		
		arrayAr[0] = 123;
		arrayAr[1] = 1232;
		arrayAr[2] = 1230;
		arrayAr[3] = 456;
		arrayAr[4] = 4543;
		arrayAr[5] = 34;
		arrayAr[6] = 764;
		arrayAr[7] = 321;
		arrayAr[8] = 777;
		arrayAr[9] = 1;
		
		System.out.println(arrayAr[3]);
		
		for(int i = 0; i < arrayAr.length; i++) {
			System.out.println(arrayAr[i]);
		}
		
	}
	
////static int Soluçãoprimaria (int a, int b) {
////return a + b;
////}
////
//public static void main(String[] args) {
////Scanner s = new Scanner(System.in);
////int e1 = s.nextInt();
////int e2 = s.nextInt();
////int sum;
////sum = Soluçãoprimaria(e1, e2);
////
////System.out.println(sum);
////
////s.close();
//
////int[] Array = new int[5];
////
////Array[0] = 10;
////Array[1] = 134;
////Array[2] = 1;
////Array[3] = 132;
////Array[4] = 340;
////
////int soma = 0;
////
////for (int i = 0; i < Array.length; i++) {
////	soma += Array[i];
////}
////System.out.println("A soma é: " + soma);
//maisUmArray();
//
//}
//
//public static void maisUmArray() {
////Scanner sc = new Scanner(System.in);
////System.out.println("tamanho do array: ");
////int tamanho = sc.nextInt();
////int [] array2 = new int [tamanho];
////
////System.out.println("Atribua os valores ao array: ");
////
////
////for(int z = 0; z < array2.length; z++) {
////System.out.println("informe o numero: " + (z + 1)+ ": ");
////array2[z] = sc.nextInt();
////}
////sc.close();
////
//int [][] matriz = new int [5][5];
//
//matriz [0][0] = 3; matriz[0][1] = 13; matriz[0][2] = 32;  matriz[0][3] = 564;  matriz[0][4] = 500;
// matriz[1][0] = 999;  matriz[2][0] = 888;  matriz[3][0] = 432;  matriz[4][0] = 5564;
//
//
//
//}
//}

//	public static void main(String[] args) {
//		Scanner entrada = new Scanner(System.in);
//
//		System.out.println("Digite o total de valores (Maximo 5): ");
//
//		int entradaDeNotas = entrada.nextInt();
//
//		int[] array1 = new int[entradaDeNotas];
//		//int agregaResultado;
//
//		for (int laço = 0; laço < array1.length; laço++) {
//			System.out.println("informe o numero " + (laço + 1) + ": ");
//			array1[laço] = entrada.nextInt();
//
//			//agregaResultado = array1[laço];
//
//			//System.out.println(agregaResultado + "[ ]");
//
//		}
//
//		entrada.close();
//		// if() {


}
