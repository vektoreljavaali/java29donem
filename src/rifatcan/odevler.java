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
		for (int k = 5; k <= 20; k+=3) 
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
		
		
		System.out.println("Lütfen 1. Sayýyý Giriniz...");
		int sayi1 = sgir.nextInt();
		System.out.println("Lütfen 2. Sayýyý Giriniz...");
		int sayi2 = sgir.nextInt();
		System.out.println("Lütfen 3. Sayýyý Giriniz...");
		int sayi3 = sgir.nextInt();
		
		int buyuksayi;
		
		if(sayi1 > sayi2 && sayi1 > sayi3)
		{
			buyuksayi = sayi1;
		}
		else if (sayi2 > sayi1 && sayi2 > sayi3)
		{
			buyuksayi = sayi2;	
		}
		else
		{
			buyuksayi = sayi3;
		}
		System.out.println("En Büyük Sayý : " + buyuksayi);
	}
	
	//ZOR SORULAR
	//01- 9.000 den baþlayarak 10.000 e kadar olan sayýlarýn içinden tek ve çift sayýlarý bulup toplamýný ekrana yazdýran,
	//02- 1 den 1.000 e kadar olan sayýlarýn içindeki asal sayýlarý bulan program.
	//03- öðrenciden vize ve final notlarýný alan ve ortalama notu hesaplayýp. harf karýþýlýðýný bulan program. AA,AB.....FF 
	//04- 3,1,33,12,6,90 sayýlarýný küçükten büyüðe sýralayýnýz.
	//05- yýldýz simgesi kullanýlarak istenilen uzunlukta kare çiziniz. mesela: 5 yýldýz olsun
	//  * * * * * 
	//  *       *
	//  *       *
	//  *       *
	//  * * * * *
	// Baþarýlar
	
	public void tekcift()
	{
		
		int tek = 0 , cift = 0;
		
		
		for (int i = 9000; i <= 10000; i++) 
		{
			if(i%2==0)
			{
				cift = cift + i;
				System.out.println("Çift Sayýlarýn Toplamý : " + cift);
				
			}
			else
			{
				tek = tek + i;
				System.out.println("Tek Sayýlarýn Toplamý : " + tek);
			}
			
			
		}
	}
	
	public void harfnotu()
	{
		Scanner vf = new Scanner(System.in);
		int vize , fnl , ortalama = 0 ;
		
		System.out.println("Lüften Vize Notunu Giriniz...");
		vize = vf.nextInt();
		System.out.println("Lütfen Final Notunu Giriniz...");
		fnl = vf.nextInt();
		
		ortalama = (vize + fnl) / 2;
		
		if(ortalama >= 85)
		{
			System.out.println("Harf Notu Aralýðý : AA ");
		}
		else if (85 > ortalama && ortalama >= 70)
		{
			System.out.println("Harf Notu Aralýðý : BA ");
		}
		else if (70 > ortalama && ortalama >= 60)
		{
			System.out.println("Harf Notu Aralýðý : BB");
		}
	}
	
	
}
