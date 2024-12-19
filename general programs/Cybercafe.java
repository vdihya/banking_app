package Generalprgs;
import java.io.*;

public class Cybercafe
{
	public static void main(String args[])throws IOException
	{  double amt=0,total=0;String name;
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    do
	    {
	    System.out.println("Inpute your name and 000 to exit");
	     name=br.readLine();
	     if(!(name.equals("000")))
	    {System.out.println("Input hrs");
	    int hrs=Integer.parseInt(br.readLine());
	    if(hrs<=2)
	    amt=hrs*20;
	    else if(hrs<=4)
	    amt=2*20+(hrs-2)*15;
	    else if(hrs<=6)
	    amt=(2*20)+(2*15)+(hrs-4)*10;
	    else
	    amt=((2*20)+(2*15)+(2*10)+((hrs-6)*5));
	    total+=amt;
	    System.out.println("Billing \n Name= "+ name+"\t Amount= "+amt);}
	    }while(!(name.equals("000")));
	    
	    System.out.println("Total Amount  at the end of the day="+total);
	    
	   }
}
