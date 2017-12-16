package com.cemal;

public class zorsorular {

	public void TekSayilar() {
		int i = 9000;
		int toplam = 0;
		for (i = 9000; i < 10000; i++) {
			if (i % 2 == 1) {
				toplam = toplam + i;
			}
		}
		System.out.println("9000 den 10000'e kadar olan tek sayıların toplamı: " + toplam);
	}

	public void CiftSayilar() {
		int i = 9000;
		int toplam = 0;
		for (i = 9000; i < 10000; i++) {
			if (i % 2 == 0) {
				// System.out.println(i);
				toplam = toplam + i;
			}
		}
		System.out.println("9000 den 10000'e kadar olan cift sayıların toplamı: " + toplam);
	}

	public void AsalSayilar() {
		int sayi;
		for (int i = 2; i <= 1000; i++) {
			sayi = 0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0)
					sayi++;
			}
			if (sayi == 0)
				System.out.println(+i);
		}
	}

	public void kare(int cevre) {
		for (int i = 1; i <= cevre; i++) {
			for (int j = 1; j <= cevre; j++) {
				if (i == 1 || i == cevre)
					System.out.print(" *");
				else if (j == 1 || j == cevre)
					System.out.print(" *");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}