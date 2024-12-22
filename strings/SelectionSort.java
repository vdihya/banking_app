package StringPrgs;


public class SelectionSort
{
	
	void selection(String a[])
	{
	    int pos;
	    for(int i=0;i<a.length;i++)
	    { pos=i;
	        String smallest=a[i];
	        for(int j=i+1;j<a.length;j++)
	        {
	             if(a[j].compareTo(smallest)<0)
	             {
	                 smallest=a[j];
	                 pos=j;
	               }
	           }
	           String temp=a[i];
	           a[i]=a[pos];
	           a[pos]=temp;
	       }
	       
	       for(int i=0;i<a.length;i++)
	       System.out.println(a[i]);
	   }
	   
	   public static void main(String arg[])
	   {
	       String s[]={"Daisy","Glancy","Sharon","C.Varsha","Nanditha","Indraneil","Vishaka"};
	       SelectionSort obj=new SelectionSort();
	       obj.selection(s);
	   }
}
