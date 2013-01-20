package com.smartThings.ipcalc;
import android.R.string;
import android.util.Log;

public class alg {
	private int x;
	private int i;
	private double n, n1;
	private int I;
	private int a1, a2, a3, a4;
	private int a3_temp_iter;
	private String[][] arr; 
	private int licznik=0;
	
	public alg()
	{
		this.x=256;
		this.i=1;
		this.n=1;
		this.n1=0;
		this.i=1;
		this.a1=192;
		this.a2=168;
		this.a3=0;
		this.a4=0;
		this.a3_temp_iter=0;
		this.arr=new String[10][7];
	}
	
	public String[][] alg_calc()
	{
		n1 = x;
		while(i++<10)
		{
			while(I<=30)
			{
				n=Math.pow(2, (32-I))-2;//wyliczenie n-2^do pierwszej potêgi ktora daje mneijszy wyniki od <x i I-maska
				if(n<=x)
				{
				int a3_temp=0;//pomocnicze zmienne do wyliczenia
				int a4_temp=255;
				Log.e("Liczba hostów to ",Double.toString(n));
				n1=n1-n;
				Log.e("Liczba pozosta³ych hostów do podzielenia ",Double.toString(n1));
				Log.e("Maska podsieci to:  ",Double.toString(I));
				Log.e("Adres rozg³oszeniowy  ",Integer.toString(a1)+"."+Integer.toString(a2)+"."+Integer.toString(a3)+"."+Integer.toString(a4));
				Log.e("Pierwszy host  ",Integer.toString(a1)+"."+Integer.toString(a2)+"."+Integer.toString(a3)+"."+Integer.toString(a4+1));
				arr[licznik][3]=Integer.toString(a1)+"."+Integer.toString(a2)+"."+Integer.toString(a3)+"."+Integer.toString(a4);//adres rozgloszeniowy
				arr[licznik][4]=Integer.toString(a1)+"."+Integer.toString(a2)+"."+Integer.toString(a3)+"."+Integer.toString(a4+1);//pierwszy host
				
				if (n > 255)
                {
                    while (a3_temp < n)
                    {
                        a3_temp_iter++;
                        a3_temp += 255;
                        a3 = a3_temp_iter;
                        a4 = a4_temp - 1;
                        
                    }
                }
				else
                {
                    a4 = (int)n; 
                }
				Log.e("Ostatni host  ",Integer.toString(a1)+"."+Integer.toString(a2)+"."+Integer.toString(a3)+"."+Integer.toString(a4));
				Log.e("Adres rozg³oszeniowy  ",Integer.toString(a1)+"."+Integer.toString(a2)+"."+Integer.toString(a3)+"."+Integer.toString(a4+1));
				
				
				 arr[licznik][0]=Integer.toString(i);//ID
				 arr[licznik][1]=Double.toString(n);//Liczba hostow
				 arr[licznik][2]=Integer.toString(I);//maska
				 arr[licznik][5]=Integer.toString(a1)+"."+Integer.toString(a2)+"."+Integer.toString(a3)+"."+Integer.toString(a4);//ostatni host
				 arr[licznik][6]=Integer.toString(a1)+"."+Integer.toString(a2)+"."+Integer.toString(a3)+"."+Integer.toString(a4+1);//adres rozgloszeniowy
				 
				 x = (int)n1;//ponowne ustawienie zmiennych tymczasowych
                 I = 0;
                 n = 1;
                 a4 = 0;
                 a3 += 1;
                 licznik++;
                 break;
				}
				I++;
				
			}
		}
		Log.e("obejscia:  ",Integer.toString(licznik));
	  return arr;
	}

}
