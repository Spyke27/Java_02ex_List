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
		
		for(String name: list) {
			System.out.println(name);
		}
		System.out.println("--------------");
		
		System.out.print("Wich name do you want to delete? -> ");
		String nameToRemove = scan.next();
		list.remove(nameToRemove);
		System.out.println();
		
		for(String name: list) {
			System.out.println(name);
		}
		System.out.println("--------------");

		list.removeIf(x -> x.charAt(0) == 'M');
		
		System.out.println("List without names initiated with 'M':\n");
		for(String name: list) {
			System.out.println(name);
		}
		System.out.println("--------------");
	}

}
