package StringPrgs;



public class Palindrome
{
	public static void main(String arg[])
	{
	    String s="Malayalam";
	   
	    String rev="";
	    for(int i=(s.length()-1);i>=0;i--)
	    rev+=s.charAt(i);
	    if(rev.equalsIgnoreCase(s))
	    System.out.println("Palindrome");
	    else
	    System.out.println("Not a Palindrome");
	    //The same using equla method would return false for Palindrome Check
	    if(rev.equals(s))
	    System.out.println("Palindrome");
	    else
	    System.out.println("Not a Palindrome");
	   }
}
