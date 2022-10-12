/* if you are reading this looking for tips to do better at the assignment, good luck.
Im commenting it now so it's a year since I did it, so it's not exactly fresh in my mind how I did it.
I no longer have access to the instructions for the assingment, so if either things have changed or I did something wrong im sorry about that
I didn't do too well in this class. */
import java.util.Scanner;

public class Grades2 {

  public static void main(String[] args) {
    
   /* created array of grades
   the letter grade here dosent really matter, it's just a placeholder, 
   to be changed later through user input */
   char[] grades = new char[5];
   grades[0] = 'd';
   grades[1] = 'd';
   grades[2] = 'd';
   grades[3] = 'd';
   grades[4] = 'd';
   
   int points;
   
   for(int i = 0; i < 5; i++){
     char newGrade;
     int classNumber = i + 1;
     
     // this is where the grades are really set, through user input
     System.out.print("Enter Class " + classNumber + " grade :");
     Scanner scanner = new Scanner(System.in);
     newGrade = scanner.next().charAt(0);
     
     grades[i] = newGrade;
   }
   
    for(int i = 0; i < 5; i++){
     int classNumber = i + 1;
     
     /* this is a switch statement, it is being used essentiall as a form of compact if statement
     you can imagine how much larger this section of code would've been as a if statement. It's also far more readable in my opinion */
     switch (grades[i]){
       case 'a':
         System.out.println("Class " + classNumber + " :" + 4 + " quality points");
         break;
       case 'b':
         System.out.println("Class " + classNumber + " :" + 3 + " quality points");
         break;
       case 'c':
         System.out.println("Class " + classNumber + " :" + 2 + " quality points");
         break;
       case 'd':
         System.out.println("Class " + classNumber + " :" + 1 + " quality points");
         break;
       case 'f':
         System.out.println("Class " + classNumber + " :" + 0 + " quality points");
         break;
     }
   }
  }
}
