package rifatcan;

import java.util.Scanner;

public class kosullar 
{
	
	public void sayiTahmin()
	{
		Scanner sc = new Scanner(System.in);
		int sayigir = 0 , sabitsayi = 6;
		
		do
		{
			System.out.println("Lüften Bir Sayý Giriniz.");
			sc.nextInt();
		}
		while(sayigir == sabitsayi);
		System.out.println("Buldun.");
	}

}
