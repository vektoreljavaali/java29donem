package com.sezgin;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

import java.util.Calendar;
import java.util.InputMismatchException;

public class aralik23_24_odev_metotlar {

	public void resit() {
		int yas=0, buyil=0, i=0, j=0;
		String dogumYiliS="";
		
		boolean logic=true;
		
		Calendar simdi=Calendar.getInstance();
		buyil = simdi.get(Calendar.YEAR);   
		
		Scanner yilGirisi = new Scanner(System.in);
		
		
		
		do {
			yas=1;
			System.out.println("Lütfen doğum yılınızı giriniz");
			dogumYiliS = yilGirisi.nextLine();
		try {
			
		int dogumYiliR = Integer.parseInt(dogumYiliS);
			yas=buyil-dogumYiliR;
			logic=false;
		} catch (Exception e) {
			
			System.out.println("Lütfen tarih değerini rakam olarak giriniz.");
					logic=true;
				
		}
		if (yas<0) {
			System.out.println("doğum yılı, bulundugumuz yildan buyuk olamaz");
		logic=true;
		}
	
		}
	while (logic==true);
		
		if (yas<18)
			System.out.println("reşit değilsiniz");
		
		else {
		
		switch (yas) {
        case 18 :
            System.out.println("yaşınız onsekiz");
            break;

        case 19 :
            System.out.println("yaşınız ondokuz");
            break;

        case 20 :
            System.out.println("yaşınız yirmi");
            break;
            
        case 21 :
            System.out.println("yaşınız yirmibir");
            break;
            
        case 22 :
            System.out.println("yaşınız yirmiiki");
            break;
            
        case 23 :
            System.out.println("yaşınız yirmiüç");
            break;
            
        case 24 :
            System.out.println("yaşınız yirmidört");
            break;
            
            
        default :
            System.out.println("yaşınız yirmidörtten büyük");
            break;
		
		}
		
		}
	}//metot sonu
	
}//class sonu
