package com.sezgin;

import java.util.Scanner;

public class zorMetodlar {
	
	public void tekCift() {
		int sayi=9000, araSayi=0, ciftToplam=0, tekToplam=0;
		
		while (sayi<10001) {
			araSayi=sayi/2;
			araSayi=araSayi*2;
			if (sayi==araSayi)
				ciftToplam = ciftToplam + sayi;
			else {
				tekToplam = tekToplam + sayi;
			}
			sayi=sayi+1;		
		}//while sonu
		
		System.out.println("Çift sayıların toplamı..:"+ciftToplam);
		System.out.println("Tek sayıların toplamı..:"+tekToplam);
		
	}//metod sonu
	
	public void asal() {
		// asal olmayan sayı kendinden küçük ve birden büyük herhangibir sayıya tam olarak bölünebilmelidir
		// tam olarak bölünmek demek, sayının modunun(%) sıfır olması demektir.
		
		int sayi=3, modSayi=2, modSonucu=1;
		
		System.out.println(sayi-1);
		//tek asal çift sayı olan 2 yi böyle yazdırdım :)) 
		
		
		while (sayi<101) {
		
			modSayi=2;
			modSonucu=1;
		while (sayi>modSayi&&modSonucu!=0) {
			modSonucu = (sayi%modSayi)*100;
			modSayi = modSayi +1;			
		}
		if (modSonucu!=0)
			System.out.println(sayi);
		sayi=sayi+1;
		}
	}//metod sonu
	
	public void vizeFinal() {
		int vizeNot=0, finalNot=0, harfNot=0;
		
Scanner kullaniciGiris = new Scanner(System.in);
			
		
		System.out.print("Vize Notunu Giriniz");
		vizeNot = kullaniciGiris.nextInt();
		
		System.out.print("Final Notunu Giriniz");
		finalNot = kullaniciGiris.nextInt();
		// Vize ağırlığı %40, final ağırlığı %60 olsun..
		
		harfNot=(vizeNot*4/10) + (finalNot*6/10);
		
		if (harfNot>90) {
			System.out.println("Öğrencinin not ortalaması..:"+harfNot +"  ve harf karşılığı AA'dır.");
		}
		else if (harfNot>80) {
		System.out.println("Öğrencinin not ortalaması..:"+harfNot + "  ve harf karşılığı BA'dır.");
		}
		else if (harfNot>70) {
			System.out.println("Öğrencinin not ortalaması..:"+harfNot + "  ve harf karşılığı BB'dır.");
			}
		else if (harfNot>60) {
			System.out.println("Öğrencinin not ortalaması..:"+harfNot + "  ve harf karşılığı CB'dır.");
			}
		else if (harfNot>50) {
			System.out.println("Öğrencinin not ortalaması..:"+harfNot + "  ve harf karşılığı CC'dır.");
			}
		else if (harfNot>40) {
			System.out.println("Öğrencinin not ortalaması..:"+harfNot + "  ve harf karşılığı CD'dır.");
			}
		else if (harfNot>30) {
			System.out.println("Öğrencinin not ortalaması..:"+harfNot + "  ve harf karşılığı DD'dır.");
			}
		else {
			System.out.println("Öğrencinin not ortalaması..:"+harfNot + "  ve harf karşılığı FF'dır.");
			}
	}//metod sonu
	
