/* input value for n
5
abcde
abcd
abc
ab
a

1

*/

package Patterns;

import java.io.*;
public class Pattern2_8
{
    public static void main(String args[])throws IOException
    {
        int i,j;
        System.out.println("input value for n");
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());//

        for(i=5;i>=1;i--)
        {  char ch='a';
            for (j=1;j<=i;j++)
            System.out.print(ch++);
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