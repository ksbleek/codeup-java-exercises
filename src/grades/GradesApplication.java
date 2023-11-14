package grades;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {

        Student kyle = new Student("Kyle", 100);
        kyle.addGrade(95);
        kyle.addGrade(90);

        Student giada = new Student("Giada", 90);
        giada.addGrade(85);
        giada.addGrade(80);

        Student travis = new Student("Travis", 80);
        travis.addGrade(75);
        travis.addGrade(70);

        Student wade = new Student("Wade", 95);
        wade.addGrade(85);
        wade.addGrade(75);

        HashMap<String, Student> usernames = new HashMap<>();

        usernames.put("ksbleek", kyle);
        usernames.put("gwitt", giada);
        usernames.put("treek", travis);
        usernames.put("wadester", wade);



//        System.out.println(usernames);

        String response;
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Welcome!%n%n");

        System.out.printf("Here are the GitHub usernames of our students:%n");

        System.out.println(usernames.keySet());

        do{

            System.out.printf("What student would you like to see more information on?%n");
            String user = scanner.next();
            if (usernames.containsKey(user)){
                System.out.printf("Name: %s - GitHub Username: %s%n" +
                        "Current Average: %.2f%n", usernames.get(user).getName(), user, usernames.get(user).getGradeAverage());

            } else {
                System.out.printf("Sorry, no student found with the GitHub username of %s%n%n", user);
            }
            System.out.printf("Would you like to see another student?%n");
            response = scanner.next();

        } while(Objects.equals(response, "y") || Objects.equals(response, "yes"));


    }

}
