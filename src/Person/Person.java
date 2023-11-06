package Person;

import java.util.Scanner;

public class Person {

    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public static String getName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name?");
        return scanner.next();
    };

    public void setName(String name){
        name = getName();
    }

    public static void sayHello(){
        System.out.println(getName());
    }

    public static void main(String[] args) {
//        sayHello();
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }

}
