package com.cemal;

import java.time.YearMonth;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class pratik {

	private Scanner oku;

	public void TarihBul() {
		oku = new Scanner(System.in);
		int yil = 1900, guncelyil, yas;
		guncelyil = YearMonth.now().getYear();

		do {
			if (yil < 1900 || yil > 9999) {
				System.out.println("Gecerli Dogum yili giriniz(YYYY): ");
			}
			System.out.print("Dogdugu yili giriniz(YYYY): ");
			yil = oku.nextInt();

		} while (yil < 1900 || yil > 9999);
		
		yas = guncelyil - yil;
		if (yas <= 17)
			System.out.println("Resit Degilsin");
		else if (yas == 18)
			System.out.println("On Sekiz");
		else if (yas == 19)
			System.out.println("On Dokuz");
		else if (yas == 20)
			System.out.println("Yirmi");
		else if (yas == 21)
			System.out.println("Yirmi Bir");
		else if (yas == 22)
			System.out.println("Yirmi Iki");
		else if (yas == 23)
			System.out.println("Yirmi Uc");
		else if (yas == 24)
			System.out.println("Yirmi Dort");
		else
			JOptionPane.showMessageDialog(null,"Yaşlılar için, öğrenme mevsimi her zamandır.");
	}
}
