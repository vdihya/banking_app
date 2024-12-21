package Patterns;
class floyd1234
{public static void main(String arg[])
{int num=5;int counter=0;
for(int i = 1; i <= num; i++)
{
for(int j = 1; j <= i; j++)
{
counter = counter + 1;
System.out.print(counter);
System.out.print(" ");
}
System.out.println("");
}

}
}