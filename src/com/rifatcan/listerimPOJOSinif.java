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
		musteri1.setSoyad�("BARKA");
		musteri1.setTelefon("555 555 22 22");
		musteri1.setAcilTelefon("555 333 11 22");
		musteri1.setSaglikDurumu("Sa�l�kl�");
		musteri1.setAdres("dsadasdsadassa");
		
		musteri2.setTckimlik("12345678901");
		musteri2.setAdi("Huriye");
		musteri2.setSoyad�("G��L� BARKA");
		musteri2.setTelefon("555 666 77 22");
		musteri2.setAcilTelefon("555 888 99 44");
		musteri2.setSaglikDurumu("Sa�l�kl�");
		musteri2.setAdres("dsadasdsadassa");
		
		ml.add(musteri1);
		ml.add(musteri2);
		
		for (modelMusteri itemMusteri : ml) 
		{
			System.out.println("M��teri TC Kimlik Numaras�....... : " + itemMusteri.getTckimlik());
			System.out.println("M��teri Ad�.......................: " + itemMusteri.getAdi());
			System.out.println("M��teri Soyad�....................: " + itemMusteri.getSoyad�());
			System.out.println("M��teri Telefonu..................: " + itemMusteri.getTelefon());
			System.out.println("M��teri Acil Telefonu.............: " + itemMusteri.getAcilTelefon());
			System.out.println("M��teri Sa�l�k Durumu.............: " + itemMusteri.getSaglikDurumu());
			System.out.println("M��teri Adresi....................: " + itemMusteri.getAdres());
			System.out.println();
			System.out.println("...................................");
			System.out.println();
		}
		
	}

}
