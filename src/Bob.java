import java.util.Objects;
import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Continue;
        do {
            System.out.print("What do you want?");
            String UserResponse = scanner.nextLine().trim();
            if(UserResponse.isEmpty()){
                System.out.printf("Fine. Be that way!%n");
            }else if (UserResponse.charAt(UserResponse.length() - 1) == '?'){
                System.out.printf("Sure.%n");
            } else if (UserResponse.charAt(UserResponse.length() - 1) == '!') {
                System.out.printf("Whoa, chill out!%n");
            } else {
                System.out.printf("Whatever.%n");
            }
            System.out.printf("Are we done?%n");
            Continue = scanner.nextLine();
        } while (Objects.equals(Continue, "no"));

    }

}
