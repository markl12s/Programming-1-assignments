/* 
 * COURSE        : Computer Programming I 
 * 
 * ASSIGNMENT    : 0 
 * PROGRAM       : GasPrice.java 
 * PROGRAMMER    : Mark Leard
 * 
 * DESCRIPTION   : Calculates monthly gas cost. 
 * 
 * COMMENTS      :  
 * 
 * LAST MODIFIED : 8 Sep 2021 
*/

import java.util.Scanner;

public class GasPrice
{
  public static void main(String[] args)
  {
    // constants and variables
    Scanner in = new Scanner(System.in);
    
    double    mileage;
    int    mpg;
    double    gallons;
    double costPerMonth;
    
    //input data
    System.out.print("Enter Monthly Mileage here: ");
    System.out.print("Enter MPG                 :");
    
    
    final double GAS_PRICE = 2.799; 
    
    mileage = in.nextDouble();
    mpg = 10;
    
    // process
    // calculate the monthly cost of gas
    //since milleage and MPG are both double
    //we need to typecast either mileage either mileage or mpg to double
    //so we aren't doing integer division which drops the reamainder
    gallons = mileage / (double) mpg;
    costPerMonth = gallons * GAS_PRICE;
    
    // output monthly cost of gas
    System.out.println( "You spend $" + costPerMonth + " a month on gas! \n" );
    System.out.printf( "You spend $%1.2f a month on gas!\n\n", costPerMonth );
  }
}
