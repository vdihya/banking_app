package Generalprgs;
import java.io.*;

/**
 * Write a description of class Resistance here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Resistance
{
   
   
   static void calculate(String first,String second,String third)
    {
     int I=Search(first);
     int II=Search(second);
     int III=Search(third);
     
     double resis=(I*10+II)*Math.pow(10,III);
     
      System.out.println("Resistance="+resis);  
        
    }

static int Search(String s)
        {
            String str[]={"black","blue","red","orange","yellow","green","brown","violet","grey","white"};
             int i,flag=0;int pos=-1;
        
        
          for( i=0;i<str.length;i++)
          {
               if(str[i].equalsIgnoreCase(s))
               {flag=1;pos=i;
               break;}
            }  
           if(flag==1)
            return pos;
            else 
            return -1;
        }

   public static void main(String args[])throws IOException
   {
      BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
      
      
      System.out.println("Input I colorcode");
      String I=br.readLine();
      System.out.println("Input II colorcode");
      String II=br.readLine();
      System.out.println("Input III colorcode");
      String III=br.readLine();
      
      calculate(I,II,III);
      
       
    }


}
