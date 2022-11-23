package org.generation.italy.christmas;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> wishList = new ArrayList<>();
		Scanner scn = new Scanner(System.in);

		
		
		System.out.println("Inserisci desiderio nella wishlist:");
		String cWish = scn.nextLine();		
		wishList.add(cWish);
		

		
		System.out.println("Lunghezza lista: " + wishList.size());
		
		for (String wish : wishList) {
			System.out.println(wish);
		}
		wishList.add("Vuoi aggiungere altro alla wishlist? (1 - si | 2 - no");
		String uChoice = scn.nextLine();	
		scn.close();
	}
}
