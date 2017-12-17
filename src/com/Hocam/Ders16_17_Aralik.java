package com.Hocam;

import java.util.Scanner;

public class Ders16_17_Aralik {

	// ÝÞLENECEK KONULAR
	//01- Switch Case yapýsý
	//02- try-catch yapýsý
	//03- String ve Math sýnýflarý
	//04- Basit diziler ve çok boyutlu diziler - Yetiþirse iþlenecek
	
	//
	
	
	public static void main(String[] args) {
		
	String StringRakam="";
	Scanner sc = new Scanner(System.in);
	TipDonusumleri tp = new TipDonusumleri();
	double CevrilenRakam=0;
	boolean hataDurumu=true;
	
	do {
		System.out.println("Tip Dönüþümü için bir sayý giriniz...: ");
		StringRakam = sc.nextLine();
		try {
			 CevrilenRakam = tp.DoublesayiyaCevir(StringRakam);
			 hataDurumu=false;
		} catch (Exception e) {
			System.out.println("Double sayý bir ifade girmediniz. Lütfen double sayý bir ifade girerek tekrar deneyiniz.");
			hataDurumu=true;
		}
	} while (hataDurumu==true);
		
	if(CevrilenRakam>20) System.out.println("Rakam 20 den büyüktür.");
	sc.close();
	
	}
	
	
}
