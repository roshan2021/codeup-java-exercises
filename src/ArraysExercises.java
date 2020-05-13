
import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] people, Person newPerson){
        
//        Person [] newArray = new Person[people.length + 1];
//        for (int i = 0; i < people.length; i++){
//            //make a copy from old array into the new array;
//            newArray[i] = people[i];
//        }

        Person [] newArray = Arrays.copyOf(people, people.length + 1);


        newArray[newArray.length - 1] = newPerson;
        return newArray;
    }

    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};

        Person [] people = new Person[3];

        people[0] = new Person("Roshan");
        people[1] = new Person("Pink");
        people[2] = new Person("Tina");

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName());
        }

        people = (addPerson(people, new Person("Max")));

        for(Person person : people){
            System.out.println("enhanced for loop: " + person.getName());
        }


    }
}
