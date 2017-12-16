package com.gursel;

import java.util.Scanner;

public class method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void tekrarswitch()
	{
		String[] günler= {"pazartesi","Salý","çarþamba","perþembe","cuma","cumartesi","pazar"};
		Scanner sc=new Scanner(System.in);
		System.out.println("");
		for(int i=0;i<günler.length;i++)
		{
			System.out.print(" "+günler[i]);
		}
		
		System.out.println("");
		System.out.println("");
		System.out.print("gün numarasýný giriniz :");
		int a=sc.nextInt();
		switch(a)
		{
		case 1: System.out.println(günler[0]); break;
		case 2: System.out.println(günler[1]); break;
		case 3: System.out.println(günler[2]); break;
		case 4: System.out.println(günler[3]); break;
		case 5: System.out.println(günler[4]); break;
		case 6: System.out.println(günler[5]); break;
		case 7: System.out.println(günler[6]); break;
		default : System.out.println("error message"); break;
		}
		
	}

}
