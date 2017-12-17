package com.Hocam;

public class Diziler {

	
	public void TekBoyutluDiziler()
	{
		int Sayisaldizi[] = new int[5];
		
		Sayisaldizi[0] = 1;
		Sayisaldizi[1] = 2;
		Sayisaldizi[2] = 3;
		Sayisaldizi[3] = 4;
		Sayisaldizi[4] = 5;
		
		String SozelDizi[] = new String[5];
		
		SozelDizi[0] = "Deðer-1";
		SozelDizi[1] = "Deðer-2";
		SozelDizi[2] = "Deðer-3";
		SozelDizi[3] = "Deðer-4";
		SozelDizi[4] = "Deðer-5";
		
		String SinifNumaraListesi[][] = new String[5][2];
		
		SinifNumaraListesi[0][0] = "1";
		SinifNumaraListesi[0][1] = "Ece";
		
		SinifNumaraListesi[1][0] = "1";
		SinifNumaraListesi[1][1] = "A Kadir";
		
		SinifNumaraListesi[2][0] = "1";
		SinifNumaraListesi[2][1] = "Hoca";
		
		Sayisaldizi = new int[]{1,2,3,4,5};
		SozelDizi = new String[] {"Deðer-1","Deðer2"};
		
		
	
		
		for (int i = 0; i < 5; i++) {
					
					for (int j = 0; j < 2; j++) {
						SinifNumaraListesi[i][j] = i+ " - "+ j;
					}
		
		}
		
	
		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j < 2; j++) {
				System.out.println(SinifNumaraListesi[i][j]);
			}

}


		
		
	 
	
			
	}	
}
