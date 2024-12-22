package StringPrgs;


public class BubbleSort
{
	
	void Bubble(String a[])
	{   
	    
	    for(int i=0;i<a.length;i++)
	    { 
	        for(int j=0;j<a.length-i-1;j++)
	        {
	             if(a[j].compareTo(a[j+1])>0)
	             {
	             String temp=a[j];
	             a[j]=a[j+1];
	             a[j+1]=temp;
	             }
	       }
	    }
	       
	       for(int i=0;i<a.length;i++)
	       System.out.println(a[i]);
	   }
	   
	   public static void main(String arg[])
	   {
	       String s[]={"Daisy","Glancy","Sharon","C.Varsha","Nanditha","Indraneil","Vishaka"};
	      BubbleSort obj=new BubbleSort();
	       obj.Bubble(s);
	   }
}

	