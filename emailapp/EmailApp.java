package emailapp;
//main class
public class EmailApp {

    
    public static void main(String[] args){
        //creates a new object (em1) and passes in the elements "john" and "smith" as the called strings from the Email class
        //Runs the code with the information created and passed backwards to the email class
        //(1)Here's the info to run)
        Email em1 = new Email("John", "Smith");
        
        em1.setAlternateEmail("js@gmail.com");
        System.out.println("Your alternate email is: "+em1.getAlternateEmail());
        System.out.println(em1.showInfo());
    }
}