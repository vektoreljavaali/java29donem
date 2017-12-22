package com.eda;

public class Soru2 {
	static String ifade = "Bugün araba ile Ankaraya gideceðim.";

	public void OgelerineAyir() {
		String [] kelime=ifade.split(" ");
		String [] Zaman_Zarflari ={"bugün","Yarýn","Akþam Üzeri","1925 te","dün"};
	    String [] Nesneler 		={"masa","sandalye","kitap","araba","bisiklet"};
		String [] Baglaclar		= {"ve","ile","veya","",""};
		String [] Dolaylý_Tumlec ={"Burada","Ankara","Arabada","okulda","evde"};
		String [] Yuklem		= {"gitmek","gelmek","yüklemek","yürümek","koþmak"};
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(kelime[i].equalsIgnoreCase(Zaman_Zarflari[j]))
				{System.out.println("Zaman Zarfý="+Zaman_Zarflari[j]);}
				if(kelime[i].equalsIgnoreCase(Nesneler[j]))
				{System.out.println("Nesne="+Nesneler[j]);}
				if(kelime[i].equalsIgnoreCase(Baglaclar[j]))
				{System.out.println("Baðlaç="+Baglaclar[j]);}

			}
		}
		int count=0;
		String bir=" ",iki=" ";
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				bir=kelime[i].substring(0,3);
				iki=Dolaylý_Tumlec[j].substring(0, 3);
				if(bir.equals(iki)) {
					System.out.println("Dolayli Tümlec="+kelime[i]);
				}
				bir=kelime[i].substring(0,2);
				iki=Yuklem[j].substring(0,2);
					if(bir.equals(iki)) {
					System.out.println("Yüklem="+kelime[i]);
				}
				
			}
		}
		
	}
}
