import java.util.Objects;
import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {

//    public static int addition(int num1, int num2){
//        return num1 + num2;
//    }
//
//    public static int subtraction(int num1, int num2){
//        return num1 - num2;
//    }
//    public static int multiplication(int num1, int num2){
//        return num1 * num2;
//    }
//    public static double division(double num1, double num2){
//        return num1 / num2;
//    }
//    public static int modulus(int num1, int num2){
//        return num1 % num2;
//    }
//    static int num = multiplication(10, 2);
//
//    public static void main(String[] args) {
//        System.out.println(num);
//    }
//        Exercise 2
//    static int userChoice;
//    int userInput = getInteger(1, 10);
//    public static int getInteger(int min, int max) {
//        Scanner scanner = new Scanner(System.in);
//        do{
//            System.out.print("Enter a number between 1 and 10: ");
//            userChoice = Integer.parseInt(scanner.next());
//        } while(userChoice > 10 || userChoice < 1);
//        return userChoice;
//    }
//    public static void main(String[] args) {
//        System.out.println(userInput);
//    }

//    Exercise 3
//
//    public static long factorialUsingForLoop(int n) {
//        long fact = 1;
//        for (int i = 2; i <= n; i++) {
//            fact = fact * i;
//        }
//        return fact;
//    }
//    static String Continue;
//    public static void display() {
//        do {
//            Scanner scanner = new Scanner(System.in);
//            int userInput = getInteger(1, 10);
//            System.out.println(factorialUsingForLoop(userInput));
//            System.out.print("Do you wish to continue?");
//            Continue = scanner.next();
//        } while (Objects.equals(Continue, "y"));
//    }
//    public static void main(String[] args) {
//        display();
//    }

//    Exercise 4

    static int userChoice;
    int userInput;
    public static int getSidesOfDie() {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number of dice sides?");
            userChoice = Integer.parseInt(scanner.next());
        return userChoice;
    }

    public static int generateRandomNumber(int n) {
        Random rand = new Random();
        return rand.nextInt(n);
    }

 static int dice1;
 static int dice2;
static int dice;

    static String Continue;
    public static void main(String[] args) {

        do {
            Scanner scanner = new Scanner(System.in);
            dice = getSidesOfDie();
            dice1 = generateRandomNumber(dice) + 1;
            dice2 = generateRandomNumber(dice) + 1;
            System.out.print("Hit enter to roll");
            scanner.nextLine();
            System.out.printf("Dice #1: %d, Dice #2: %d%n", dice1, dice2);
            System.out.print("Do you wish to roll again (yes/no)?");
            Continue = scanner.next();
        } while (Objects.equals(Continue, "yes"));

    }

}