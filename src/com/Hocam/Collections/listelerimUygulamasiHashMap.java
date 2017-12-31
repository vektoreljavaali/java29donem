package com.Hocam.Collections;

import java.util.HashMap;

public class listelerimUygulamasiHashMap {

	public static void main(String[] args) {
		
		HashMap<String, String> hm = new HashMap<>();
		HashMap<String, Integer> hmint = new HashMap<>();
		HashMap<Integer, String> hmstring = new HashMap<>();
		
		System.out.println(hm.isEmpty());
		
		hm.put("11111111111", "Muhammet hoca");
		hm.put("22222222222", "Ahmet");
		hm.put("33333333333", "Mahmet");
		hm.put("44444444444", "Veli");
				
		System.out.println(hm.merge("33333333333", "  Hoca", String::concat));
		
		System.out.println(hm);
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.replace("333333", "Veli VELÝ"));
		System.out.println(hm.replace("44444444444", "Veli VELÝ", "dfdsfsdfdfsf"));
		
		
		System.out.println(hm);
		
		
		
	}
	
}
