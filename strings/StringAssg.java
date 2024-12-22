package StringPrgs;


import java.io.*;
class StringAssg
{

  
    public static void main(String arg[])throws IOException
  {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input the String");
        String s1=br.readLine();
        System.out.println("Input the String");
        String s2=br.readLine();
        System.out.println("Input the String");
        String s3=br.readLine();
        
        String str=(s1+" "+s2+" " +s3);
        //Concatenate
        System.out.println(s1+" "+s2+" " +s3);
        
        //To Upper Case
        System.out.println(str.toUpperCase());
        
        //To Lower Case
        System.out.println(str.toLowerCase());
        
        //Title Case
        System.out.println(Character.toUpperCase(s1.charAt(0))+s1.substring(1).toLowerCase()+" "+Character.toUpperCase(s2.charAt(0))+s2.substring(1).toLowerCase()+" "+Character.toUpperCase(s3.charAt(0))+s3.substring(1).toLowerCase()+" " ); 
       //Toggle Case
        
        for(int i=0;i<str.length();i++)
        {
             char ch = str.charAt(i);
            if( Character.isUpperCase(ch))
            System.out.print(Character.toLowerCase(ch));
              
             else if(Character.isLowerCase(ch))
            System.out.print(Character.toUpperCase(ch));
             
             else
             System.out.print(ch);
             
         } 
         
        }
      

}