package com.Hocam.Collections;

import java.util.ArrayList;

public class listelerimPOJOSinif {

	
	public static void main(String[] args) {
		
		ArrayList<modelMusteri> ml = new ArrayList<>();
		
		modelMusteri musteri1 = new modelMusteri();
		modelMusteri musteri2 = new modelMusteri();
		
		musteri1.setAcilTelefon("0 555 555 5522");
		musteri1.setAd("Muhammet");
		musteri1.setSoyad("HOCA");
		
		musteri2.setAcilTelefon("0 333 333 5522");
		musteri2.setAd("Kemal");
		musteri2.setSoyad("KEMAL");
	
		
		
		ml.add(musteri1);
		ml.add(musteri2);
		
		for (modelMusteri itemMusteri : ml) {
			
			
			System.out.println("Müþteri Telefonu....: "+itemMusteri.getAcilTelefon());
			System.out.println("Müþteri Adý.........: "+itemMusteri.getAd());
			System.out.println("Müþteri Soyadý......: "+itemMusteri.getSoyad());
			System.out.println("Müþteri Adresi......: "+itemMusteri.getAdres());
			System.out.println("----------------------------------------------");
			System.out.println();
			
		}
		
		
		
		
	}
	
}
