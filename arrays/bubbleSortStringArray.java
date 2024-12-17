package Arrays;

import java.io.*;
class bubbleSortStringArray
{

  void bubble(String a[])
    {
        for(int i=1;i<=a.length;i++)
      {
          for(int j=0;j<a.length-i;j++)
               {
               if((a[j].compareTo(a[j+1]) )>0)
                  {String temp=a[j];
                  a[j]=a[j+1];
                  a[j+1]=temp;
                 }
             }
        
        }
        //Display the Sorted Array
        
        for(int i=0;i<a.length;i++)
        {System.out.println(a[i]);
         }
    }

   public static void main(String args[])throws IOException
   { 
       bubbleSortStringArray obj=new bubbleSortStringArray();
       String temp;
       String a[]={"dia","ria","jia","sia","nia"};
        obj.bubble(a);
      
   }
 
}//Claas