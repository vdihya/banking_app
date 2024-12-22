package StringPrgs;



public class Smallest
{
	public static void main(String args[])
	{   
	    String s="India is my country and I am proud to be an Indian";String w="";String small="";
	    int minlength=100;
	    for(int i=0;i<s.length();i++)
	    {
	        char ch=s.charAt(i);
	        if(ch!=' ')
	        w+=ch;
	        else 
	        {
	            if(w.length()< minlength)
	            {
	                minlength=w.length();
	                small=w; 
	           }
	           w="";
	           }
	          if(i==(s.length()-1))
	            if(w.length()<minlength)
	            {
	                minlength=w.length();
	                small=w; w="";
	               }
	           
	       }
	   
	   System.out.println(small+"="+minlength);
}
}