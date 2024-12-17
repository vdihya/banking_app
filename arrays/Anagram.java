package Arrays;



public class Anagram
{
	public static void main(String args[])
	{    int flag=0;int cnt=0;
	     String s1="WOLF";
	    String s2="FLOW";
	    for(int i=0;i<s1.length();i++)
	    {   char ch=s1.charAt(i);
	        flag=0;
	        for(int j=0;j<s2.length();j++)
	        {
	             if(ch==s2.charAt(j))
	             {flag=1;cnt++;
	              break;
	              }
	              
	           }
	           if(flag==0)
	           System.out.println("Not an Anagram");
	       }
	         if(cnt==s1.length())
	         System.out.println("Anagram");
	           
	       }
	   }
	        

