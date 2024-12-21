/*
input value for n
5
    5
   44
  333
 2222
11111

 */

package Patterns;
import java.io.*;
public class Pattern3_8
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
            for(j=i;j>1;j--)
            System.out.print(" ");
            for(k=n;k>=i;k--)
            System.out.print(i);
            
         System.out.println();
        }
    }
}
