package StringPrgs;



public class Vowel
{
  public static void main(String args[])
  {
      String s="Oranges and apple are my favourite fruits";
      int vcnt=0;
      for(int i=0;i<s.length();i++)
      {
          char ch=s.charAt(i);
          if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
          vcnt++;
          
    }
    System.out.println("Total vowels="+vcnt);
}
}

/*
Total vowels=15

 */