package com.gursel;

public class runner {

	public static void main(String[] args) {
	         
		 /* çift ve tek sayýlarýn karelerinin toplamý*/
		
		int Csonuc=0;
		int Tsonuc=0;
	  for(int i=1;i<=4;i++)
	  {
		  if(i%2==0)
		  {
			  Csonuc=Csonuc+(i*i);
			  System.out.println("Çift syýlarýn karelerinin toplamý : "+ Csonuc);
		  }
		  else
		  {
			  Tsonuc=Tsonuc+(i*i);
			  System.out.println("Tek syýlarýn karelerinin toplamý : "+ Tsonuc);
		  }
	  }
	  System.out.println("Csonuc ve Tsonuc toplamý : "+ (Csonuc+Tsonuc));

	}

}
