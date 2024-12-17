package Arrays;
import java.io.*;


public class Searching
{
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
   void BinarySearch(int x[])throws IOException
    {int flag=0;
        
        System.out.println("input the number to be searched");
        int n=Integer.parseInt(br.readLine());
        int L,U,M=0;
        L=0;
        U=9;
        while(L<=U)
        {
            M=(L+U)/2;
            if(n<x[M])
            U=M-1;
            else if(n>x[M])
            L=M+1;
            else
            {flag=1;
                break;}
            }
            if(flag==1)
            System.out.println("The element is found at position"+(M+1));
            else
            System.out.println("The element is not found in the array");
        }
    
        
        void LinearSearch(int a[])throws IOException
        {
             int i,flag=0;
        
        System.out.println("input the number to be searched");
        int n=Integer.parseInt(br.readLine());
          for( i=0;i<a.length;i++)
          {
               if(a[i]==n)
               {flag=1;
               break;}
            }  
           if(flag==1)
            System.out.println("The element is found at position"+(i+1));
            else
            System.out.println("The element is not found in the array"); 
        }
    
   
        public static void main(String args[])throws IOException
      {
           Searching obj=new Searching();
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int x[]=new int[10];
      for(int i=0;i<10;i++)
      {System.out.println("input value for x["+i+"]");
       x[i]=Integer.parseInt(br.readLine());
       }   
       obj.BinarySearch(x);
       
       obj.LinearSearch(x);
      
    }
}
