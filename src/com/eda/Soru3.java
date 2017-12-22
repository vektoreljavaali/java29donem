package com.eda;

import java.util.Scanner;

public class Soru3 {
	public void Arama() {

		int sayi = 0,count=0,length=0;
		String k = " ",kelime=" ";
		System.out.println("Kaç kelime girmek istiyorsunuz?");
		do {
			try {
				Scanner scan = new Scanner(System.in);
				sayi = scan.nextInt();
			} catch (Exception e) {
				System.out.println("gecersiz giriþ yaptýnýz.Tekrar kelime sayýsýný girin.");
				sayi = 0;
			}
		} while (sayi < 1);
		String[] Kelimeler = new String[sayi];
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < sayi; i++) {
			System.out.print((i + 1) + ". Kelime=");
			Kelimeler[i] = (k = input.nextLine());
		}
		System.out.print("Aradýðýnýz Kelimeyi Girin=");
		kelime=input.nextLine();
		for (int i = 0; i < Kelimeler.length; i++) {
			if(kelime.length()<=Kelimeler[i].length())
				length=kelime.length();
			else
				length=Kelimeler[i].length();
			for (int j = 0; j < length; j++) {
				if(Kelimeler[i].charAt(j)!=kelime.charAt(j)) {
					count++;
				}
				}
			if(count==1)
				System.out.println("Bunu Mu Aramak Ýstediniz?="+Kelimeler[i]);
			count=0;
		}

	}
}
