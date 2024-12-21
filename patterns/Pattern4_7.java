/*
 input value for n
5
12345
 2345
  345
   45
    5
 */

package Patterns;
import java.io.*;


public class Pattern4_7
{
	
	 public static void main(String args[])throws IOException
    {
        int i,j,k;
        System.out.println("input value for n");
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());//
        for(i=1;i<=n;i++)
        {
            for(j=1;j<i;j++)
            System.out.print(" ");
            for(k=i;k<=5;k++)
            System.out.print(k);
            
         System.out.println();
        }
    }
}
