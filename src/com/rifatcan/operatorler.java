package com.rifatcan;

public class operatorler {
	
	public void toplama()
	{
		int a = 5 , b = 20 , sonuc;
		sonuc = a + b;
		System.out.println("A ile B'nin toplam Sonucu : " + sonuc);
	}
	
	public void toplamaDegiskenli(int a1 , int b1)
	{
		int sonuc1;
		sonuc1 = a1 + b1;
		System.out.println("A1 ile B1'in Deðiþkenli Toplam Sonucu : " + sonuc1);
	}
	
	public int toplamaGeriDondurme()
	{
		int a2 = 10 , b2 = 35 , sonuc2;
		sonuc2 = a2 + b2;
		return sonuc2;
	}
	
	public void cýkartma()
	{
		int a = 5 , b = 20 , sonuc3;
		sonuc3 = a - b;
		System.out.println("A'dan B'yi çýkarttýðýmýzdaki sonuç : " + sonuc3);
	}
	
	public void cýkartmaDegiskenli(int a1 , int b1)
	{
		int sonuc4;
		sonuc4 = a1 - b1;
		System.out.println("A'dan B'yi Çýkarttýðýmýzdaki Deðiþkenli sonuç : " + sonuc4);
	}
	
	public int cýkartmaGeriDondurme()
	{
		int a2 = 10 , b2 = 35 , sonuc5;
		sonuc5 = a2 - b2;
		return sonuc5;
	}
	
	public void carpma()
	{
		int a = 5 , b = 20 , sonuc6;
		sonuc6 = a * b;
		System.out.println("A ile B'nin Çarpým Sonucu : " + sonuc6);
	}
	
	public void carpmaDegiskenli(int a1 , int b1)
	{
		int sonuc7;
		sonuc7 = a1 * b1;
		System.out.println("A1 ile B1'in Deðiþkenli Çarpým Sonucu : " + sonuc7);
	}
	
	public int carpmaGeriDondurme()
	{
		int a2 = 10 , b2 = 35 , sonuc8;
		sonuc8 = a2 * b2;
		return sonuc8;
	}
	
	public void bolme()
	{
		int a = 5 , b = 20 , sonuc9;
		sonuc9 = a / b;
		System.out.println("A'nýn B'ye bölüm Sonucu : " + sonuc9);
	}
	
	public void bolmeDegiskenli(int a1 , int b1)
	{
		int sonuc10;
		sonuc10 = a1 * b1;
		System.out.println("A1'in B1'e  Deðiþkenli bölüm Sonucu : " + sonuc10);
	}
	
	public int bolmeGeriDondurme()
	{
		int a2 = 10 , b2 = 35 , sonuc11;
		sonuc11 = a2 * b2;
		return sonuc11;
	}

	public void modalma()
	{
		int a = 5 , b = 20 , sonuc12;
		sonuc12 = a % b;
		System.out.println("A ile B'nin mod alým sonucu : " + sonuc12);
	}
	
	public void modalmaDegiskenli(int a1 , int b1)
	{
		int sonuc13;
		sonuc13 = a1 % b1;
		System.out.println("A1 ile B1'in Deðiþkenli Mod Alma Sonucu : " + sonuc13);
	}
	
	public int modalmaGeriDondurme()
	{
		int a2 = 10 , b2 = 35 , sonuc14;
		sonuc14 = a2 % b2;
		return sonuc14;
	}

}
