import java.util.Scanner;

public class Grades2 {

  public static void main(String[] args) {
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
     
     System.out.print("Enter Class " + classNumber + " grade :");
     Scanner scanner = new Scanner(System.in);
     newGrade = scanner.next().charAt(0);
     
     grades[i] = newGrade;
   }
   
    for(int i = 0; i < 5; i++){
     int classNumber = i + 1;
     
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
