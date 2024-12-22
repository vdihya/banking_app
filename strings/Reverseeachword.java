package StringPrgs;



public class Reverseeachword
{
	public static void main(String args[])
	{
	    String s="Computer Applications is my favourite subject";
	    String rev="";
	    for(int i=0;i<s.length();i++)
	    {char ch=s.charAt(i);
	    if(ch!=' ')
	    rev=ch+rev;
	    else 
	    {System.out.println(rev);rev="";}
	   
	   if(i==(s.length()-1))
	   {System.out.println(rev);rev="";}
}
	   
	
}
}