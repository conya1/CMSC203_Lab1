
import java.util.Scanner;

public class MovieDriver {
   public static void main(String[] args) {
       Scanner actionMovie =new Scanner(System.in);//creating scanner object that reads from the keyboard
       Movie m1=new Movie();//creating a new movie object
       
       while(true) {//this while loop reads input for multiple movies
    	   
       System.out.println("Enter the name of a movie ");//prompt user to enter the title of a movie
       String title=actionMovie.nextLine();// read in the line that the user types
       m1.setTitle(title);//Set the title in the movie object 
       
       System.out.println("Enter the rating of the movie");//Prompt the user to enter the movie’s rating
       String rating=actionMovie.nextLine(); //Read in the line that the user types
       m1.setRating(rating); //Set the rating in the movie object
       
       System.out.println("Enter the number of tickets sold for this movie");//Prompt the user to enter the number of tickets sold at a (unnamed) theater
       int soldTickets=Integer.parseInt(actionMovie.nextLine());//Read in the integer that the user types
       m1.setSoldTickets(soldTickets);//Set the number of tickets sold in the movie object
       
       System.out.println(m1.toString());//printing movie data
       System.out.println("Do you want to enter another? (y or n)");
       String option =actionMovie.nextLine();
       if(option.equalsIgnoreCase("y"))//if user enter y loop will continue
           continue;// continue inputting the different movies until the answer becomes a no
       else
           break;//else it will break and then prints a goodbye message
       }
       System.out.println("Goodbye");//Print out a Goodbye Message
         
   }
   
  
}