/*
input value for n
5
    5
   45
  345
 2345
12345

 */

package Patterns;
import java.io.*;
public class Pattern3_6
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
            for(k=i;k<=n;k++)
            System.out.print(k);
            
         System.out.println();
        }
    }
}
