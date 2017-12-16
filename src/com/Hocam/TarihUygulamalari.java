package com.Hocam;

import java.time.DayOfWeek;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class TarihUygulamalari {


	/** 
	 * Bu metot Haftanýn içinde bulunulan günün getirir.
	 * @return
	 */
	public String HaftaninGununuGetir() {
		 
		 ZonedDateTime now = ZonedDateTime.now();
		 DayOfWeek gun = now.getDayOfWeek();
		 int Igun = gun.getValue();
		
		 String result="";
		
	     switch (Igun) {
	     case 1 : result="Pazartesi"; break;
	     case 2 : result="Salý"; break;
	     case 3 : result="Çarþamba"; break;
	     case 4 : result="Perþembe"; break;
	     case 5 : result="Cuma"; break;
	     case 6 : result="Cumartesi"; break;
	     default : result="Pazar"; break;
   
	     }
	    
	    return result;
	     
	}// HaftaninGununuGetir() Metot Sonu

	
	/**
	 * aþaðýda bulunan sorulara cevap verir
	 * 1- Selam
	 * 2- Nasýlsýn
	 * 3- Ýyiyim
	 * 4- Nerelisin
	 * 5- Sen bir program mýsýn
	 * 6- Ýyi günler o zaman
	 * Finish Cevabý : size de iyi günler dilerim.
	 * @param ifade : konuþma metnini girebilisiniz
	 * @return : ilgili sorulara gerekli cevaplarý verir
	 */
	public String KonusmaSimulasyonu(String ifade) {
		String result="";
		switch (ifade) {
		
		case "Selam": result="Computer: Selam";	break;
		case "Nasýlsýn" : result="Computer: Ýyiyim, siz nasýlsýnýz?";	break;
		case "Ýyiyim": result="Computer: ";	break;
		case "Nerelisin": result="Computer:  Ankaralý, siz nerelisiniz?";	break;
		case "Sen bir program mýsýn": result="Computer: Evet, sizinle konuþmak üzere programlandým";	break;
		case "Ýyi günler o zaman": result="Computer: size de iyi günler dilerim.";	break;
		default: result="Computer: ";		break;
		}		
		return result;		
	}
	
	
}
