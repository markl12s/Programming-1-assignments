package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int weight;
        int length;
        int width;
        int height;
        int volume;

        Scanner in = new Scanner(System.in);
        char answer = 'Y';

        while(answer != 'N'){
            System.out.print("Run Package Checker (Y/N) : ");
            answer = in.next().charAt(0);

            //recieve weight of package
            System.out.println("please input weight of package");
            String weightString = in.next();

            //recieve size of package
            System.out.println("please input length of package");
            String weightString = in.next();

            System.out.println("Please input width of package");
            String weightString = in.next();

            System.out.println("Please insert height of the package");
            String weightString = in.next();

            //turn strings into variables
            int weightInt = Integer.parseInt(weightString);
            int widthInt = Integer.parseInt(widthString);
            int heightInt = Integer.parseInt(heightString);
            int lengthInt = Integer.parseInt(lengthString);

            //calculate size
            int sizeInt = widthInt * heightInt * lengthInt;

            //comparison
            if(weightInt > 99){
                System.out.println("Too heavy");
            }
            if(sizeInt > 10){
                System.out.println("Too big");
            }

            if (answer == 'n') {
                answer = 'N';
            }}
    }
}
