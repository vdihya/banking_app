package Generalprgs;



public class Outputs
{
	public static void main(String arg[])
	{ //1.
	   double d= 3/4+7/8+6%9;
	   System.out.println(d);
	  //2. dangling
	   int a=10,b=5,c=20;
	   if(a>b)
	           if(b<a)
	              if(c<a)
	                   System.out.println(a);
	   else
	   System.out.println("Dangling");
	   
	   System.out.println("cameout");
	   //3.
	   int x="World War".lastIndexOf("War".charAt(0));
	   System.out.println(x);
	   
	   //4.
	  System.out.println( "APTITUDE".compareTo("ATTITUDE"));
	   
	  //5.
	  System.out.println("MISSISSIPI".lastIndexOf('S'));
	  //6.
	  int a[]={2,5,8,5,
	  
	  
	  
	  
	   }
	   
	   
	   
}
