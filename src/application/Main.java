package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Dont acept primitives types
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Joao");
		list.add("Ronaldo");
		list.add("Neymar");
		
		for(String nome: list) {
			System.out.println(nome);
		}
		System.out.println();
		
		System.out.print("Digite o nome que deseja deletar: ");
		String nomeToRemove = scan.next();
		list.remove(nomeToRemove);
		System.out.println();
		
		for(String nome: list) {
			System.out.println(nome);
		}

	}

}
