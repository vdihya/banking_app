package StringPrgs;



public class Changewords
{
	public static void main(String args[])
	{
	    String s="January 26 celebrated as the Republic day of India";
	    String s2="August 15"+s.substring(10,29)+"Independence"+s.substring(37);
	    System.out.println(s+"\n"+s2);
	    
	    System.out.println("The same can also be done using String Buffer");
	    StringBuffer sb=new StringBuffer(s);
	    sb.delete(0,10);
	    sb.insert(0,"August 15");
	    sb.delete(28,36);
	    sb.insert(28,"Independence");
	     System.out.println(s+"\n"+sb);
	    
	   }
}
/*
January 26 celebrated as the Republic day of India
August 15 celebrated as the Independence day of India
The same can also be done using String Buffer
January 26 celebrated as the Republic day of India
August 15 celebrated as the Independence day of India
*/