/* 
input value for n
5
1
12
123
1234
12345


*/

package Patterns;

import java.io.*;
public class Pattern3
{
    public static void main(String args[])throws IOException
    {
        int i,j;
        System.out.println("input value for n");
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());//

        for(i=0;i<n;i++)
        {for (j=0;j<=i;j++)
            System.out.print(j+1);
                System.out.println("");}
            }
}
/* wrapper Classes
 *byte  - Byte
 *short - Short
 *int   - Integer
 *long  - Long
 *float - Float
 *double - Double
 *char - Character
 *boolean - Boolean
 */