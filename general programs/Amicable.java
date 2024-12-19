package Generalprgs;
import java.io.*;
class Amicable
{
 int a,b;// Instance variables are supplied with default values in Java.
  public Amicable()
   { 
    a=220;
    b=284;

  }
  public Amicable(int a, int b)
   { 
    this.a=a;
    this.b=b;

  }

public  void CheckAmicable()
    { int suma=0,sumb=0;
     
      for(int i=1;i<a;i++)
      {if(a%i == 0)
      suma=suma+i;}
      
      
      for(int j=1;j<b;j++)
      {if(b%j == 0)
      sumb=sumb+j;}
      
      if(suma==b && sumb==a)
      System.out.println("Both are AMicable");
     
      else
      System.out.println("not Amicable");
   }
   
   public static void main(String arg[])throws IOException
   {BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   
      System.out.println("Input a  to find if they are Amicable");
            int a=Integer.parseInt(br.readLine());
            System.out.println("Input b  to find if they are Amicable");
            int b=Integer.parseInt(br.readLine());
            Amicable obj=new Amicable(a,b);
            obj.CheckAmicable();
            Amicable obj2=new Amicable();
            obj2.CheckAmicable();
              
  }
  
}