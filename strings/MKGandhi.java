package StringPrgs;



public class MKGandhi
{
	public static void main(String arg[])
	{
	    String name="Mohandas Karamchand Gandhi";String w="";
	    for(int i=0;i<name.length();i++)
	    {
	        char ch=name.charAt(i);
	        if(ch!=' ')
	        w+=ch;
	        else
	        {System.out.print(w.substring(0,1).toUpperCase()+".");w="";}
	        if(i==(name.length()-1))
	        System.out.println(w.substring(0,1).toUpperCase()+w.substring(1).toLowerCase()+".");
	        
	        
	        
     }

}
}