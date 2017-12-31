package com.rifatcan;

import java.util.HashMap;

public class listelerimuygulamahashMap {

	public static void main(String[] args) 
	{
		// HashMap Nedir ?
		HashMap<String, String> hm = new HashMap<>();
		HashMap<String, Integer> hmint = new HashMap<>();
		HashMap<Integer, String> hmstring = new HashMap<>();
		
		System.out.println("Ýlkinde boþ mu dolu diye baktýrdýk boþ ise true döner : " + hm.isEmpty());
		
		hm.put("1111111111", "Rýfatcan");
		hm.put("2222222222", "Eda");
		hm.put("3333333333", "Huriye");
		hm.put("4444444444", "Ahmet");
		
		System.out.println("Hepisi Bellekte Bulduðu yere göre adresler ve karýþýk Sýralar : " + hm);
		
		System.out.println("----------------------------------------");
		
		System.out.println("Get komutu ile istediðimiz key'i getirebilriz : " + hm.get("1111111111"));
		
		System.out.println("----------------------------------------");
		
		System.out.println("Kod sonunda boþ mu dolu mu diye baktýk dolu ise false döner : " + hm.isEmpty());
		
		System.out.println("----------------------------------------");
		
		System.out.println("Burada merge kullanarak key'in sonuna deðer ekledik." + hm.merge("3333333333", " hoca", String::concat));
		System.out.println(hm);
		
		System.out.println("----------------------------------------");
		
		System.out.println("Burada Key deðerlerini yazdýrdýk : " + hm.keySet());
		
		System.out.println("----------------------------------------");
		
		System.out.println("Burada Sadece Value deðerlerini yazdýrdýk : " + hm.values());
		
		System.out.println("----------------------------------------");
		
		System.out.println(hm.replace("333333", "VELÝ VELÝ"));
		
		System.out.println("----------------------------------------");
	}

}
