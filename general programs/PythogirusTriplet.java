package Generalprgs;


import java.io.*;
class PythogirusTriplet
{
public static void  main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a,b,c;
System.out.println("enter no.");
a=Integer.parseInt(br.readLine());
System.out.println("enter no.");
b=Integer.parseInt(br.readLine());
System.out.println("enter no.");
c=Integer.parseInt(br.readLine());
if (a*a==b*b+c*c)
System.out.println("They are Pythogorean Triplet");
else if(b*b==a*a+c*c)
System.out.println("They are Pythogorean Triplet ");
else if(c*c==a*a+b*b)
System.out.println("They are Pythogorean Triplet a² + b² = c² ");
else
System.out.println("Test Failed !!! They are Non Pythogorean Triplet ");
}
}
//if u want to consider a² + b² = c² only then remove first 2 conditions