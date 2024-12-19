package Generalprgs;
import java.io.*;
public class AsciivalueofReverseString 
{
	public static void main(String arg[])throws IOException
	{
	    
	     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    
	    System.out.println("Input the String");
	    String str=br.readLine();
	    //Reverse of the String
	    String rev="";
	    for(int i=(str.length()-1);i>=0;i--)
	    rev+=str.charAt(i);
	    
	    System.out.println(str);
	    System.out.println(rev);
	     int a[]=new int[str.length()];
	    for(int i=0;i<rev.length();i++)
	   System.out.print(rev.charAt(i)+0+",");
	   System.out.println();
	   
	   //to print all vowels ascii-4 and all consonant ascii+5
	    for(int i=0;i<rev.length();i++)
	    { char ch=rev.charAt(i);
	        if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	               {System.out.print(ch-4+",");
	             a[i]=ch-4;
                 }
	   
	     else
	      {System.out.print(ch+5+",");
	         a[i]=ch+5;}
	    
	   }
	   System.out.println();
	   
	   for(int i=0;i<a.length;i++)
	   System.out.print(a[i] +",");
		
	    
	    
}
}