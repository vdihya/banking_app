
package Arrays;
import java.io.*;
public class twod
{
	public static void main(String arg[])throws IOException
	{BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
	     int a[][]=new int[5][4];
	     for(int i=0;i<5;i++)
	     {
	         for(int j=0;j<4;j++)
	         {
	         System.out.println("input value for a["+i+"]["+j+"]");

	        }
	       }
	       
	       for(int i=0;i<5;i++)
	       {
	           for(int j=0;j<4;j++)
	         	        System.out.print(a[i][j]+"\t");
	         System.out.println();
	       }
	       
	     
	   }
}

/*

input value for a[0][0]
1
input value for a[0][1]
2
input value for a[0][2]
3
input value for a[0][3]
4
input value for a[1][0]
11
input value for a[1][1]
22
input value for a[1][2]
33
input value for a[1][3]
44
input value for a[2][0]
10
input value for a[2][1]
20
input value for a[2][2]
30
input value for a[2][3]
40
input value for a[3][0]
34
input value for a[3][1]
45
input value for a[3][2]
56
input value for a[3][3]
67
input value for a[4][0]
90
input value for a[4][1]
80
input value for a[4][2]
70
input value for a[4][3]
60
1	2	3	4	
11	22	33	44	
10	20	30	40	
34	45	56	67	
90	80	70	60
 */
