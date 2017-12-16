package com.rifatcan;

import java.util.InputMismatchException;
import java.util.Scanner;

public class tryCatchFinalyYapýsý 
{

	public static void main(String[] args) 
	{
		int a = 1;
		int ab=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen bir sayý giriniz....: ");
	try {
		ab = sc.nextInt();
		a=ab/0;
	} 
	catch (InputMismatchException e) 
	{
	//System.out.println("Girmiþ olduðunuz sayý geçersizdir. float yada String tipte ifade girdiniz.");
		a=25;	
	} 
	catch (Exception e) 
	{
		System.out.println("Beklenmeyen bir hat oluþtu sistem yöneticiniz ile görüþürnüz.50");
	}
	finally 
	{
		System.out.println("Her halükarda iþler");
	}
		a=ab;
		System.out.println("sonuç.....: "+(a/5));
	}
}
