package cemal;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		kolaysorular metod = new kolaysorular();
		
		System.out.println("Birinci Sorunun Cevabi");
		metod.Say();//Soru 1
		
		System.out.println("Ikinci Sorunun Cevabi");
		metod.Farkli();//Soru 2
		
		System.out.println("Ucuncu Sorunun Cevabi");
		metod.Ucerli();//Soru 3
		
		System.out.println("Dorduncu Sorunun Cevabi");
		metod.Durum(); //Soru
		
		
		System.out.println("Besinci Sorunun Cevabi");
		int sayi1, sayi2, sayi3;
		Scanner SayiGir = new Scanner(System.in);
		System.out.println("Sayi girin:");
		sayi1 = SayiGir.nextInt();
		System.out.println("Sayi girin:");
		sayi2 = SayiGir.nextInt();
		System.out.println("Sayi girin:");
		sayi3 = SayiGir.nextInt();
		int sonuc = metod.BuyukSayi(sayi1, sayi2, sayi3);
		System.out.println("En buyuk sayi: " + sonuc);
		
		
		System.out.println("Zor Sorular Kismi");
		zorsorular metod2=new zorsorular();
		metod2.TekSayilar();
		metod2.CiftSayilar();
		metod2.AsalSayilar();
		metod2.kare(5);
	}

}
