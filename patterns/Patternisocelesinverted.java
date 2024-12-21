/*
input value for n
4
*******
 *****
  ***
   *

 */

package Patterns;
import java.io.*;


public class Patternisocelesinverted
{
	public static void main(String args[])throws IOException
    {
        int i,j;
        System.out.println("input value for n");
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());//
        for(i=n;i>=1;i--)
        {
            for(j=i;j<n;j++)
            System.out.print(" ");
            for(j=1;j<=2*i-1;j++)
            System.out.print("*");
            
          System.out.println();
          
        }
    }     
}
