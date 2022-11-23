package org.generation.italy.christmas;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ex3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Inserisci una parola");
		String parola = scn.nextLine();
		scn.close();
		String[] arrayParola = parola.split("");
		
		Map<String, Integer> arrayP = new TreeMap<String, Integer>();
		
		for (String chr : arrayParola) {
			int occCount = 0;
			if (!arrayP.containsKey(chr)) {
				occCount = 1;
				arrayP.put(chr, occCount);
			} else {
				occCount = arrayP.get(chr) + 1;
				arrayP.put(chr, occCount);
			}
		}

		System.out.println("I caratteri della parola sono:");
		for (String el : arrayP) {
			System.out.println("- " + el);
		}
	}
}
