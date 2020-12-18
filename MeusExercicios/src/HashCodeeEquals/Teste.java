package HashCodeeEquals;

import java.util.HashMap;

public abstract class Teste{

	public static void main(String[] args) {

		Congressista con1 = new Congressista("Tiago", 1234567);
		Congressista con2 = new Congressista("Caio", 76543221);

		HashMap<Congressista,String> hash = new HashMap<Congressista,String>();

		// Inserção dos congressistas no HashMap
		hash.put(con1, "Info importante sobre Tiago");
		hash.put(con2, "Info importante sobr Caio");

		/*
		 * Criaremos um terceiro congressista e iremos efetuar uma busca
		 * para ver se o algoritimo está, de fato, funcionando.
		 * Não será encontrado o objeto porque Primeiro: não o inserimos no HashMap
		 * Segundo: o tamanho do nome não bate com nenhum tamanho de nome inserido.
		 */

		Congressista con3 = new Congressista("Felipe", 123123123);

		System.out.println(hash.containsKey(con3)); // False

		/*
		 *  Aqui iremos procurar por um nome que coincida com o valor de algum
		 *  que ja esteja cadastrado, Mas - muito importante - não bate com o nome
		 *  do congresissta que está lá. Por isto é importante a implementação do
		 *  método equals()
		 */

		Congressista con4 = new Congressista("Livia", 54545432);

		System.out.println(hash.containsKey(con4)); // Falso!

		/*
		 *  Por fim, iremos pesquisar por um objeto que já existe e exibir suas info.
		 */

		String info = hash.get(con1); // retornará o valor atribuído ao objeto no Mapa
		System.out.println(info);

		info = hash.get(con2);
		System.out.println(info);

	}

}
