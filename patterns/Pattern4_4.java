/*
 input value for n
5
55555
 4444
  333
   22
    1


 */

package Patterns;
import java.io.*;


public class Pattern4_4
{
	
	 public static void main(String args[])throws IOException
    {
        int i,j,k;
        System.out.println("input value for n");
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());//
        for(i=n;i>=1;i--)
        {
            for(j=n;j>i;j--)
            System.out.print(" ");
            for(k=1;k<=i;k++)
            System.out.print(i);
            
         System.out.println();
        }
    }
}
