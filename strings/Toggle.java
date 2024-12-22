package StringPrgs;
import java.io.*;
class Toggle
{
  public static void main(String arg[])throws IOException
  {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input the String");
        String s=br.readLine();
        for(int i=0;i<s.length();i++)
        {
             char ch = s.charAt(i);
             if(ch>='A' && ch<= 'Z')
             {ch+=32;System.out.print(ch);}
             else if(ch>='a' && ch<='z')
             {ch-=32;
             System.out.print(ch);}
             else
             System.out.print(ch);
             
         }
            


