package Arrays;
import java.io.*;
public class Sorting
{
    void selection(int a[])
    {
        
      for (int i=0;i<a.length;i++)
      {
          int small=a[i];
          int pos=i;
          for(int j=i+1;j<a.length;j++)
          {
              if(a[j]<small)
              small=a[j];
              pos=j;
            }
            int temp=a[i];
            a[i]=a[pos];
            a[pos]=temp;
        }
            System.out.println("The array in the ascending order is");
            for(int k=0;k<a.length;k++)
            System.out.print(" "+a[k]);
        }  
       
        
    
       
       void bubble(int a[])
       {  int n=a.length;
          for(int i=0;i<a.length;i++)
          {
               for(int j=0;j<n-i-1;j++)
               {
                   if(a[j]>a[j+1])
                   {
                       int temp=a[j];
                       a[j]=a[j+1];
                       a[j+1]=temp;
                    }
                }
            }
           
           System.out.println("The array in the ascending order is");
            for(int k=0;k<a.length;k++)
            System.out.print(" "+a[k]);
           
       }





    public static void main(String arg[])throws IOException
    {    
        Sorting s= new Sorting();
        int ch;
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
         int a[]=new int[5];
         for(int i=0;i<5;i++)
         {System.out.println("input a["+i+"]");
             a[i]=Integer.parseInt(br.readLine());
           }
           //Display the unsorted array
           for(int i=0;i<5;i++)
         {System.out.println(a[i]+"\t");
             
           }
           do
           {
           System.out.println("Input your choice 1.Selection 2.Bubble  -1 to Exit");
           ch=Integer.parseInt(br.readLine());
           if(ch==1)
           s.selection(a);
           else if(ch==2)
           s.bubble(a);
           else if(ch==-1)
           System.exit(0);
           else
           System.out.println("Invalid Choice");
       }while(ch!=-1);
       
       
       
           
}
}