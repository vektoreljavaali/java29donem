package com.Hocam;

import java.util.Scanner;

public class ilkproje {
 	// YENÝ ÖDEVLER 
	
	//KOLAY SORULAR
	//01- 20 den baþlayarak 10 a kadar olan sayýlarý ekrana yazdýran kod //for-while-do..while tüm döngü yapýlarýnda çalýþtýrýn
	//02- Kulanýcýdan iki sayý girmesini bekleyen programýn hangi sayýnýn büyük olduðunu bulmasý bekleniyor. Yani a>b ise ekrana a sayýsýný yazdýrýnýz.
	//03- 5 ten baþlayarak 3 er artarak 20 ye kadar olan sayýlarý yazdýran program.  5,8,11,14,17,20 yazacak.
	//04- girilen sayýnýn nefatif mi pozitif mi olduðunu bulan program.
	//05- girilen 3 sayýdan hangisinin büyük olduðunu bulan kod.
	
	
	//ZOR SORULAR
	//01- 9.000 den baþlayarak 10.000 e kadar olan sayýlarýn içinden tek ve çift sayýlarý bulup toplamýný ekrana yazdýran,
	//02- 1 den 1.000 e kadar olan sayýlarýn içindeki asal sayýlarý bulan program.
	//03- öðrenciden vize ve final notlarýný alan ve ortalama notu hesaplayýp. harf karýþýlýðýný bulan program. AA,AB.....FF 
	//04- 3,1,33,12,6,90 sayýlarýný küçükten büyüðe sýralayýnýz.
	//05- yýldýz simgesi kullanýlarak istenilen uzunlukta kare çiziniz. mesela: 5 yýldýz olsun
	//  * * * * * 
	//  *       *
	//  *       *
	//  *       *
	//  * * * * *
	// Baþarýlar
	
	public static void main(String[] args) {
		
		TarihUygulamalari th = new TarihUygulamalari();
	//	System.out.println(th.HaftaninGununuGetir());
		String kullaniciGirisMetni="";
		String computerCevabi="";
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Konuþma Metni: ");
			kullaniciGirisMetni = sc.nextLine();
			computerCevabi = th.KonusmaSimulasyonu(kullaniciGirisMetni);
			System.out.println(computerCevabi);			
		} while (!computerCevabi.equals("Computer: size de iyi günler dilerim."));
		 
	}
	
	
	
	
}
