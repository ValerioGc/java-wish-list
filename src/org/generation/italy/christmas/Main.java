package org.generation.italy.christmas;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> wishList = new ArrayList<>();
		Scanner scn = new Scanner(System.in);
		int uChoice = 0;
		
		while (uChoice != 2){
			
			System.out.println("Inserisci desiderio nella wishlist:");
			String cWish = scn.nextLine();		
			wishList.add(cWish);
			
		
			Collections.sort(wishList);  
			
			for (String wish : wishList) {
				System.out.println("Desideriod: " + wish);
			}
			
			System.out.println("Lunghezza lista: " + wishList.size() + " elementi");
			
			wishList.add("Vuoi aggiungere altro alla wishlist? (1 - si | 2 - no");
			uChoice = scn.nextInt();	
		
		}
	scn.close();
	}
}
