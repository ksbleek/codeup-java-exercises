import java.util.Objects;
import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

//        int i = 5;
//        while (i <= 15){
//            System.out.printf("%d%n", i);
//            i++;
//        }

//        int i = 100;
//        do {
//            System.out.printf("%d%n", i);
//            i -= 5;
//        } while(i >= -15);

//        int i = 2;
//        do {
//            System.out.printf("%d%n", i);
//            i = (int) Math.pow(i, 2);
//        } while (i < 1000000);

//        for (int i = 0; i <= 15; i++) {
//            System.out.printf("%d%n", i);
//        }

//        for (int i = 100; i >= -15; i -= 5) {
//            System.out.printf("%d%n", i);
//        }

//        for (int i = 2; i < 1000000; i = (int) Math.pow(i, 2)) {
//            System.out.printf("%d%n", i);
//        }

//        for (int i = 0; i <= 100; i++) {
//            if (i % 3 == 0 & i % 5 == 0){
//                System.out.printf("FizzBuzz%n");
//            }else if(i % 3 == 0){
//                System.out.printf("Fizz%n");
//            } else if (i % 5 == 0) {
//                System.out.printf("Buzz%n");
//            }else {
//                System.out.printf("%d%n", i);
//            }
//        }
//        Scanner scanner = new Scanner(System.in);
//        String UserResponce;
//        do {
//            System.out.print("Enter an integer?");
//            int UserNumber = Integer.parseInt(scanner.nextLine());
//            System.out.printf(" %-7s | %-7s | %-7s %n", "number", "squared", "cubed");
//            System.out.printf(" ------- | ------- | ------- %n");
//            for (int i = 1; i <= UserNumber; i++) {
//                System.out.printf(" %-7d | %-7d | %-7d %n", i, (int) Math.pow(i, 2),  (int) Math.pow(i, 3));
//            }
//            System.out.print("Do you wish to continue y/n?");
//            UserResponce = scanner.nextLine();
//        } while (Objects.equals(UserResponce, "n"));

        Scanner scanner = new Scanner(System.in);
        String Continue;
        
        do {
            System.out.print("Enter a grade from 0 to 100?");
            int UserGrade = scanner.nextInt();
            if (Math.abs(UserGrade-94)<=6){
                System.out.println("A");
            } else if (Math.abs(UserGrade-83.5)<=3.5) {
                System.out.println("B");
            } else if (Math.abs(UserGrade-73)<=6) {
                System.out.println("C");
            } else if (Math.abs(UserGrade-63)<=3) {
                System.out.println("D");
            } else if (Math.abs(UserGrade-29.5)<=29.5) {
                System.out.println("F");
            }
            System.out.print("Do you wish to continue y/n?");
            Continue = scanner.next();
        } while (Objects.equals(Continue, "y"));
    }

}
