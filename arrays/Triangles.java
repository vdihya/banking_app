package Arrays;
import java.io.*;


public class Triangles
{
	public static void main(String arg[])
	{
	  int a[][]={{1,2,3,4,5},{10,20,30,40,50},{11,22,33,44,55},{111,222,333,444,555},{-1,-2,-3,-4,-5}};
	  //printing the Array
	  for(int i=0;i<5;i++)
	       {
	           for(int j=0;j<5;j++)
	         	        System.out.print(a[i][j]+"\t");
	         System.out.println();
	       }
	       //printing the Left Upper triangle
	       
	       System.out.println("printing the Left Upper triangle");
	       for(int i=0;i<5;i++)
	       {
	           for(int j=0;j<(5-i);j++)
	           System.out.print(a[i][j]+"\t");
	         System.out.println();
	       }
	       System.out.println("printing the Left Upper triangle");
	       for(int i=0;i<5;i++)
	       {
	           for(int j=0;j<5;j++)
	           {if((i+j)<(5))
	         	        System.out.print(a[i][j]+"\t");
	         	 }     
	         System.out.println();
	       }
	      System.out.println("printing the Left Lower triangle");
	        for(int i=0;i<5;i++)
	       {
	           for(int j=0;j<=i;j++)
	           
	         	        System.out.print(a[i][j]+"\t");
	         System.out.println();
	       }
	        
	       	       
	       //printing the Left Lower triangle
	       System.out.println("printing the Left Lower triangle");
	       for(int i=0;i<5;i++)
	       {
	           for(int j=0;j<5;j++)
	           {if(i>=j)
	         	        System.out.print(a[i][j]+"\t");
	         	        } 
	         System.out.println();
	       }
	       
	       //printing the Right Lower triangle
	       System.out.println("printing the Right Lower triangle");
	       for(int i=0;i<5;i++)
	       {
	           for(int k=0;k<5-i;k++)
	           System.out.print("\t");
	           for(int j=0;j<5;j++)
	           {if((i+j)>=(5-1))
	         	        System.out.print(a[i][j]+"\t");
	         	        } 
	         System.out.println();
	       }
	       System.out.println("printing the Right Lower triangle");
	       for(int i=0;i<5;i++)
	       {
	           for(int k=0;k<5-i;k++)
	           System.out.print("\t");
	           for(int j=5-i-1;j<5;j++)
	           
	         	        System.out.print(a[i][j]+"\t");
	         System.out.println();
	       }
	       
	       
	        //printing the Right Upper triangle
	       System.out.println("printing the Right Upper triangle");
	       for(int i=0;i<5;i++)
	       {
	             for(int k=5;k>5-i;k--)
	           System.out.print("\t");
	           for(int j=0;j<5;j++)
	           {if(j>=i)
	         	        System.out.print(a[i][j]+",");
	         	        } 
	         System.out.println();
	       }
	       
	       System.out.println("printing the Right Upper triangle");
	       for(int i=0;i<5;i++)
	       {
	             for(int k=5;k>5-i;k--)
	           System.out.print("\t");
	           for(int j=i;j<5;j++)
	           
	         	        System.out.print(a[i][j]+"\t");
	         System.out.println();
	       }
	    
	   }
}

/*1	2	3	4	5	
10	20	30	40	
11	22	33	
111	222	
-1	
printing the Left Upper triangle
1	2	3	4	5	
10	20	30	40	
11	22	33	
111	222	
-1	
printing the Left Lower triangle
1	
10	20	
11	22	33	
111	222	333	444	
-1	-2	-3	-4	-5	
printing the Left Lower triangle
1	
10	20	
11	22	33	
111	222	333	444	
-1	-2	-3	-4	-5	
printing the Right Lower triangle
					5	
				40	50	
			33	44	55	
		222	333	444	555	
	-1	-2	-3	-4	-5	
printing the Right Lower triangle
					5	
				40	50	
			33	44	55	
		222	333	444	555	
	-1	-2	-3	-4	-5	
printing the Right Upper triangle
1	2	3	4	5	
	20	30	40	50	
		33	44	55	
			444	555	
				-5	
printing the Right Upper triangle
1	2	3	4	5	
	20	30	40	50	
		33	44	55	
			444	555	
				-5	
*/
