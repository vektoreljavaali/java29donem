package cemal;

import java.util.Scanner;

public class kolaysorular {

	public void Say() {// Soru 1
		// for dongusu
		for (int i = 20; i >= 10; i--) {
			System.out.println("For Dongusu:" + i);
		}

		// while dongusu
		int j = 20;
		while (j >= 10) {
			System.out.println("While Dongu:" + j);
			j--;
		}

		// do while
		int d = 20;
		do {
			System.out.println("do while Dongu:" + d);
			d--;

		} while (d >= 10);
	}// Dongu parantez

	public void Farkli() {// Soru 2
		Scanner sc = new Scanner(System.in);

		int sayi1, sayi2;

		System.out.print("Sayi 1: ");
		sayi1 = sc.nextInt();
		System.out.print("Sayi 2:");
		sayi2 = sc.nextInt();
		if (sayi1 < sayi2) {
			System.out.println("Sayi2 buyuk sayi 1 den");
		} else if (sayi1 > sayi2) {
			System.out.println("sayi 1 buyuktur sayi 2 den.");
		} else {
			System.out.println("Sayilar esit");
		}
	}// Karsilastirma Parantez

	public void Ucerli() {// Soru 3
		for (int i = 5; i <= 20; i += 3) {
			System.out.println(i);
		}
	}// Arttirma Parantez

	public void Durum() {
		Scanner giris = new Scanner(System.in);
		System.out.print("Bir Sayi Giriniz:");
		int sayi;
		sayi = giris.nextInt();
		if (sayi > 0) {
			System.out.println("Pozitif.");
		} else if (sayi < 0) {
			System.out.println("Negatif.");
		} else {
			System.out.println("Sifir.");
		}
	}// Durum Parantez 

	public static int BuyukSayi(int sayi1, int sayi2, int sayi3) {
		int Buyuk;
		if (sayi1 > sayi2) {
			Buyuk = sayi1;
		} else {
			Buyuk = sayi2;
		}
		if (sayi3 > sayi2) {
			Buyuk = sayi3;
		}
		return Buyuk;
	}// Buyuk Sayi
}