package com.rifatcan;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.YearMonth;
import java.time.ZonedDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Odev_23_24_Aralik 
{
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

        if (nowyear - yil <= 17) 
        {
            System.out.println("Kullanici resit degildir.");
        } else if (nowyear - yil == 18)
        {
            System.out.println("");
        }
	}
		
}
