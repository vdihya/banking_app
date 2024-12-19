package Generalprgs;
import java.io.*;
import java.util.*;

public class AllNumbers
{

//1.Palindrome Reverse of the number is the same number
public static void palindrome(int n)
{
 int num = n;int rev=0,rem;
 while(num > 0)
  {
  rem=num%10;
  rev=rev*10+rem;
  num=num/10;
  }
  if(rev==n)
  System.out.println("The given number is palindrome");
  else
   System.out.println("The given number is not a  palindrome");
}
   
//2.Automorphic the  number is the last digits of its square 

 
public static  void automorphic(int n)
  {
      int num=n,digit=0;
    while(num>0)
    {
        digit++;
        num=num/10;
    }
    
    num=n;
    int sq=n*n;
    if(num==(sq%Math.pow(10,digit)))
    System.out.println("The given number is an automorphic number");
    else
    System.out.println("The given number is not an automorphic number");
 }
  


//3.factorial

 public static int factorial (int n)
    {
            int num = n;int fact=1;
            for(int j=1;j<=num;j++)
            fact=fact*j;
            return fact;
        }
        
        
//4.Perfect the sum of the factors of the number equals the number
 public static void Perfect(int n)
  {int num = n;int sum=0;
      for(int i=1;i<num;i++)
      {if(num%i == 0)
      sum=sum+i;}
      if(sum==n)
      System.out.println("Perfect Number");
     
      else
      System.out.println("not Perfect number");
       }
     
      

//5.Prime
  public static  void Prime(int n)
    {
        int num = n;int fcount=0;
    
         for(int i=1;i<=num;i++)
      { if(num%i == 0)
         fcount++;
        }
      
      if(fcount==2)
      System.out.println("Prime Number");
           else
      System.out.println("Not a Prime number");
    }
 
//6.Krishnamurthy the sum of the fact5orial of every digit equals the number
public static void Krishnamurthy(int n)
{
  int num = n,rem,sum=0;
    while(num>0)
   {  rem=num%10;
     sum+= factorial(rem);
      num=num/10;
   }
  
  if(sum==n)
  System.out.println("the given number is a Krishnamurthy Number");
  else
  System.out.println("the given number is not a Krishnamurthy Number");
}


//7 Even or Odd     
 public static void  evenodd(int n)
  {
      if(n%2==0)
  System.out.println("the given number is an even number");
   else
   System.out.println("the given number is an odd number");
  }
  
//8.Armstrong Number the sum of the cube of every digit is equal to the number
  public static  void armstrong(int n)
   { int num=n,sum=0;
    while(num>0)
    {
    int r=num%10;
    sum=sum+(r*r*r);
    num=num/10;
       }
    if(sum==n)
    {
        System.out.println("the given number is an armstrong number");
    }
    else
    System.out.println("the given number is not an armstrong number");
      }
 
  //9.Fibonacci Series (the number in the series is the sum of the previous 2 numbers in the series)
  public static  void fibonacciseries(int n)
  {
     int a=-1,b=1,x=0;
     while(x<=n)
     {
         int c=a+b;
         System.out.print(c+" ");
         a=b;
         b=c;
         x++;
        }
      
    }
    
  //10.Tribonacci Series the number in the series is the sum of the previous 3 numbers in the series
    public static  void Trobonacciseries(int n)
  {
     int a=-1,b=1,c=0,x=0;
     while(x<n)
     {
         int d=a+b+c;
         System.out.print(d+" ");
         a=b;
         b=c;
         c=d;
         x++;
        }
      
    }
    
 //Special Number Sum of the factors of each digit
 
 public static void Special(int n)
  {int num = n;int sum=0;
      while(num!=0)
      {
      int r=num%10;
      for(int i=1;i<r;i++)
      {if(r%i == 0)
      sum=sum+i;}
      num=num/10;
     }
      if(sum==n)
      System.out.println("Perfect Number");
     
      else
      System.out.println("not Perfect number");
       }
     
