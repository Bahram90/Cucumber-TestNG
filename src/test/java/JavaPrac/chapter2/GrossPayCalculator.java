package JavaPrac.chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String arg[]) {

        /*
        1. Get the number of hours worked
        2. Get the hourly pay rate
        3. Multiply hours and pay rate
        4. Display result
        */

//        1. Get the number of hours worked
        System.out.println("Enter the number of hours the employee worked.");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

//        2. Get the hourly pay rate
        System.out.println("Enter the employee's pay rate.");
        double rate = scanner.nextDouble();
        scanner.close();

//        3. Multiply hours and pay rate
        double grossPay = hours * rate;

//        4. Display result
        System.out.println("The employee's gross pay is: " + grossPay);


        madLibs();
    }

    public static void madLibs(){

//        1. ask a user for season of the year
        System.out.println("Please enter season of the year.");
        Scanner scanner = new Scanner(System.in);
        String seasonOfTheYear = scanner.next();

//        2. then ask to enter whole number
        System.out.println("Please enter a whole number.");
        int number = (int) scanner.nextDouble();

//        3. then ask an adjective
        System.out.println("PLease enter your an adjective");
        String adjective = scanner.next();

//        4. use the input to complete the sentence below then output the result: (magnificent) --> adjective
        System.out.println("On a "+adjective+" "+seasonOfTheYear+" day, I drink a minimum of "+number+" cups of coffee.");

    }
}
