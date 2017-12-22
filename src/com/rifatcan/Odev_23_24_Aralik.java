package com.rifatcan;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.YearMonth;
import java.time.ZonedDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Odev_23_24_Aralik 
{
	static String ifade = "Bugün-araba-ile-Ankaraya-gideceðim.";
	static String ifade1 = "Yarýn Bisiklet ile Okula Gideceðim.";
	static String ifade2 = "Akþam-evde-ve-Okulda-Kitap-Okuyacaðým.";
	
	public void yýlkriteri()
	{
        int yil = 0, nowyear, yas = 17;
        nowyear = YearMonth.now().getYear();

        do {
            try 
            {
                System.out.println("Lütfen Bir Yýl Giriniz.");
                Scanner sc = new Scanner(System.in);
               yil = sc.nextInt();
            } catch (InputMismatchException e) 
            {
                System.out.println("Yanlýþ Bir Tarih Kriteri Girdiniz Lütfen Geçerli Bir doðum tarihi giriniz. : ");
                yil = 0;
            }
        } while (yil <= 1900 || yil >= 2017);

        if (nowyear - yil <= yas) 
        {
            System.out.println("Kullanici resit degildir.");
        } else if (nowyear - yil >= yas)
        {
            System.out.println("Kullanýcý Reþittir.");
        }
	}
		
	public void kelimeayir()
	{
		
		//"Bugün-araba-ile-Ankaraya-gideceðim."
		//"Yarýn Bisiklet ile Okula Gideceðim."
		//"Akþam-evde-ve-Okulda-Kitap-Okuyacaðým."
		
		
		System.out.println("Zaman Zarfý : " + ifade.substring(0,5));
		System.out.println("Nesne : " + ifade.substring(6,11));
		System.out.println("Baðlaç : " + ifade.substring(12,15));
		System.out.println("Dolaylý Tümleç : " + ifade.substring(16,24));
		System.out.println("Yüklem : " + ifade.substring(25,35));
		
		System.out.println("Zaman Zarfý : " + ifade1.indexOf("Yarýn"));
		System.out.println("Nesne : " + ifade1.indexOf("Bisiklet"));
		System.out.println("Baðlaç : " + ifade1.indexOf("ile"));
		System.out.println("Dolaylý Tümleç : " + ifade1.indexOf("Okula"));
		System.out.println("Yüklem : " + ifade1.indexOf("Gideceðim."));
		
		System.out.println("Zaman Zarfý : " + ifade2.replaceAll("Akþam-evde-ve-Okulda-Kitap-Okuyacaðým.", "Akþam"));
		System.out.println("Nesne : " + ifade2.replaceAll("Akþam-evde-ve-Okulda-Kitap-Okuyacaðým.", "Evde"));
		System.out.println("Baðlaç : " + ifade2.replaceAll("Akþam-evde-ve-Okulda-Kitap-Okuyacaðým.", "ve"));
		System.out.println("Dolaylý Tümleç : " + ifade2.replaceAll("Akþam-evde-ve-Okulda-Kitap-Okuyacaðým.", "Okulda"));
		System.out.println("Yüklem : " + ifade2.replaceAll("Akþam-evde-ve-Okulda-Kitap-Okuyacaðým.", "Kitap"));
		System.out.println("Yüklem : " + ifade2.replaceAll("Akþam-evde-ve-Okulda-Kitap-Okuyacaðým.", "Okuyacaðým."));
	}
	
	public void bunumudemekistediniz()
	{
		
        System.out.println("Kac kelime girmek istiyorsunuz?");
        Scanner sc = new Scanner(System.in);

        int kelime_sayisi = sc.nextInt();

        String[] kelimeler = new String[kelime_sayisi];

        int[] masraflar = new int[kelime_sayisi];
        int en_dusuk_masraf = 0;

        for(int i = 0; i < kelime_sayisi; i++) 
        {

                System.out.println((i + 1) + ". kelimeyi giriniz: ");
                sc = new Scanner(System.in);

                kelimeler[i] = sc.nextLine();
        }

        System.out.println("Aradiginiz kelimeyi giriniz: ");
        sc = new Scanner(System.in);

        String aranan = sc.nextLine();

        for(int i = 0; i < kelime_sayisi; i++) 
        {

            String kelime = kelimeler[i];
            en_dusuk_masraf = 0;
            // ayni uzunlukta mi?
            if(aranan.length() == kelime.length())
            {

                for(int j = 0; j < aranan.length(); j++) 
                {
                    int c = 0;
                    c += Math.abs(aranan.charAt(j) - kelime.charAt(j));
                    masraflar[i] = c;
                }

            }

        }

        int c = masraflar[0];
        int s = 0;
        for(int i = 0; i < masraflar.length; i++) {
            System.out.println("Masraf " + i + ": " + masraflar[i]);
            if(masraflar[i] < c) {
                c = masraflar[i];
                s = i;
            }
        }

        System.out.println("Bunu mu aramak istediniz? " + kelimeler[s]);

    }
}
