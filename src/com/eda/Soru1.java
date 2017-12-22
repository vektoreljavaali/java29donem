package com.eda;

import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Soru1 {
	public void Yas() {
		Calendar cal = Calendar.getInstance();
	    int yil=0;
	    boolean x=false;
	    final int year = cal.get(Calendar.YEAR);
	    do {
			 
			 try {
				 x=true;
				 System.out.println("Geçerli Bir Yýl Girin..");	 
			 Scanner input=new Scanner(System.in);
			 yil=input.nextInt();
			 	if(yil<1700 || yil>2017) 
					yil=yil/0;
			} catch (InputMismatchException e) {
				System.out.println("String Girdiniz..");
				x=false;
				}
				catch (ArithmeticException e2) {
					System.out.println("Girilen Yýl Geçersiz..");
					x=false;
				}
			}while (x==false);
	 if(year-yil<18) System.out.println("Yasiniz Reþit Deðildir.");
	 else {
		 for(int i=18;i<=24;i++) {
			 String a=String.valueOf(i);
			 System.out.println(a);
	
		 }
	 }
	}
}
