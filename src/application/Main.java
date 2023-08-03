package application;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		//Dont acept primitives types
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Joao");
		list.add("Ronaldo");
		list.add("Neymar");
		
		for(String nome: list) {
			System.out.println(nome);
		}

	}

}
