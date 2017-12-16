package com.rifatCan;

import java.util.Scanner;

public class denemeler 
{
			//01- 50 den baþlayarak 1 a kadar olan sayýlarý ekrana yazdýran kod //for-while-do..while tüm döngü yapýlarýnda çalýþtýrýn
			//02- Kulanýcýdan iki sayý girmesini bekleyen programýn hangi sayýnýn büyük olduðunu bulmasý bekleniyor. Yani a>b ise ekrana a sayýsýný yazdýrýnýz.
			//03- 5 ten baþlayarak 3 er artarak 20 ye kadar olan sayýlarý yazdýran program.  5,8,11,14,17,20 yazacak.
			//04- girilen sayýnýn nefatif mi pozitif mi olduðunu bulan program.
			//05- girilen 3 sayýdan hangisinin büyük olduðunu bulan kod.
	public void soru1()
	{
		for (int i = 50; i >= 1; i--) 
		{
			System.out.println(i);
		}
	}
	
	public void soru2()
	{
		Scanner sor = new Scanner(System.in);
		
		int sayi1 , sayi2;
		
		System.out.println("Lütfen 1.Sayýyý Giriniz...");
		sayi1 = sor.nextInt();
		System.out.println("Lütfen 2.Sayýyý Giriniz...");
		sayi2 = sor.nextInt();
		
		if(sayi1 < sayi2) 
		{
			System.out.println("Sayý2 Sayý1'den daha büyük.");
		}
		else
		{
			System.out.println("Sayý 1 Sayý 2'den daha büyük.");
		}
	}
	
	public void soru3()
	{
		for (int i = 5; i <= 50; i+=3) 
		{
			System.out.println(i);
		}
	}
	
	public void soru4()
	{
	
		Scanner scn = new Scanner(System.in);
		int girilensayi ;
		System.out.println("Lütfen Bir Sayý Giriniz...");
		girilensayi = scn.nextInt();
		
		if(girilensayi < 0)
		{
			System.out.println("Girilen Sayý Negatiftir.");
		}
		else if (girilensayi > 0)
		{
			System.out.println("Girilen Sayý Pozitiftir.");
		}
		else
		{
			System.out.println("Girilen Sayý Sýfýrdýr.");
		}
	}
}
