package com.serkan;

import java.util.Scanner;

public class Odevler {

	public void kolaysoru1() {

		for (int i = 0; i <= 10; i++) {

			System.out.println(20 - i);

		}
		int j = 0;

		while (j <= 10) {

			System.out.println(20 - j);

			j++;

		}

		int k = 0;

		do {
			System.out.println(20 - k);
			k++;
		} while (k <= 10);

	}

	public void kolaysoru2() {

		Scanner scn = new Scanner(System.in);
		int ilksayi = 0;
		int ikincisayi = 0;

		System.out.println("ilk sayýyý giriniz");
		ilksayi = scn.nextInt();

		System.out.println("ikinci sayýyý giriniz");
		ikincisayi = scn.nextInt();

		if (ilksayi < ikincisayi) {

			System.out.println("büyük olan sayý " + ikincisayi);

		} else if (ilksayi > ikincisayi) {

			System.out.println("büyük olan sayý " + ilksayi);

		} else
			System.out.println("sayýlar eþit");

	}

	public void kolaysoru3() {

		for (int i = 0; i <= (20 / 3) - 1; i++) {

			System.out.println(5 + (i * 3));

		}
	}

	public void kolaysoru4() {

		Scanner scn = new Scanner(System.in);
		int sayi = 0;

		System.out.println("bir sayi giriniz");
		sayi = scn.nextInt();

		if (sayi > 0) {

			System.out.println("sayi pozitif");

		} else if (sayi < 0) {

			System.out.println("sayi negatif");
		} else
			System.out.println("sayi sýfýr");

	}

	public void kolaysoru5() {

		int ilksayi = 0, ikincisayi = 0, ucuncusayi = 0;

		Scanner scn = new Scanner(System.in);

		System.out.println("ilk sayiyi giriniz");
		ilksayi = scn.nextInt();

		System.out.println("ikinci sayiyi giriniz");
		ikincisayi = scn.nextInt();

		System.out.println("üçüncü sayiyi giriniz");
		ucuncusayi = scn.nextInt();

		if (ilksayi > ikincisayi && ilksayi > ucuncusayi) {

			System.out.println("en büyük sayý " + ilksayi);

		} else if (ikincisayi > ilksayi && ikincisayi > ucuncusayi) {

			System.out.println("en büyük sayý " + ikincisayi);

		} else if (ucuncusayi > ikincisayi && ucuncusayi > ilksayi) {

			System.out.println("en büyük sayý " + ucuncusayi);
		} else {
			System.out.println("en büyük sayý bulunamadý. eþit sayýlar var.");
		}

	}

	public void zorsoru1() {

		int tektoplam = 0, cifttoplam = 0;

		for (int i = 9000; i <= 10000; i++) {

			if (i % 2 == 0) {

				cifttoplam = cifttoplam + i;

			} else {
				tektoplam = tektoplam + i;

			}

		}
		System.out.println("tek sayýlarýn toplamý=" + tektoplam);
		System.out.println("çift sayýlarýn toplamý=" + cifttoplam);

	}

	public void zorsoru2() {

		int sayac = 0;

		for (int i = 1; i <= 1000; i++) {

			for (int j = 1; j <= i; j++) {

				if (i % j == 0) {

					sayac = sayac + 1;

				}

			}

			if (sayac <= 2) {

				System.out.println(i);

			}

			sayac = 0;

		}

	}

	
	public void zorsoru3() {
		
		Scanner scn=new Scanner(System.in);
		
		int vizenotu=0;
		int finalnotu=0;
		int ortalama=0;
		
		
		
		
		System.out.println("vize notunuzu giriniz");
		vizenotu=scn.nextInt();
		System.out.println("final notunuzu giriniz");
		finalnotu=scn.nextInt();
		ortalama=(vizenotu+finalnotu)/2;
		
		if (ortalama<=100 && ortalama>=90) {
			
			System.out.println("AA");
			
		}else if (ortalama<90 && ortalama>=85) {
			
			System.out.println("BA");
			
		}else if (ortalama<85 && ortalama>=80) {
			
			System.out.println("BB");
			
		}else if (ortalama<80 && ortalama>=75) {
			
			System.out.println("CB");
			
		}else if (ortalama<75 && ortalama>=65) {
			
			System.out.println("CC");
			
		}else if (ortalama<65 && ortalama>=58) {
			
			System.out.println("DC");
			
		}else if (ortalama<58 && ortalama>=50) {
			
			System.out.println("DD");
			
		}else if (ortalama<50 && ortalama>=40) {
			
			System.out.println("FD");
			
		}else if (ortalama<40) {
			
			System.out.println("FF");
			
		}
				
		
		
		
		
		
	}
	
	public void zorsoru4() {
		
	}
	
	public void zorsoru5() {
		
		int kareboyutu;
		
		System.out.println("kare boyutunu giriniz");
		Scanner scn=new Scanner(System.in);	
		kareboyutu=scn.nextInt();
		
		for (int i = 1; i <=kareboyutu; i++) {
			System.out.print("* ");
			
			for (int j = 1; j <kareboyutu-1; j++) {
				
				
				
				if (i==1 || i==kareboyutu) {
					System.out.print("* ");
				}else if (j!=1 || j!=kareboyutu) {
					System.out.print("  ");
					 
				}
			
				
				
			}System.out.println("*");
			
			
		}
		
		
		
		
		
	}


	
	
}


