package StringPrgs;



public class Longest
{
	public static void main(String args[])
	{   
	    String s="India is my country and I am proud to be an Indian";String w="";String longest="";
	    int maxlength=0;
	    for(int i=0;i<s.length();i++)
	    {
	        char ch=s.charAt(i);
	        if(ch!=' ')
	        w+=ch;
	        else 
	        {
	            if(w.length()>maxlength)
	            {
	                maxlength=w.length();
	                longest=w; 
	           }
	           w="";
	           }
	          if(i==(s.length()-1))
	            if(w.length()>maxlength)
	            {
	                maxlength=w.length();
	                longest=w; w="";
	               }
	           
	       }
	   
	   System.out.println(longest+"="+maxlength);
}
}