/*
 input value for n
5
54321
 5432
  543
   54
    5



 */

package Patterns;
import java.io.*;


public class Pattern4_6
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
            for(k=n;k>=i;k--)
            System.out.print(k);
            
         System.out.println();
        }
    }
}
