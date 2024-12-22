import java.io.*;
class AllSeries
{
   static int fact(int n)
   {
      int f=1;
           for(int j=1;j<=n;j++)
                f *= j;
                return f;
                     
        }
        
        
   public static void main(String args[])throws IOException
   {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Input the number of terms");
       int n=Integer.parseInt(br.readLine());
       int sum;
       //Series 1
       //1-2+3-4+5.....n
       sum=0;
       for(int i=1;i<=n;i++)
       {if(i%2==0)
          {sum -= i;System.out.print("-"+i);}
       else 
          {sum += i;System.out.print("+"+i);}
        }
        System.out.println("="+sum);
        System.out.println("\n===================================================================================================");
        //Series 2
        //1!+2!+3!+4!..........n!
        sum=0;int fact=1;
       for(int i=1;i<=n;i++)
       { 
           fact=1;System.out.print(i+"!");
           for(int j=1;j<=i;j++)
                fact*=j;
            sum=sum+fact;
        }
       System.out.println("="+sum);
       System.out.println("\n==================================================================================================="); 
        //Sereis 3
        //x-xsquared+xcubed.............x to the power of n.
        sum=0;
       System.out.println("Input the value for x");
       int x=Integer.parseInt(br.readLine()); 
       for(int i=1;i<=n;i++)
       { 
           if(i%2==0)
                 {sum -= Math.pow(x,i);System.out.print("-"+Math.pow(x,i));}
           else 
                  {sum += Math.pow(x,i);System.out.print("+"+Math.pow(x,i));}
        }
       System.out.println("="+sum);
       System.out.println("\n===================================================================================================");
       //Sereis 4
       //0+2+6+12+20+30
       sum=0;
       for(int i=1,j=2;i<=n;i++,j+=2)
       { 
            System.out.print(sum+"+ ");
           sum+=j;
        }
       System.out.print("= "+sum);
      System.out.println("\n===================================================================================================");
       //Series 5
       //1+( x to the power of 2)/3 + (x to the power of 3)/3+..........
       sum=1;
       System.out.println("Input the value for x");
        x=Integer.parseInt(br.readLine()); 
       for(int i=2;i<=n;i++)
       { 
           sum += Math.pow(x,i)/(i*2-1); 
          System.out.print(Math.pow(x,i)+"/"+(i*2-1));
        }
       System.out.print("= "+sum);
       System.out.println("\n===================================================================================================");
       //Series 6
       //1-3+4-7+11-18
        int a=-1,b=2,c=0;
        int i=1;
        while(i<=n)
        {
            c=a+b;
            if(i%2==0)
            {sum-=i;System.out.print("-"+c);}
            else
            {sum+=i;System.out.print("+"+c);}
            a=b;
            b=c;
            i++;
        }
       System.out.print("= "+sum);
       System.out.println("\n===================================================================================================");
       //Series 7
       //x - 2x +3x -4x...........
       sum=0;
       System.out.println("Input the value for x");
        x=Integer.parseInt(br.readLine()); 
       for(i=1;i<=n;i++)
       { 
           if(i%2==0)
          {sum -= i*x; System.out.print("-"+i+"* x");}
       else 
          {sum += i;System.out.print("+"+i+"* x");}
        }
       System.out.print("= "+sum);
      System.out.println("\n==================================================================================================="); 
      //Series 8 Sine Series
      //x - x to the power of 3 / 3! + x to the power of 5 /5!.........
      sum=0;
       System.out.println("Input the value for x");
        x=Integer.parseInt(br.readLine()); 
       for(i=1;i<=n;i++)
       { 
           sum += Math.pow(x,(i*2-1))/fact((i*2-1)); 
          System.out.print(Math.pow(x,(i*2-1))+"/"+fact((i*2-1)));
        }
       System.out.print("= "+sum);
           
      System.out.println("\n===================================================================================================");     
           
    //Series 9
    //1-x to the power of 2/2! + x to the power of 4/4!.......
    sum=1;
       System.out.println("Input the value for x");
        x=Integer.parseInt(br.readLine()); int j;
       for(i=2,j=2;i<=n;i++,j+=2)
       { 
           sum += Math.pow(x,(j))/fact(j); 
          System.out.print(Math.pow(x,j)+"/"+fact(j));
        }
       System.out.print("= "+sum);
      System.out.println("\n===================================================================================================");     
           
           //Series 10
    //1*x/3! + 2*x/4!+ 3*x/5! + 4*x/6! + 5*x/6!.........
    sum=0;
       System.out.println("Input the value for x");
        x=Integer.parseInt(br.readLine()); 
       for(i=2;i<=n;i++,j+=2)
       { 
          sum+= i*x/fact((i+1));
          System.out.print(i*x+"/"+ fact((i+1)));
        }
       System.out.print("= "+sum);
     System.out.println("\n===================================================================================================");
           //Series 11
           //FibonacciSeries
           //0,1,1,2,3,5,8,13,21,34........
           a=-1;b=1;c=0;i=1;
           while(i<=n)
        {
            c=a+b;
            
          System.out.print(" "+c);
            a=b;
            b=c;
            i++;
        }
       System.out.println("\n===================================================================================================");
       
       //Series 12
       //Tribonacci Series
       a=-1;b=1;c=0;int d=0;i=1;
           while(i<=n)
        {
            d=a+b+c;
            
          System.out.print(" "+d);
            a=b;
            b=c;
            c=d;
            i++;
        }
      System.out.println("\n==================================================================================================="); 
   
    
   //Series:-S = 1+(1+2)+(1+2+3)+ --------+(1+2+3--------+n)
    sum=0;
   for(i=1;i<=n;i++)
       {
            for ( j=1;j<=i;j++)
         {
          sum=sum+j;
        }
     System.out.println(sum);

    }
    
}  
           
          
}