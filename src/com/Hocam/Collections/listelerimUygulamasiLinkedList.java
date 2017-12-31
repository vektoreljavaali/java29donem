package com.Hocam.Collections;


import java.util.LinkedList;

public class listelerimUygulamasiLinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> AlS = new LinkedList<>();
	
			AlS.add("1. Kayýt");
			AlS.add("2. Kayýt");
			AlS.add("3. Kayýt");
			AlS.add("4. Kayýt");
			AlS.add("5. Kayýt");
			AlS.add("6. Kayýt");
			System.out.println(AlS);
			
			
			System.out.println(AlS.getLast());
			
		
			System.out.println("-----------------------");
			AlS.add(2, "Araya Eklenen");
			System.out.println(AlS);
			
		    System.out.println(AlS.indexOf("Araya Eklenen"));
			
			//	AlS.remove(2);
		   //	System.out.println(AlS);
			
			//System.out.println(AlS.get(2));
			System.out.println("--------------------------------");
			int sayac=0;
			for (String item : AlS) {
				System.out.println(item);
				if(item.equals("Araya Eklenen"))break;
				
				sayac++;
			}
			
			System.out.println(sayac);
			
		
	}
	
}
