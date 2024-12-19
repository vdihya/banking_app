package Generalprgs;
import java.io.*;

public class Current
{
static double pi=3.142;
double R,I,E,Z,f,L,C;
 void accept()throws IOException
 {
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Input value for R");
      R=Double.parseDouble(br.readLine());
     System.out.println("Input value for L");
     L=Double.parseDouble(br.readLine());
     System.out.println("Input value for C");
     C=Double.parseDouble(br.readLine());
     System.out.println("Input value for f");
     f=Double.parseDouble(br.readLine());
     System.out.println("Input value for E");
      E=Double.parseDouble(br.readLine());
    }
    
    double impedence()
    {
        
        double XL=2*pi*f*L;
        double XC=2*pi*f*C;
      Z= Math.sqrt((R*R) +(Math.pow((XL-XC),2)));
      return Z;
    }
    
    void display()
    {
        
        System.out.println("R="+R);
        System.out.println("L="+L);
        System.out.println("C="+C);
        System.out.println("E="+E);
        System.out.println("f="+f);
        System.out.println("Impedence of the circuit Z="+Z);
        
        
        
    }
     
	public static void main(String args[])throws IOException
	{
	    Current obj=new Current();
	    
	    obj.accept();
	    double impedence=obj.impedence();
	    
	    obj.display();
	    
	   }
}
