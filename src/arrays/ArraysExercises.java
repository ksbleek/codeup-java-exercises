package arrays;

import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);

        System.out.println(Arrays.toString(numbers));
        Person[] people = new Person[3];
        people[0] = new Person("Jack");
        people[1] = new Person("Sally");
        people[2] = new Person("Ben");

        printMyPeople(people);

        Person [] morePeople = addPerson(people, new Person("Dave"));

        printMyPeople(morePeople);
    }

    private static Person [] addPerson(Person[] ppl, Person person) {

        Person [] morePpl = Arrays.copyOf(ppl, ppl.length + 1);
        morePpl[morePpl.length - 1] = person;
        return morePpl;

    }

    private static void printMyPeople(Person[] ppl) {

        for (Person person : ppl) {
            System.out.println(person);
        }

    }
}