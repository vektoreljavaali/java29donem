package rifatcan;

import java.util.Scanner;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class odevler 
{

		//01- 20 den baþlayarak 10 a kadar olan sayýlarý ekrana yazdýran kod //for-while-do..while tüm döngü yapýlarýnda çalýþtýrýn
		//02- Kulanýcýdan iki sayý girmesini bekleyen programýn hangi sayýnýn büyük olduðunu bulmasý bekleniyor. Yani a>b ise ekrana a sayýsýný yazdýrýnýz.
		//03- 5 ten baþlayarak 3 er artarak 20 ye kadar olan sayýlarý yazdýran program.  5,8,11,14,17,20 yazacak.
		//04- girilen sayýnýn nefatif mi pozitif mi olduðunu bulan program.
		//05- girilen 3 sayýdan hangisinin büyük olduðunu bulan kod.
	
	public void sayýsay()
	{
		for (int i = 20; i >=10; i--) 
		{
			System.out.println(i);
		}
	}
	
	public void kullanici()
	{
		Scanner sc = new Scanner(System.in);
		
		int sayi1 , sayi2;
		
		System.out.println("Lütfen Birinci Sayý Giriniz...");
		sayi1 = sc.nextInt();
		System.out.println("Lütfen Ýkinci Sayýyý Giriniz...");
		sayi2 = sc.nextInt();
		if (sayi1 < sayi2) 
		{
			System.out.println("Sayý 2 Sayý 1'den daha büyük.");
		}
		else
		{
			System.out.println("Sayý 1 Sayý 2'den daha büyük.");
		}
	}
	
	
	//5 ten baþlamýþ ama ücer artacak
	public void beserbser()
	{
		for (int k = 5; k <= 20; k+=5) 
		{
			System.out.println(k);
		}
	}
	
	public void negpoz()
	{
		Scanner sayi = new Scanner(System.in);
		
		System.out.println("Lütfen Bir Sayý Giriniz.");
		int girilensayi;
		girilensayi = sayi.nextInt();
		
		if(girilensayi > 0)
		{
			System.out.println("Girdiðiniz Sayý Pozitiftir.");
		}
		else if(girilensayi < 0)
		{
			System.out.println("Girdiðiniz Sayý Negatifdir.");
		}
		else 
		{
			System.out.println("Sayý 0'dýr.");
		}
	}
	
	// Hangi sayýnýn büyük olduðunu bulacak. yani en büyük sayý þudur diyecek. bunu üzerinde biraz daha çalýþ
	public void sayigir()
	
	{
		Scanner sgir = new Scanner(System.in);
		
		int sayi1 , sayi2 , sayi3;
		System.out.println("Lütfen Birinci Sayýyý Giriniz...");
		sayi1 = sgir.nextInt();
		System.out.println("Lütfen Ýkinci Sayýyý Giriniz...");
		sayi2 = sgir.nextInt();
		System.out.println("Lütfen Üçüncü Sayýyý Giriniz...");
		sayi3 = sgir.nextInt();
		
		if(sayi1 < sayi2 )
		{
			System.out.println("Sayi1 Sayi2'den Küçüktür.");
		}
		else if (sayi1 < sayi3)
		{
			System.out.println("Sayi1 Sayi3'ten Küçüktür.");
		}
		else if (sayi2 < sayi1)
		{
			System.out.println("Sayi2 Sayi1'den Küçüktür.");
		}
		else if (sayi2 < sayi3)
		{
			System.out.println("Sayi2 Sayi3'den Küçüktür.");
		}
		else if (sayi3 < sayi1)
		{
			System.out.println("Sayi3 Sayi1'den Küçüktür.");
		}
		else if (sayi3 < sayi2)
		{
			System.out.println("Sayi3 Sayi2'den Küçüktür.");
		}
		else if(sayi1 > sayi2 )
		{
			System.out.println("Sayi1 Sayi2'den Büyüktür.");
		}
		else if (sayi1 > sayi3)
		{
			System.out.println("Sayi1 Sayi3'ten Büyüktür.");
		}
		else if (sayi2 > sayi1)
		{
			System.out.println("Sayi2 Sayi1'den Büyüktür.");
		}
		else if (sayi2 > sayi3)
		{
			System.out.println("Sayi2 Sayi3'den Büyüktür.");
		}
		else if (sayi3 > sayi1)
		{
			System.out.println("Sayi3 Sayi1'den Büyüktür.");
		}
		else if (sayi3 > sayi1)
		{
			System.out.println("Sayi3 Sayi2'den Büyüktür.");
		}
	}
}
