package com.Hocam.Collections;

import java.util.ArrayList;



public class listelerimUygulamasi {

	public static void main(String[] args) {
		
		ArrayList<String> AlS = new ArrayList<>();
	//	ArrayList<Integer> AlI = new ArrayList<>();
	//	ArrayList<Double> AlD = new ArrayList<>();
		
		AlS.add("1. Kay�t");
		AlS.add("2. Kay�t");
		AlS.add("3. Kay�t");
		AlS.add("4. Kay�t");
		AlS.add("5. Kay�t");
		AlS.add("6. Kay�t");
		System.out.println(AlS);
		
		int uzunluk = AlS.size()-1;
		
		System.out.println(AlS.get(uzunluk));
		
		
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
