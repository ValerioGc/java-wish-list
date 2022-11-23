package org.generation.italy.christmas;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Inserisci una parola");
		String parola = scn.nextLine();
		
		String[] arrayParola = parola.split("");
		
		List <String> charlist = new LinkedList<>();

		for (int i = 0; i < arrayParola.length; i++ ) {		
			String actualChar = arrayParola[i];
			
			if (!charlist.contains(actualChar)) {
				charlist.add(actualChar);
			}
		}
		charlist.sort(null);
		// Output
		System.out.println("I caratteri della parola sono:");
		for (String el : charlist) {
			System.out.println("- " + el);
		}
	}
}
