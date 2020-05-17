import java.util.Arrays;


public class ArraysExercises {

    public static void main(String[] args) {
        int[] numbers = {
                1, 2, 3, 4, 5
        };
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        people[0] = new Person("Roshan");
        people[1] = new Person("Maxine");
        people[2] = new Person("Jason");

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName());
        }

        people = addPerson(people, new Person("Luis"));
        people = addPerson(people, new Person("Jacob"));


        for (Person person : people) {
            System.out.println("Enhanced " + person.getName());
        }
    }


    public static Person[] addPerson(Person[] people, Person oneIndividual){
        Person[] newPeopleArray = Arrays.copyOf(people, people.length + 1);
        newPeopleArray[newPeopleArray.length -1] = oneIndividual;
        return newPeopleArray;
    }
}

