package com.rifatcan;

import java.util.ArrayList;

import sun.security.x509.AlgIdDSA;

public class listelerimUygulamasý 
{
	public static void main (String [] args) 
	{
		ArrayList<String> alstring = new ArrayList<>();
		ArrayList<Integer> alint = new ArrayList<>();
		ArrayList<Double> aldouble = new ArrayList<>();
		
		//Üç kaydý ekledik
		alstring.add("1.Kayýt");
		alstring.add("2.Kayýt");
		alstring.add("3.Kayýt");
		alstring.add("4.Kayýt");
		alstring.add("5.Kayýt");
		alstring.add("6.Kayýt");
		System.out.println("Tüm Arraylist'i gösterme : " + alstring);
		
		System.out.println("----------------------------------------");
		
		int uzunluk = alstring.size()-1;
		System.out.println("Son Kaydý Bu þekilde Buluruz : " + alstring.get(uzunluk));
		
		System.out.println("----------------------------------------");
		//Araya ekleme yaptýk.add(index, element) kullanarak.
		alstring.add(2, "Araya Eklenen");
		System.out.println("Araya Eklenen Deðeri Gösterme : " + alstring);
		System.out.println("----------------------------------------");
		System.out.println("ÝndexOf Kullanýmý : " + alstring.indexOf("Araya Eklenen"));
		
		//Araya eklenen deðeri sildik.
		System.out.println("----------------------------------------");
		alstring.remove(2);
		System.out.println("Araya Eklenen Deðeri Sildik" + alstring);
		
		//Get metodu ile ekrana deðer atadýk.
		System.out.println("----------------------------------------");
		System.out.println(alstring.get(2));
		
		//foreach tüm kaydý okur.
		
		System.out.println("---------------------------------------");
		int sayac = 0;
		
		for (String item : alstring) 
		{
			System.out.println("Aranan Kaydý Bulup ekrana yazdýrdýk." + item);
			if(item.equals("Araya Eklenen"))
			break;
			sayac++;
		}
		System.out.println("----------------------------------------");
			System.out.println("Kaçýmcý sýrada olduðunu bulduk" + sayac);
	}
}
