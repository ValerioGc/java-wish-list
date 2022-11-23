package org.generation.italy.christmas;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static class StringComparator implements Comparator<String> {
		@Override
		public int compare(String o1, String o2) {
			int counterVocalsIn = 0;
			int counterVocals = 0;
			// Contatore Vocali 2
			for (int x = 0; x < o1.length();x++) {					
				if (o1.charAt(x) == 'a' || o1.charAt(x) == 'o' || o1.charAt(x) == 'u') {
					counterVocalsIn++;
				}
			}	
			// Contatore Vocali 2
			for (int x2 = 0; x2 < o2.length();x2++) {					
				if (o2.charAt(x2) == 'a' || o2.charAt(x2) == 'e' || o2.charAt(x2) == 'i' || o2.charAt(x2) == 'o' || o2.charAt(x2) == 'u') {
					counterVocals++;
				}
			}	
			return counterVocals - counterVocalsIn;
		}
	}
	public static void main(String[] args) {

		List <String> wishList = new ArrayList<>();
		Scanner scn = new Scanner(System.in);
		Scanner scn2 = new Scanner(System.in);
		
		int uChoice = 0;
		
		while (uChoice != 2){
			System.out.println("Inserisci desiderio nella wishlist:");
			String cWish = scn.nextLine();		
			
			wishList.add(cWish);
							
			System.out.println("Lunghezza lista: " + wishList.size() + " elementi");
			System.out.println("Vuoi aggiungere altro alla wishlist? (1 - si | 2 - no");
			uChoice = scn2.nextInt();		
		}
		scn.close();
		scn2.close();

		wishList.sort(new StringComparator());  
	
		System.out.println("Desideri : " + wishList);
		
	}
}
