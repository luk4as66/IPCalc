/*
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace IP
{
    class Program
    {
        static void Main(string[] args)
        {
           
            int x;
            int i=1;
            double n=1;
            int I=1;
            double n1;
            int a1=192;
            int a2=168;
            int a3=0;
            int a4=0;
            int a3_temp_iter = 0;
            int a4_temp_iter = 0;
            Console.WriteLine("Podaj liczbe komputerów");
            x = Convert.ToInt32(Console.ReadLine());
            n1 = x;
            Console.WriteLine("wartosc X= "+x);
            Console.WriteLine("*******************************-");

            while (i++ < 10)
            {
                while (I <= 30)
                {
                    n = Math.Pow(2, (32 - I)) - 2;
                   

                    if (n <= x)
                    {
                        int a3_temp = 0;
                        
                        int a4_temp = 255;
                        Console.WriteLine("liczba hostow to:" + n);
                        n1 = n1 - n;
                        Console.WriteLine("liczba hostow pozostalych do podzielenia:" + n1);
                        Console.WriteLine("Maska podsieci to:" + I);
                        
                        Console.WriteLine("Adres rozgloszeniowy: "+a1+"."+a2+"."+a3+"."+a4);
                        Console.WriteLine("Pierwszy host " + a1 + "." + a2 + "." + a3 + "." + (a4 + 1));
                        
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
                            //a3 = a3_temp_iter;
                            a4 = (int)n;
                            Console.WriteLine("chuu");
                            
                        }
                        
                        Console.WriteLine("Ostatni host " + a1 + "." + a2 + "." + a3 + "." + a4);
                        Console.WriteLine("Rozgloszeniowy " + a1 + "." + a2 + "." + a3 + "." + (a4+1));
                        Console.WriteLine("\n");
                        Console.WriteLine("---------------------------------------------------------------------");
                        x = (int)n1;
                        I = 0;
                        n = 1;
                        a4 = 0;
                        a3 += 1;
                        
                        break;
                    }

                    I++;
                }
            }
            

            


            Console.ReadKey();

        }
    }
}
*/

/*ZAKODZ TO PRZETESTOWANE POWINNO BYC OK*/