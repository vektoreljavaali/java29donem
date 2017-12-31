package com.rifatcan;

import java.util.ArrayList;

public class listerimPOJOSinif {

	public static void main(String[] args) 
	{
		ArrayList<modelMusteri> ml = new ArrayList<>();
		
		modelMusteri musteri1 = new modelMusteri();
		modelMusteri musteri2 = new modelMusteri();
		
		musteri1.setTckimlik("12345678901");
		musteri1.setAdi("Can");
		musteri1.setSoyadý("BARKA");
		musteri1.setTelefon("555 555 22 22");
		musteri1.setAcilTelefon("555 333 11 22");
		musteri1.setSaglikDurumu("Saðlýklý");
		musteri1.setAdres("dsadasdsadassa");
		
		musteri2.setTckimlik("12345678901");
		musteri2.setAdi("Huriye");
		musteri2.setSoyadý("GÜÇLÜ BARKA");
		musteri2.setTelefon("555 666 77 22");
		musteri2.setAcilTelefon("555 888 99 44");
		musteri2.setSaglikDurumu("Saðlýklý");
		musteri2.setAdres("dsadasdsadassa");
		
		ml.add(musteri1);
		ml.add(musteri2);
		
		for (modelMusteri itemMusteri : ml) 
		{
			System.out.println("Müþteri TC Kimlik Numarasý....... : " + itemMusteri.getTckimlik());
			System.out.println("Müþteri Adý.......................: " + itemMusteri.getAdi());
			System.out.println("Müþteri Soyadý....................: " + itemMusteri.getSoyadý());
			System.out.println("Müþteri Telefonu..................: " + itemMusteri.getTelefon());
			System.out.println("Müþteri Acil Telefonu.............: " + itemMusteri.getAcilTelefon());
			System.out.println("Müþteri Saðlýk Durumu.............: " + itemMusteri.getSaglikDurumu());
			System.out.println("Müþteri Adresi....................: " + itemMusteri.getAdres());
			System.out.println();
			System.out.println("...................................");
			System.out.println();
		}
		
	}

}
