package org.generation.italy.christmas;

import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Inserisci una parola");
		String parola = scn.nextLine();
		
		char[] ArrayParola = parola.toCharArray();
		
		System.out.println("I caratteri della parola sono:");
		
		for (int i = 0; i < ArrayParola.length; i++ ) {
			System.out.println("-" + ArrayParola[i]);
		}
	}
}
