package com.Hocam.Collections;


import java.util.LinkedList;

public class listelerimUygulamasiLinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> AlS = new LinkedList<>();
	
			AlS.add("1. Kay�t");
			AlS.add("2. Kay�t");
			AlS.add("3. Kay�t");
			AlS.add("4. Kay�t");
			AlS.add("5. Kay�t");
			AlS.add("6. Kay�t");
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
