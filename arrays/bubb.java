package Arrays;

public class bubb
{
public static void main(String args[])
{
int i,j,k=0;
String temp;
String a[]={"jia","ria","nia","sia","dia"};
System.out.println("the elements of the array before bubble sort are");
for(k=0;k<a.length;k++)
System.out.print("  "+a[k]);
System.out.println();

for(i=0;i<a.length;i++)
{
for(j=0;j<a.length-i-1;j++)
{
if ((a[j].compareTo(a[j+1])) >0)
{temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
System.out.println("the elements of the array in the ascending order are");
for(k=0;k<a.length;k++)
System.out.print("  "+a[k]);
}
}

/*
 * elements of the array before bubble sort are
  jia  ria  nia  sia  dia
  
  the elements of the array in the ascending order are
  dia  jia  nia  ria  sia
 */
