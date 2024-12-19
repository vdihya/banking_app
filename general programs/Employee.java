package Generalprgs;


import java.io.*;
public class Employee
{
  int empid;
  String name;
  char dept;
  double basic;
  double gross;double net;
	
	public Employee()
	{
		//non parameterized constructor
	}

	
	public Employee(int empid,String name,char dept,double basic)
	{
		this.empid=empid;
		this.name=name;
        this.dept=dept;
        this.basic=basic;
        
  	}
  	
  	public void calculate()
  	{    double hra=(basic*10/100);
  	    double ta=basic*12/100;
  	    double da=basic*9/100;
  	    double pf=basic*12/100;
  	    gross=basic+da+ta+hra;
        net=gross-pf;
  	   	    
  	 }
  	 void display()
  	 {
  	     
  	     System.out.println("Name="+name);
  	     System.out.println("Id="+empid);
  	     System.out.println("Department="+dept);
  	     System.out.println("Basic salary ="+basic);
  	     System.out.println("Gross Salary="+gross);
  	     System.out.println("Net Salary ="+net);
  	     
  	 }
  	 public static void main(String args[])throws IOException
  	 {
  	       BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
  	       
  	
  	     for(int i=0;i<5;i++)
  	     {
  	        
  	         System.out.println("Input id");
  	         int id=Integer.parseInt(br.readLine());
  	         System.out.println("Input name");
  	         String nm=br.readLine();
  	         System.out.println("Input dept");
  	         char dpt=br.readLine().charAt(0);
  	         System.out.println("Input basic salary");
  	         double bs=Double.parseDouble(br.readLine());
  	         Employee obj=new Employee(id,nm,dpt,bs);
  	      
  	         obj.calculate();
  	         obj.display();
  	         
  	         
  	    }//for
    }//psvm
}//class
