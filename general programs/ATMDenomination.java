package Generalprgs;

import java.io.*;

public class ATMDenomination
 {
     public void denom(int n)
     {  int d=0;
         d = n/1000;
         System.out.println("Rs 1000 "+ d + "notes");
         n=n%1000;
         d=n/500;
         System.out.println("Rs 500 "+ d + "notes");
         n=n%500;
         d=n/100;
         System.out.println("Rs 100 "+ d + "notes");
         n=n%100;
         d=n/50;
         System.out.println("Rs 50 "+ d + "notes");
         n=n%50;
         d=n/20;
         System.out.println("Rs 20 "+ d + "notes");
         n=n%20;
         d=n/10;
         System.out.println("Rs 10 "+ d + "notes");
         n=n%10;
         d=n/5;
         System.out.println("Rs 5 "+ d + "notes");
         n=n%5;
         d=n/2;
         System.out.println("Rs 2 "+ d + "notes");
         n=n%2;
         d=n/1;
         System.out.println("Rs 1 "+ d + "notes");
        }
     
     
     public static void main(String args[])throws IOException
     {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Input the Amount");//Eg 1888
      int Amt=Integer.parseInt(br.readLine());
       ATMDenomination obj=new ATMDenomination();
       obj.denom(Amt);

        }
}
