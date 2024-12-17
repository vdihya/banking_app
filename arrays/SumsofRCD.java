package Arrays;
import java.io.*;

public class SumsofRCD
{
	public static void main(String args[])throws IOException
	{
	     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	     System.out.println("input the number of rows");
	     int r=Integer.parseInt(br.readLine());
	     System.out.println("input the number of Cols");
	     int c=Integer.parseInt(br.readLine());
	    int a[][]=new int[r][c];
	    for(int i=0;i<r;i++)
	     {
	         for(int j=0;j<c;j++)
	         {
	         System.out.println("input value for a["+i+"]["+j+"]");
	         a[i][j]=Integer.parseInt(br.readLine());
	        }
	       }
	       //Sum of Each Row
	        for(int i=0;i<r;i++)
	     {int sumrow=0;
	         for(int j=0;j<c;j++)
	         {
	          sumrow+=a[i][j];
	          }
	          System.out.println("The sum of "+(i+1)+" row is "+sumrow);
	       }
	       //Sum of Each Column
	       for(int i=0;i<r;i++)
	       {int sumcol=0;
	         for(int j=0;j<c;j++)
	         {
	          sumcol+=a[j][i];
	          }
	          System.out.println("The sum of "+(i+1)+" column is "+sumcol);
	       }
	       //sum of rows should be equal to sum of columns
	        //Sum of Diagonal1
	        int d1=0;
	       for(int i=0;i<r;i++)
	       {
	         for(int j=0;j<c;j++)
	         {
	             if(i==j)
	             d1+=a[j][i];
	          }
	         
	       }
	       System.out.println("The sum of the first diagonal is "+d1);
	       
	       //Sum of Diagonal2
	       int d2=0;
	       for(int i=0;i<r;i++)
	       {
	         for(int j=0;j<c;j++)
	         {
	             if((i+j)==(r-1))
	             d2+=a[j][i];
	          }
	         
	       }
	       System.out.println("The sum of the second diagonal  is "+d2);
	       
	       for(int i=0;i<r;i++)
	       {
	           for(int j=0;j<c;j++)
	         	        System.out.print(a[i][j]+"\t");
	         System.out.println();
	       }
	   }
}