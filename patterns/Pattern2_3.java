/* 
input value for n
5
12345
1234
123
12
1


*/

package Patterns;

import java.io.*;
public class Pattern2_3
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
        {for (j=1;j<=i;j++)
            System.out.print(j);
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