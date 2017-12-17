package com.sezgin;

public class zorRunner {

	public static void main(String[] args) {
		//ZOR SORULAR
		//01- 9.000 den başlayarak 10.000 e kadar olan sayıların içinden tek ve çift sayıları bulup toplamını ekrana yazdıran,
		//02- 1 den 1.000 e kadar olan sayıların içindeki asal sayıları bulan program.
		//03- öğrenciden vize ve final notlarını alan ve ortalama notu hesaplayıp. harf karışılığını bulan program. AA,AB.....FF 
		//04- 3,1,33,12,6,90 sayılarını küçükten büyüğe sıralayınız.
		//05- yıldız simgesi kullanılarak istenilen uzunlukta kare çiziniz. mesela: 5 yıldız olsun
		//  * * * * * 
		//  *       *
		//  *       *
		//  *       *
		//  * * * * *
		// Başarılar

		System.out.println("Tek Sayılar Çift Sayılar");
		zorMetodlar tekcift = new zorMetodlar();
		tekcift.tekCift();
		
		System.out.println("Asal Sayılar");
		zorMetodlar asal = new zorMetodlar();
		asal.asal();
		
		System.out.println("Öğrenci Notları");
		zorMetodlar notlar = new zorMetodlar();
		notlar.vizeFinal();
		
		System.out.println("Sayıları Sırala");
		zorMetodlar kucukbuyuk = new zorMetodlar();
		kucukbuyuk.kucukBuyukSira();
		
		System.out.println("Kare çiz");
		zorMetodlar kareciz = new zorMetodlar();
		kareciz.kareCiz();
	}

}
