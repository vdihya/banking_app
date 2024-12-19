package Generalprgs;

class CallbyValRef
{
int a; int b;
  public CallbyValRef(int x,int y)
  {
       a=x;b=y;
    }
    
    void changevalue(int a, int b)
    {
        int temp=a;
        a=b;
        b=temp;
    }
       
    void changevalue(CallbyValRef obj)
    {
        int temp=obj.a;
        obj.a=obj.b;
        obj.b=temp;
        
    }
    
    
    public static void main(String args[])
    {
        int a=100;
        int b=1000;
        CallbyValRef a1=new CallbyValRef(10,20);
        a1.changevalue(a,b);
        System.out.println("a="+a);
         System.out.println("b="+b);
         CallbyValRef e1=new CallbyValRef(40,50);
         e1.changevalue(a1);
         System.out.println(a1.a+"\n"+a1.b);
         
    }
        



}