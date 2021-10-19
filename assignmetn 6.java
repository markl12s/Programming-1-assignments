package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //recieve weight of package
        System.out.println("please input weight of package");
        Scanner in = new Scanner(System.in);
        String weightString = in.nextLine();

        //recieve size of package
        System.out.println("please input size of package, in cubic feet");
        in = new Scanner(System.in);
        String sizeString = in.nextLine();

        //turn strings into variables
        int weightInt = Integer.parseInt(weightString);
        int sizeInt = Integer.parseInt(sizeString);

        //comparison
        if(weightInt > 999){
            System.out.println("Too heavy");
        }
        if(sizeInt > 10){
            System.out.println("Too big");
        }
    }
}
