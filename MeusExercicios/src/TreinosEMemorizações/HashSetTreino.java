package TreinosEMemorizações;

import java.util.SortedSet;
import java.util.TreeSet;

public class HashSetTreino {
	public static void main(String[] args) {
		
		SortedSet<String> pessoas = new TreeSet<>();
		
		pessoas.add("Marcos");
		pessoas.add("Rafael");
		pessoas.add("Junior");
		pessoas.add("Matheus");
		pessoas.add("Luan");
		pessoas.add("Vinicius");
		pessoas.add("Joao");
		pessoas.add("Wagner");
		pessoas.add("James");
		pessoas.add("Miguel");
		
		System.out.println("Lista atual de candidatos: ");
		for(String loop1a1: pessoas) {
			System.out.println(loop1a1);
			
		}
		
		
		
	}

}
