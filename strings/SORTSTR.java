package StringPrgs;



public class SORTSTR
{
	public static void main(String args[])
	{
	   
	    StringBuffer  a= new StringBuffer("computer");
	    String str=null;
	    char smallest;
	    
	   for(int i=0;i<a.length();i++)
	    { int pos=i;
	        smallest = a.charAt(i);
	        for(int j=(i+1);j<a.length();j++)
	        {
	             if(a.charAt(j) < smallest)
	             {
	                 smallest=a.charAt(j);
	                 pos=j;
	                 
	               }
	           }
	          char temp=a.charAt(i); 
	          a.setCharAt(i,smallest);
	          a.setCharAt(pos,temp);
	       }
	       
	       System.out.println(a);
	   }
}
