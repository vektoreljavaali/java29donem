package com.rifatcan;

import java.util.LinkedList;
import sun.security.x509.AlgIdDSA;

public class listelerimuygulamalinkedlist 
{
	
	public static void main (String [] args)
	{
	
	LinkedList<String> alstring = new LinkedList<>();
	
	alstring.add("1.Kay�t");
	alstring.add("2.Kay�t");
	alstring.add("3.Kay�t");
	alstring.add("4.Kay�t");
	alstring.add("5.Kay�t");
	alstring.add("6.Kay�t");
	System.out.println("T�m Arraylist'i g�sterme : " + alstring);
	
	//alstring.addFirst(e); ba�a ekleme yapar
	//alstring.addLast(e);  sona ekleme yapar

	// Son Kayd� bulmak i�in getlast'� kullan�r�z.
	
	System.out.println("----------------------------------------");
	
	System.out.println("Linked'de ise son kayd� bu kadar k�sa bir komutla buluruz : " + alstring.getLast());
	
	System.out.println("----------------------------------------");
	//Araya ekleme yapt�k.add(index, element) kullanarak.
	alstring.add(2, "Araya Eklenen");
	System.out.println("Araya Eklenen De�eri G�sterme : " + alstring);
	System.out.println("----------------------------------------");
	System.out.println("�ndexOf Kullan�m� : " + alstring.indexOf("Araya Eklenen"));
	
	//Araya eklenen de�eri sildik.
	System.out.println("----------------------------------------");
	alstring.remove(2);
	System.out.println("Araya Eklenen De�eri Sildik" + alstring);
	
	System.out.println("----------------------------------------");
	//Get metodu ile ekrana de�er atad�k.
	System.out.println(alstring.get(2));
	
	//foreach t�m kayd� okur.
	
	System.out.println("---------------------------------------");
	int sayac = 0;
	
	for (String item : alstring) 
	{
		System.out.println("Aranan Kayd� Bulup ekrana yazd�rd�k : " + item);
		if(item.equals("Araya Eklenen"))
		break;
		sayac++;
	}
	System.out.println("----------------------------------------");
		System.out.println("Ka��nc� s�rada oldu�unu bulduk : " + sayac);
	}
}
