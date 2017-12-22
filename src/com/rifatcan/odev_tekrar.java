package com.rifatcan;

import java.time.Year;
import java.time.YearMonth;
import java.util.Scanner;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class odev_tekrar 
{
	static String kelime1 = "Ben bugün ders tekrarý yapacaðým.";
	static String kelime2 = "Bugün bisiklet ile iþe gideceðim.";
	static String kelime3 = "Yarýn akþam arkadaþým ile yemeðe çýkacaðým.";
	
	public void yilbulanprogram()
	{
		int yil=0 , suankiyil , yas = 17;
		suankiyil = YearMonth.now().getYear();
		
		do 
		{
			try 
			{
				System.out.println("Lütfen Bir Yil Giriniz");
				Scanner sc = new Scanner(System.in);
				yil = sc.nextInt();
			} 
			catch (Exception e) 
			{
				System.out.println("Yanlis Bir Tarih Kriteri Girdiniz. Lütfen Yýl Bazýndan Bir Deger Giriniz.");
			}
			
			
		} while (yil <= 1900 || yil >= 2017);
		
		if(suankiyil - yil <= yas)
		{
			System.out.println("Kullanici Yasi Resit Degildir.");
		}
		else if (suankiyil - yil == yas + 1 )
		{
			System.out.println("Kullanici 18 Yasindadir");
		}
		else if (suankiyil - yil == yas + 2)
		{
			System.out.println("Kullanici 19 Yasindadir.");
		}
		else if (suankiyil - yil == yas + 3)
		{
			System.out.println("Kullanici 20 Yasindadir.");
		}
		else if (suankiyil - yil == yas + 4)
		{
			System.out.println("Kullanici 21 Yasindadir.");
		}
		else if (suankiyil - yil == yas + 5)
		{
			System.out.println("Kullanici 22 Yasindadir.");
		}
		else if (suankiyil - yil == yas + 6)
		{
			System.out.println("Kullanici 23 Yasindadir.");
		}
		else if (suankiyil - yil == yas + 7)
		{
			System.out.println("Kullanici 24 Yasindadir.");
		}
		else if (suankiyil - yil == yas + 8)
		{
			System.out.println("Kullanici 25 Yasindadir.");
		}
		else if (suankiyil - yil == yas + 9)
		{
			System.out.println("Kullanici 26 Yasindadir");
		}
		else if (suankiyil - yil == yas + 10)
		{
			System.out.println("Kullanici 27 Yasindadir.");
		}
		else if (suankiyil - yil == yas + 11)
		{
			System.out.println("Kullanici 28 Yasindadir.");
		}
	}
	
	public void cumlelereayirma()
	{
		String zaman_zarflarý [] = {"Bugün","Yarýn","Akþam Üzeri","1925 te","dün"};
		String nesneler       [] = {"masa","sandalye","kitap","araba","bisiklet"};
		String baglaclar      [] = {"ve","ile","veya","",""};
		String dolaylý_tümlec [] = {"Burada","Ankara'ya","Araba","okulda","evde"};
		String yuklem         [] = {"gideceðim.","gelmek","yüklemek","yürümek","koþmak"};
		
		
		System.out.println("Zaman Zarflarý : " + zaman_zarflarý[0]);
		System.out.println("Zaman Zarflarý : " + zaman_zarflarý[1]);
		System.out.println("Zaman Zarflarý : " + zaman_zarflarý[2]);
		System.out.println("Zaman Zarflarý : " + zaman_zarflarý[3]);
		System.out.println("Zaman Zarflarý : " + zaman_zarflarý[4]);
		
		
		System.out.println("Nesneler : " + nesneler[0]);
		System.out.println("Nesneler : " + nesneler[1]);
		System.out.println("Nesneler : " + nesneler[2]);
		System.out.println("Nesneler : " + nesneler[3]);
		System.out.println("Nesneler : " + nesneler[4]);
		
		System.out.println("Baðlaçlar : " + baglaclar[0]);
		System.out.println("Baðlaçlar : " + baglaclar[1]);
		System.out.println("Baðlaçlar : " + baglaclar[2]);
		
		System.out.println("Dolaylý Tümleç : " + dolaylý_tümlec[0]);
		System.out.println("Dolaylý Tümleç : " + dolaylý_tümlec[1]);
		System.out.println("Dolaylý Tümleç : " + dolaylý_tümlec[2]);
		System.out.println("Dolaylý Tümleç : " + dolaylý_tümlec[3]);
		System.out.println("Dolaylý Tümleç : " + dolaylý_tümlec[4]);
		
		System.out.println("Yüklem : " + yuklem[0]);
		System.out.println("Yüklem : " + yuklem[1]);
		System.out.println("Yüklem : " + yuklem[2]);
		System.out.println("Yüklem : " + yuklem[3]);
		System.out.println("Yüklem : " + yuklem[4]);
		
		System.out.println("Kelime Birleþmiþ Hali : " + zaman_zarflarý[0] + " " + nesneler[4] + " " + baglaclar[1] + " " + dolaylý_tümlec[1] + " " + yuklem[0]);
		
		System.out.println("Özne :" + kelime1.substring(0,4));
		System.out.println("Zaman Zarfý: " + kelime1.substring(4,9));
		System.out.println("Nesne :" + kelime1.substring(10,14));
		System.out.println("Dolayýlý Tümleç: " + kelime1.substring(15,22));
		System.out.println("Yüklem :" + kelime1.substring(23,33));
		
		System.out.println("Özne :" + kelime2.replaceAll(kelime2, "Bugün"));
		System.out.println("Zaman Zarfý: " + kelime2.replaceAll(kelime2,"bisiklet"));
		System.out.println("Nesne :" + kelime2.replaceAll(kelime2, "ile"));
		System.out.println("Dolayýlý Tümleç: " + kelime2.replaceAll(kelime2, "iþe"));
		System.out.println("Yüklem :" + kelime2.replaceAll(kelime2, "gideceðim."));	
	}
	
	public void bunumudemekistediniz()
	{
		
	}
}
