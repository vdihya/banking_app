import java.util.Scanner;//Invoking Java package for Scanner class
public class Libraryapp//Class begins
{
public static void main(String[] args)//Main method begins 
{
  
  Scanner s = new Scanner(System.in);
  String cn="Nil";
  String pn="0000000000";
  int bkchoice=0;
  int bkchoice2=0;
  int a1=0;
  int a2=0;
  int returns=0;
  int user_choice=0;
  int genre=0;
  int cnt=0;
  //Initializing all class variables to be used in the program 
  String fiction[]={"1)Percy Jackson and the lightning thief","2)Percy Jackson and the sea of monsters",
  "3)Percy Jackson and the Titan's curse","4)Percy Jackson and the battle of the Labyrinth","5)Harry Potter and the Philosopher's stone",
  "6)Harry Potter and the Half-Blood Prince","7)Harry Potter and the deathly hallows","8)Harry Potter and the other wizards","9)Harry Potter and the chamber of secrets",
  "10)Harry Potter and the Prisoner of Azkaban","11)Harry Potter and the goblet of fire","12)Harry Potter and the order of the phoenix"};//Creating array (1) 
  String nonfiction[]={"13)George's secret Key to the universe","14)Snowflake Bentley",
  "15)If you lived here:Houses of the world","16)Balloons Over Broadway:The True Story of the Puppeteer of Macy's Parade","17)The Diary of a young girl",
  "18)The Way things work","19)Castle","20)A Butterfly is patient","21)The Upstairs room","22)Pyramid","23)One tiny turtle","24)Ancient Egypt"};//Creating array (2)
  String nfauthors[]={"Lucy Hawking","Jacqueline Briggs Martin","Giles laroche",
      "Melissa Sweet","Anne Frank","David Macaulay","David Mcaulay","Michael Shoulders","Johanna Reiss",
      "Sara Bonnett","Annie Jones","Nicola Davies"};//Creating array (3)                                    
  
    do//Main do while loop starts
    {
      //Display menu to user to choose his wanted task
        //Ask user for his choice and validate it (make sure it is between 1 and 6)
        System.out.println();
        System.out.println("1) Open a new Library account");
        System.out.println("2) Borrow book/books");
        System.out.println("3) Return book/books");
        System.out.println("4) Print account information");
        System.out.println("5) Give us feedback about our library");
        System.out.println("6) Quit");//Select to view Project Credits and details.
        System.out.println();
        System.out.print("Enter choice [1-6]: ");
        user_choice=s.nextInt();//Accepting users choice
        switch (user_choice) 
        {//Main Switch case begins
            case 1: //Creating new account in the library 
                    System.out.println("Enter first name :");
                    cn = s.next();//Accepting customers name 
                    System.out.println("Enter phone number :");//Accepting Phone Number of customer
                    pn=s.next();
                    
                    System.out.println("Account has been successfully created,please proceed.");
                    break;
            case 2: 
                    System.out.println("1)Fiction");
                    System.out.println("2)Non-fiction");
                    System.out.println();
                    genre=s.nextInt();
                    switch(genre)
                               {
                                   
                                   case 1: //Borrowing Fiction books
                                   do
                                   {
                                   System.out.println("Please select a Fiction book from the following");
                                   for(int i=0;i<4;i++)
                                   { 
                                       System.out.println(fiction[i]+" by"+" Rick Riordan");
                                    }
                                    for(int x=4;x<12;x++)
                                    {
                                       System.out.println(fiction[x]+" by"+" J.K.Rowling");
                                    }
                                   System.out.println("Input number of the book you desire to borrow :");
                                   bkchoice=s.nextInt();//Accepting book choice from Customer
                                   cnt++;//Incrementing book count
                                   if(bkchoice>=1&&bkchoice<=12)                                   
                                   System.out.println("Book successfully borrowed");
                                   else
                                   System.out.println("Select again,choice not available");
                                   }
                                   while(!(bkchoice>=1&&bkchoice<=12));//Condition for do-while loop
                                   break;
                                   case 2: //Borrowing Non-Fiction books
                                   do
                                   {
                                   System.out.println("Please select a Non-Fiction book from the following");
                                   for(int a=0;a<12;a++)
                                   {
                                       System.out.println(nonfiction[a]+" by"+" "+nfauthors[a]);
                                    }
                                     
                                   System.out.println("Input number of the book you desire to borrow");
                                   bkchoice2=s.nextInt();
                                   cnt++;
                                   if(bkchoice2>=13&&bkchoice2<=24)
                                   System.out.println("Book successfully borrowed");
                                   else
                                   System.out.println("Select again,choice not available"); 
                                   }
                                   while(!(bkchoice2>=13&&bkchoice2<=24));
                                   }
                                   break;
                    
                            
                        
                
            case 3: //Returning books
            do
            {
            System.out.println("FICTION");
            for(int i=0;i<12;i++)
            {
             System.out.println(fiction[i]);
            }
            System.out.println();
            System.out.println();
            System.out.println("NON-FICTION");
            for(int z=0;z<12;z++)
            {
            System.out.println(nonfiction[z]);
            }
            System.out.println();                               
            System.out.println("Enter number of book to be returned if it is present in list :");
            returns=s.nextInt();
            if(returns>=1&&returns<=24)
            System.out.println("Book successfully returned");
            else
            System.out.println("Select again,choice not available");
            }
            while(!(returns>=1&&returns<=24));
            break;
          
           
            case 4: //Printing account details
            System.out.println("Customer name :"+"\t"+cn);
            System.out.println();
            System.out.println("Phone number :"+"\t"+pn);
            System.out.println();
            System.out.println("Number of books borrowed :"+"\t"+cnt);
            System.out.println();
            System.out.println("Do you want to view your feedback answers?");
            System.out.println("1)Yes");
            System.out.println("2)No");
            int ch=s.nextInt();
            System.out.println();
            if(ch==1)
            {
            System.out.println("Your answers for :");
            System.out.println();
            System.out.println("Overall service rating :"+a1);
            System.out.println();
            System.out.println("Customer service :" +a2);
            System.out.println();
            }
            System.out.println("Thank you so much for visiting our Library,please come again!!");                   
            break;
            
            
            case 5: //Giving feedback
            System.out.println("Please give us feedback!");
            System.out.println("Rate our overall services : [0-10]");
            a1=s.nextInt();
            System.out.println();
            System.out.println("Customer service : [0-10]");
            a2=s.nextInt();
            System.out.println();
            System.out.println("Thank you for your feedback!!");
            break;
            case 6:
            System.out.println("Project by :");
            System.out.println("Vidhya Anand : 10 C");
            System.out.println("Sanjana Sivakumar : 10 A");
            System.out.println("Anshul Verma : 10 A");
            System.out.println("Chris Tarun : 10 C");
            System.out.println("Project on Library Management 2014"); 
            System.exit(0);
            break;
           
        }//Main Switch case ends
    }//Main do while loop ends
    while (user_choice != '6');

}//Main method ends

}//Class ends

