/* 
 * COURSE        : Computer Programming I 
 * 
 * ASSIGNMENT    : 0 
 * PROGRAM       : GasPrice.java 
 * PROGRAMMER    : Bob Harder 
 * 
 * DESCRIPTION   : Calculates monthly gas cost. 
 * 
 * COMMENTS      :  
 * 
 * LAST MODIFIED : 8 Sep 2021 
*/

public class GasPrice
{
  public static void main(String[] args)
  {
    // constants and variables
    final double GAS_PRICE = 2.799; 
    
    int    mileage;
    int    mpg;
    double    gallons;
    double costPerMonth;
 
    // input data
    mileage = 1000;
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