	public void kucukBuyukSira () {
		//3,1,33,12,6,90 sayılarını küçükten büyüğe sıralayınız.
		int s1=3, s2=1, s3=33, s4=12, s5=6, s6=90;
		int buyuk1=0, buyuk2=0,buyuk3=0,kucuk1=0,kucuk2=0,kucuk3=0;
		int enbuyuk=0, enkucuk=0, ikinciBuyuk=0, ikinciKucuk=0, ucuncuBuyuk=0, ucuncuKucuk=0;
		//Önce 6 sayı içindeki en büyük ve en küçük bulunup elenecek
		//Sonra kalan 4 sayı içindeki en büyük ve en küçük bulunup elenecek
		// En sonda kalan iki sayı ortada yer alacak ve sırası belirlenecek..
			
		if (s1>s2) {
			buyuk1=s1; 
			kucuk1=s2;				
			}
		else
		{
			buyuk1=s2; 
			kucuk1=s1;				
			}
		
		if (s3>s4) {
			buyuk2=s3; 
			kucuk2=s4;				
			}
		else
		{
			buyuk2=s4; 
			kucuk2=s3;				
			}
		
		if (s5>s6) {
			buyuk3=s5; 
			kucuk3=s6;				
			}
		else
		{
			buyuk3=s6; 
			kucuk3=s5;				
			}
		
		if (buyuk1>buyuk2&&buyuk1>buyuk3) {
			enbuyuk = buyuk1;
			ikinciBuyuk=buyuk2;
			ucuncuBuyuk=buyuk3;
		}
		else if (buyuk2>buyuk3) {
			enbuyuk=buyuk2;
			ikinciBuyuk=buyuk1;
			ucuncuBuyuk=buyuk3;
		}
		else
		{     enbuyuk=buyuk3;
		ikinciBuyuk=buyuk1;
		ucuncuBuyuk=buyuk2;
		
		}
		
		if (kucuk1<kucuk2&&kucuk1<kucuk3) {
			enkucuk = kucuk1;
			ikinciKucuk=kucuk2;
			ucuncuKucuk=kucuk3;
		}
		else if (kucuk2<kucuk3) {
			enkucuk=kucuk2;
			ikinciKucuk=kucuk1;
			ucuncuKucuk=kucuk3;
		}
		else
		{     enkucuk=kucuk3;
		ikinciKucuk=kucuk1;
		ucuncuKucuk=kucuk2;
		
		}
		
		if (ikinciBuyuk>ucuncuBuyuk) {
			buyuk2=ikinciBuyuk;
			kucuk2=ucuncuBuyuk;
					}
		
		else {
			kucuk2=ikinciBuyuk;
			buyuk2=ucuncuBuyuk;
		}
		
		if (ikinciKucuk<ucuncuKucuk) {
			kucuk3=ikinciKucuk;
			buyuk3=ucuncuKucuk;
					}
		
		else {
			buyuk3=ikinciKucuk;
			kucuk3=ucuncuKucuk;
		}
		
		
		if (buyuk2>buyuk3) {
			ikinciBuyuk=buyuk2;
			ucuncuBuyuk=buyuk3;
					
		}
		
		else {
			ikinciBuyuk=buyuk3;
			ucuncuBuyuk=buyuk2;
			
		}
		
		if (kucuk2<kucuk3) {
			ikinciKucuk=kucuk2;
			ucuncuKucuk=kucuk3;
					
		}
		
		else {
			ikinciKucuk=kucuk3;
			ucuncuKucuk=kucuk2;
			
		}
		
		if (ucuncuBuyuk>ucuncuKucuk) {
			buyuk3=ucuncuBuyuk;
			kucuk3=ucuncuKucuk;
			
		}
		else {
			kucuk3=ucuncuBuyuk;
			buyuk3=ucuncuKucuk;
					}
		
		
		System.out.println("Sayıların küçükten büyüğe sıralaması şu şekildedir");
		System.out.println(enkucuk);
		System.out.println(ikinciKucuk  );
		System.out.println(kucuk3);
		System.out.println(buyuk3 );
		System.out.println(ikinciBuyuk );
		System.out.println(enbuyuk );
	}//metod sonu
	
public void kareCiz() {
	int uzunluk=0, i=1, j=1, k=1, f=1;
	
	Scanner kullaniciGiris = new Scanner(System.in);
	
	System.out.print("Karenin bir kenar uzunluğu kaç yıldız olsun?");
	uzunluk = kullaniciGiris.nextInt();
	// Kullanıcının pozitif bir sayı gireceği öngörüsüyle
	// yoksa bir de negatif sayı sayacı konulmalı
	
	while (i<uzunluk) {
		
		System.out.print("*");
		i=i+1;
	}
	System.out.println("*");
	
	while (k<(uzunluk-1)) {
	System.out.print("*");
	j=1;
	
	while (j<(uzunluk-1)) {
		System.out.print(" ");
		j=j+1;
	}
	
	System.out.println("*");
	k=k+1;
	}
	
while (f<=uzunluk) {
		
		System.out.print("*");
		f=f+1;
	}
	
}//metod sonu
	
	
	
}//class sonu
