/*
input value for n
5
    1
   22
  333
 4444
55555
 */

package Patterns;
import java.io.*;
public class Pattern3_4
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
            for(j=1;j<=n-i;j++)
            System.out.print(" ");
            for(k=1;k<=i;k++)
            System.out.print(i);
            
         System.out.println();
        }
    }
}
