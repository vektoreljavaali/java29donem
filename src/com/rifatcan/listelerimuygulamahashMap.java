package com.rifatcan;

import java.util.HashMap;

public class listelerimuygulamahashMap {

	public static void main(String[] args) 
	{
		// HashMap Nedir ?
		HashMap<String, String> hm = new HashMap<>();
		HashMap<String, Integer> hmint = new HashMap<>();
		HashMap<Integer, String> hmstring = new HashMap<>();
		
		System.out.println("�lkinde bo� mu dolu diye bakt�rd�k bo� ise true d�ner : " + hm.isEmpty());
		
		hm.put("1111111111", "R�fatcan");
		hm.put("2222222222", "Eda");
		hm.put("3333333333", "Huriye");
		hm.put("4444444444", "Ahmet");
		
		System.out.println("Hepisi Bellekte Buldu�u yere g�re adresler ve kar���k S�ralar : " + hm);
		
		System.out.println("----------------------------------------");
		
		System.out.println("Get komutu ile istedi�imiz key'i getirebilriz : " + hm.get("1111111111"));
		
		System.out.println("----------------------------------------");
		
		System.out.println("Kod sonunda bo� mu dolu mu diye bakt�k dolu ise false d�ner : " + hm.isEmpty());
		
		System.out.println("----------------------------------------");
		
		System.out.println("Burada merge kullanarak key'in sonuna de�er ekledik." + hm.merge("3333333333", " hoca", String::concat));
		System.out.println(hm);
		
		System.out.println("----------------------------------------");
		
		System.out.println("Burada Key de�erlerini yazd�rd�k : " + hm.keySet());
		
		System.out.println("----------------------------------------");
		
		System.out.println("Burada Sadece Value de�erlerini yazd�rd�k : " + hm.values());
		
		System.out.println("----------------------------------------");
		
		System.out.println(hm.replace("333333", "VEL� VEL�"));
		
		System.out.println("----------------------------------------");
	}

}
