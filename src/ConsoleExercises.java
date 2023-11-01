import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f", pi);
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter an Integer ");
//        int UserInt = scanner.nextInt();
//        System.out.printf("You entered: %d", UserInt);
//        System.out.print("Enter A words?");
//        String FirstWord = scanner.nextLine();
//        System.out.print("Enter A words?");
//        String SecondWord = scanner.nextLine();
//        System.out.print("Enter A words?");
//        String ThirdWord = scanner.nextLine();
//        System.out.printf("The words you entered are, %s, %s, %s", FirstWord, SecondWord, ThirdWord);
//        System.out.print("Enter a sentence?");
//        String AString = scanner.nextLine();
//        System.out.printf("%s", AString);

        System.out.print("Enter a the length of the room?");
        int length = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter a the width of the room?");
        int width = Integer.parseInt(scanner.nextLine());
        int perimeter = (length * 2) + (width * 2);
        int area = length * width;
        System.out.printf("The area is: %d, the perimeter is: %d", area, perimeter);
    }

}
