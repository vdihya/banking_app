package StringPrgs;



public class CapsSmallWords
{
	public static void main(String arg[])
	{
	    String s="Bangalore is GARDEN City";
	    int Ccnt=0,Scnt=0,Words=1;
	   for(int i=0;i<s.length();i++)
      {
          char ch=s.charAt(i);
          if(ch>='A' && ch<='Z')
          Ccnt++;
          if(ch>='a' && ch<='z')
          Scnt++;
          if(ch==' ' && s.charAt(i+1)!=' ')
         Words++;
          
	   }
	   System.out.println("Capital="+Ccnt);
	   System.out.println("Small="+Scnt);
	   System.out.println("Words="+Words);
}
}

/*
Capital=8
Small=13
Words=4

 */