package Generalprgs;
import java.io.*;
public class dice
{
	
	
	public static void main(String args[])throws IOException
		{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input the number(leaving 3 and 18) you want on rolling 3 dice");
		int num=Integer.parseInt(br.readLine());
		for(int a=1;a<=6;a++)
		{
		     for(int b=1;b<=6;b++)
		     {
		         for(int c=1;c<=6;c++)
		         {
		             if((a+b+c)==num)
		               {
		                    System.out.println("dice1 ="+a+"; dice2 ="+b+"; dice3 ="+c+" totals to " + num);
		                  }
		              }//for c
		          }//for b
	   }//for a
  }//psvm
}//class