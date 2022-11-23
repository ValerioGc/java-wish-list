package org.generation.italy.christmas;

import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		public static class StringComparator implements Comparator<String> {

			@Override
			public int compare(String o1, String o2) {
				
				// TODO Auto-generated method stub
				return 0;
			}
			
		}

		LinkedList<String> wishList = new LinkedList<>();
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
