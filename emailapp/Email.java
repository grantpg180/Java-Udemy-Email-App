package emailapp;

import java.util.Scanner;

//Class to create the objects
public class Email{
    //sets the private variables to be used
   private String firstName;
   private String lastName;
   private String password;
   private String department;
   private String email;
   private int mailboxCapacity = 500;
   //sets a password with a length of 10
   private int defaultPasswordLength = 10;
   private String alternateEmail;
   private String companySuffix = "aeycompany.com";

   //Constructor to receive the first and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        //first and last name are created and ran in the main class(This tells the main class what to do)
        //(2)Here's how to run it)
        System.out.println("Email Created: "+this.firstName+" "+this.lastName);
        
        
        //call a method asking for the dept then return the dept
        this.department = setDepartment();

        
        //call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " +this.password);

        //combine elements to generate email
        email = firstName.toLowerCase() +"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;

    }
   //Ask for dept
    private String setDepartment(){
        //asks the user to input an int (0-3) to return a department choice
        System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();
        if (deptChoice == 1) {return "SALES";}
        else if (deptChoice == 2) {return "DEV";}
        else if (deptChoice == 3) {return "ACCT";}
        else {return "" ;}
    }
   //Generate random password
   //can change the (int length) to any int as a password length of characters
    private String randomPassword(int length){
        String passwordSet = "QWERTYUIOPASDFGHJKLZXCVBNM1234567890!@#$%^&*";
        //gives the user the above options to choose from to create a password
        char[] password = new char[length];
        //runs through the length of the password array and pulls the characters in a random order, then displays them as a new string 
        for(int i=0; i<length;i++){
            int rand = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String (password);
    }
    //////////SETTERS/////////////////
   //Set mailbox cap
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }
   //Set alt email
    public void setAlternateEmail (String altEmail){
        this.alternateEmail = altEmail;
    }
   //Change password
   public void changePassword (String password){
       this.password = password;
   }
   //////////////GETTERS////////////////////
   public int getMailboxCapacity(){return mailboxCapacity;}
   public String getAlternateEmail(){return alternateEmail;}
   public String getPassword(){return password;}

   public String showInfo(){
       return "DISPLAY NAME: "+firstName+" "+lastName+"\nCOMPANY EMAIL: "+email + "\nMAILBOX CAPCITY: "+mailboxCapacity+"mbs";
   }
}