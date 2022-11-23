package org.generation.italy.christmas;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> wishList = new ArrayList<>();
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
		
		Collections.sort(wishList);  
		
		for (String wish : wishList) {
			System.out.println("Desiderio : " + wish + "\n--------------------");
		}
		
	}
}
