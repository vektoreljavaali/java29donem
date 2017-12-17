package com.rifatcan;

import java.util.Scanner;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class tekraryapma 
{
	public void toplama()
	{
		int a = 10 , b = 20 , sonuc;
		sonuc = a + b;
		System.out.println("A ile B'nin toplam Sonucu : " + sonuc);
	}
	
	public void toplamdegiskenli(int a , int b)
	{
		int sonuc1;
		sonuc1 = a + b;
		System.out.println("A ile B'nin Toplam Deðiþkenli Sonucu : " + sonuc1);
	}
	
	public int toplamageridondurme(int a , int b)
	{
		int sonuc2;
		sonuc2 = a + b;
		return sonuc2;
	}
	
	public void cýkartma()
	{
		int a = 90 , b = 45 , sonuc3;
		sonuc3 = a - b;
		System.out.println("A'dan B deðerini çýkarttýðýmýzda sonuç : " + sonuc3);		
	}
	
	public void cýkartmedegiskenli(int a , int b)
	{
		int sonuc4;
		sonuc4 = a - b;
		System.out.println("A ile B'nin Deðiþkenli Çýkartma Deðeri Sonucu : " + sonuc4);
	}
	
	public int cýkartmageridondurme(int a , int b)
	{
		int sonuc5;
		sonuc5 = a - b;
		return sonuc5;
	}
	
	public void carpma()
	{
		int a = 9 , b = 88 , sonuc6;
		sonuc6 = a * b;
		System.out.println("A ile B'nin Çarpým Deðeri : " + sonuc6);
	}
	
	public void carpmadegiskenli(int a , int b)
	{
		int sonuc7;
		sonuc7 = a * b;
		System.out.println("A ile B'nin Deðiþkenli Çarpým Sonucu : " + sonuc7);
	}
	
	public int carpmageridondurme(int a , int b)
	{
		int sonuc8;
		sonuc8 = a * b;
		return sonuc8;
	}
	
	public void bolme()
	{
		int a = 60 , b = 20 , sonuc9;
		sonuc9 = a / b;
		System.out.println("A'yý B'ye böldüðümüzdeki deðer : " + sonuc9);
	}
	
	public void bolmedegiskenli(int a , int b)
	{
		int sonuc10;
		sonuc10 = a / b;
		System.out.println("A'yý B'ye böldüðümüzdeki Deðiþkenli Sonucu : " + sonuc10);
	}
	
	public int bolmegeridondurme(int a , int b)
	{
		int sonuc11;
		sonuc11 = a / b;
		return sonuc11;
	}
	
	public void mod()
	{
		int a = 30 , b = 50 , sonuc12;
		sonuc12 = a % b;
		System.out.println("A ile B'nin Modunu alma : " + sonuc12);
	}
	
	public void moddegiskenli(int a , int b)
	{
		int sonuc13;
		sonuc13 = a % b;
		System.out.println("A ile B'nin Deðiþkenli Mod Alma Sonucu : " + sonuc13);
	}
	
	public int modgeridondurme(int a , int b)
	{
		int sonuc14;
		sonuc14 = a % b;
		return sonuc14;
	}
	
	public void kosullarfor()
	{
		for (int i = 0; i <= 100; i+=3) 
		{
			System.out.println("0'dan Baþlayýp 100'e kadar 3'er 3'er sayma : " + i);
		}
	}
	
	public void dowwhilekullanýmý()
	{
		int r = 100;
		do 
		{
			System.out.println("100'den Geriye Doðru Sayma : " + r);
			r--;
		} 
		while (r >= 0);
	}
	
	public void  whilekullanýmý()
	{
		int k = 500;
		while (k >= 0) 
		{
			System.out.println("500'den 0'a kadar geri sayan program : " + k);
			k--;
		}
	}
	
	public void buyukkucuk()
	{
		Scanner sc = new Scanner(System.in);
		int sayi1 , sayi2;
		System.out.println("Lütfen 1.Sayýyý Giriniz.");
		sayi1 = sc.nextInt();
		System.out.println("Lütfen 2.Sayýyý Giriniz.");
		sayi2 = sc.nextInt();
		
		if(sayi1 > sayi2)
		{
			System.out.println("Sayý1 Sayý2'den Büyüktür.");
		}
		else if (sayi2 > sayi1)
		{
			System.out.println("Sayý2 Sayý1'den Büyüktür.");
		}		
	}
	
	public void negpoz()
	{
		Scanner scan = new Scanner(System.in);
		int sayi;
		System.out.println("Lüften Bir Sayý Giriniz.");
		sayi = scan.nextInt();
		
		if(sayi < 0)
		{
			System.out.println("Sayý Negatiftir.");
		}
		else if(sayi > 0)
		{
			System.out.println("Sayý Pozitiftir.");
		}
		else
		{
			System.out.println("Sayý Sýfýrdýr.");
		}
	}
	
	public void buyuksayýyýbul()
	{
		Scanner sayigir = new Scanner(System.in);
		System.out.println("Lütfen 1. Sayýyý Giriniz...");
		int sayi1 = sayigir.nextInt();
		System.out.println("Lütfen 2. Sayýyý Giriniz...");
		int sayi2 = sayigir.nextInt();
		System.out.println("Lütfen 3. Sayýyý Giriniz...");
		int sayi3 = sayigir.nextInt();
		
		int buyuksayi;
		
		if(sayi1 > sayi2 && sayi1 > sayi3)
		{
			buyuksayi = sayi1;
		}
		else if (sayi2 > sayi1 && sayi2 > sayi3)
		{
			buyuksayi = sayi2;	
		}
		else
		{
			buyuksayi = sayi3;
		}
		System.out.println("En Büyük Sayý : " + buyuksayi);
	}
}
