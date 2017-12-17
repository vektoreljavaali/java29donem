package com.sezgin;

import java.util.Scanner;

public class metodlar {
	
	//KOLAY SORULAR
		//01- 20 den başlayarak 10 a kadar olan sayıları ekrana yazdıran kod //for-while-do..while tüm döngü yapılarında çalıştırın
		//02- Kulanıcıdan iki sayı girmesini bekleyen programın hangi sayının büyük olduğunu bulması bekleniyor. Yani a>b ise ekrana a sayısını yazdırınız.
		//03- 5 ten başlayarak 3 er artarak 20 ye kadar olan sayıları yazdıran program.  5,8,11,14,17,20 yazacak.
		//04- girilen sayının nefatif mi pozitif mi olduğunu bulan program.
		//05- girilen 3 sayıdan hangisinin büyük olduğunu bulan kod.
		
	
public void dongusel() {
	System.out.println("For Döngüsü");
	for(int deger=20;deger>9;deger--){
	     System.out.println(deger);
	}
	System.out.println("While Döngüsü");
	int deger = 21;
	while (deger>10) {
		deger = deger-1;
		System.out.println(deger);
	}
	System.out.println("Do While Döngüsü");
	
	deger = 20;
	
	do {
		System.out.println(deger);
		deger = deger-1;
	}
		while (deger>9);
	

		
		
}// metod sonu

public void buyukKucuk() {
	int sayi1=0, sayi2=0;
	Scanner kullaniciGiris = new Scanner(System.in);
	System.out.print("Bir sayı giriniz");
	sayi1 = kullaniciGiris.nextInt();
	
	System.out.print("Bir sayı daha giriniz");
	sayi2 = kullaniciGiris.nextInt();
	
	System.out.println("Sayılardan büyük olanı aşağıda verilmiştir");
	
	if (sayi1>sayi2) {
	System.out.println(sayi1);
	}
	else {
	System.out.println(sayi2);
	}
		
	
}//metod sonu

public void bestenYirmiye() {
	System.out.println("5 ten 20'ye kadar 3'er 3'er arttırırsak aşağıdaki dizi oluşur");
	
	int deger = 5;
	while (deger<21) {
		System.out.println(deger);
		deger=deger+3;
	}
	
}//metod sonu

public void negPoz() {
	int sayi1=0;
	Scanner kullaniciGiris = new Scanner(System.in);
	System.out.print("Bir sayı giriniz");
	sayi1 = kullaniciGiris.nextInt();
			
	if (sayi1>0) {
	System.out.println(sayi1 + "pozitif bir sayıdır");
	}
	else if (sayi1==0) {
	System.out.println(sayi1 +"sıfırdır");
	}
	else {
		System.out.println(sayi1 + "negatif bir sayıdır");	
		
	
	}
		
	
}//metod sonu

public void ucsayi() {
	int sayi1=0, sayi2=0, sayi3=0, ortalama=0;
	Scanner kullaniciGiris = new Scanner(System.in);
	System.out.print("Bir sayı giriniz");
	sayi1 = kullaniciGiris.nextInt();
	
	System.out.print("Bir sayı daha giriniz");
	sayi2 = kullaniciGiris.nextInt();
	
	System.out.print("Uçüncü sayıyı da giriniz");
	sayi3 = kullaniciGiris.nextInt();
	
	ortalama = (sayi1 + sayi2 + sayi3)/3;
	
	if (sayi1>sayi2&&sayi1>sayi3) {
		System.out.println(sayi1 + "en buyuk sayıdır");
		}
		else if (sayi2>sayi1&&sayi2>sayi3) {
		System.out.println(sayi2 +"en buyuk sayıdır");
		}
		else {
			System.out.println(sayi3 + "en buyuk sayıdır");	
			
		
		}
	
	
}//metod sonu

}//class sonu