 //Amicable-sum of the factors of number1 equals number2 sum of the factors of number2 equals number1 
    
    public static void Amicable(int a, int b)
    { int suma=0,sumb=0;
     
      for(int i=1;i<a;i++)
      {if(a%i == 0)
      suma=suma+i;}
      
      
      for(int j=1;j<b;j++)
      {if(b%j == 0)
      sumb=sumb+j;}
      
      if(suma==b && sumb==a)
      System.out.println("Both are AMicable");
     
      else
      System.out.println("not Amicable");
   }
    
    
  
 
public static void main(String arg[])throws IOException
{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 int ch;
 //System.out.println(" You can find  \n 1.palindrome \n2.automorphic \n3.factorial \n4.perfect \n 5.prime \n 6.krishnamurthy \n7.evenorodd  \n8.armstrong \n9.fibonacci series upto n terms \n10.Tribonacci Series  \n0.To exit  \n \t for any Given a number  ");
 do{
 System.out.println("input your choice You can find  \n 1.palindrome \n2.automorphic \n3.factorial \n4.perfect \n 5.prime \n 6.krishnamurthy \n7.evenorodd  \n8.armstrong \n9.fibonacci series upto n terms \n10.Tribonacci Series \n11.Special Number  \n 12.Amicable \n0.To exit  \n \t for any Given a number  ");
 ch=Integer.parseInt(br.readLine());
  switch(ch)
  {   case 1:
      {
            System.out.println("Input the number to find the palindrome");
            int n=Integer.parseInt(br.readLine());
             palindrome(n);
             break;
        }
        case 2:
      {
            System.out.println("Input the number to find if it is  automorphic");
            int n=Integer.parseInt(br.readLine());
             automorphic(n);
              break;
        }
        case 3:
      {
            System.out.println("Input the number to find the factorial");
            int n=Integer.parseInt(br.readLine());
            int fact=factorial(n);
            System.out.println("The factorial of the given number is " + fact);
              break;
        }
        case 4:
      {
            System.out.println("Input the number to find if it id perfect");
            int n=Integer.parseInt(br.readLine());
             Perfect(n);
              break;
        }
        case 5:
      {
            System.out.println("Input the number to find if it is prime");
            int n=Integer.parseInt(br.readLine());
             Prime(n);
              break;
        }
        case 6:
      {
            System.out.println("Input the number to find if it is Krishnamurthy number");
            int n=Integer.parseInt(br.readLine());
             Krishnamurthy(n);
              break;
        }
        case 7:
      {
            System.out.println("Input the number to find the even or odd");
            int n=Integer.parseInt(br.readLine());
             evenodd(n);
              break;
        }
        case 8:
      {
            System.out.println("Input the number to find the armstrong");
            int n=Integer.parseInt(br.readLine());
            armstrong(n);
         
              break;
        }
        case 9:
      {
            System.out.println("Input the n to find the fibonacciseries upto n terms");
            int n=Integer.parseInt(br.readLine());
            fibonacciseries(n);
              break;
        }
         case 10:
      {
            System.out.println("Input the n to find the Tribonacciseries upto n terms");
            int n=Integer.parseInt(br.readLine());
            Trobonacciseries(n);
              break;
        }
        
         case 11:
      {
            System.out.println("Input the n to find if it as a Special number");
            int n=Integer.parseInt(br.readLine());
            Special(n);
              break;
        }
        
        case 12:
      {
            System.out.println("Input a and b to find if they are Amicable");
            int a=Integer.parseInt(br.readLine());
            int b=Integer.parseInt(br.readLine());
             Amicable(a,b);
              break;
        }
        case 0:
        {
             System.out.println("Good Bye, Have a Nice Day");
            System.exit(0);break;
        }
        
        default:
        {System.out.println("Invalid Choice");
          break;}
          
     }//switch
    }while(ch != 0);
     
	}//main
	
}//class