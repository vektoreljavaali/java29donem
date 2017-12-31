package com.rifatcan;

import java.util.LinkedList;
import sun.security.x509.AlgIdDSA;

public class listelerimuygulamalinkedlist 
{
	
	public static void main (String [] args)
	{
	
	LinkedList<String> alstring = new LinkedList<>();
	
	alstring.add("1.Kayýt");
	alstring.add("2.Kayýt");
	alstring.add("3.Kayýt");
	alstring.add("4.Kayýt");
	alstring.add("5.Kayýt");
	alstring.add("6.Kayýt");
	System.out.println("Tüm Arraylist'i gösterme : " + alstring);
	
	//alstring.addFirst(e); baþa ekleme yapar
	//alstring.addLast(e);  sona ekleme yapar

	// Son Kaydý bulmak için getlast'ý kullanýrýz.
	
	System.out.println("----------------------------------------");
	
	System.out.println("Linked'de ise son kaydý bu kadar kýsa bir komutla buluruz : " + alstring.getLast());
	
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
	
	System.out.println("----------------------------------------");
	//Get metodu ile ekrana deðer atadýk.
	System.out.println(alstring.get(2));
	
	//foreach tüm kaydý okur.
	
	System.out.println("---------------------------------------");
	int sayac = 0;
	
	for (String item : alstring) 
	{
		System.out.println("Aranan Kaydý Bulup ekrana yazdýrdýk : " + item);
		if(item.equals("Araya Eklenen"))
		break;
		sayac++;
	}
	System.out.println("----------------------------------------");
		System.out.println("Kaçýncý sýrada olduðunu bulduk : " + sayac);
	}
}
