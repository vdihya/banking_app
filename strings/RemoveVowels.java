package StringPrgs;

public class RemoveVowels
{

 public static void main(String a)
 {
      char d;
      for(int i=0;i < a.length();i++)
  {
       d=a.charAt(i);
    if(d!='a' && d!='A' && d!='e' && d!='E' && d!='i' && d!='I' && d!='o' && d!='O' && d!='u' && d!='U')System.out.print(d);
   }

 }
 
 }
 