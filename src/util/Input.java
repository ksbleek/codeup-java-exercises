package util;

import java.util.Objects;
import java.util.Scanner;

public class Input {

    private static Scanner scanner = new Scanner(System.in);

    static String getString(){
        System.out.println("Enter a sting?");
        return scanner.next();
    }

    static String answer;

    static String yesNo(){
        System.out.println("Enter yes or no?");
        String response = scanner.next();
       if(Objects.equals(response, "y") || Objects.equals(response, "yes")){
           answer = "true";
       } else {
           answer = "False";
       }
        return answer;
    }

    static int number;
    static void getInt(int min, int max){
        do{
            System.out.printf("Enter a number between %d and %d?", min, max);
            number = scanner.nextInt();
        } while ((int) number > max || (int) number < min);
        System.out.println(number);
    }

    static int num;
    static void getInt(){
        System.out.println("Enter a number?");
        num = Integer.parseInt(scanner.next());
        System.out.println(num);
    }

    static double numberD;
    static void getDouble(double min, double max){
        do{
            System.out.printf("Enter a decimal number between %f and %f?", min, max);
            numberD =  scanner.nextDouble();
        } while ((double) numberD > max || (double) numberD < min);
        System.out.println(numberD);
    }

    static double numD;

    static void getDouble(){
        System.out.println("Enter a decimal number?");
        numD = scanner.nextDouble();
        System.out.println(numD);
    }

}
