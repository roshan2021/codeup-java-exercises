

public class Person {
    //Property of Person Object
    private String name;

    // Getter Method : returns the person's name
    public String getName(){
        return this.name;
    }

//     Setter Method: changes the name property to the passed value
    public void setName(String name){
        this.name = name;
    }

//    Method:  prints a message to the console using the person's name
    public void sayHello(){
        System.out.println(this.name);
    }


    //Constructor default settings for Person Object
    public Person (String name) {
        this.name = name;
    }

    public static void main(String[] args){
        Person roshan = new Person("Roshan");
        System.out.println(roshan.name);

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        //.equals(person2.getName() will return true making 2 different objects equal????
//        System.out.println(person1.getName().equals(person2.getName()));
//        //person1 == person2 will return false each person1 is a different object. person2 is a different object
//        System.out.println(person1 == person2);


//        //this works because person2 is being assigned to person 1 OBJECT, not creating a different object, therefore has the same values
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println("person1 Name " + person1.getName());
//        System.out.println("person2 Name " + person2.getName());
//        person2.setName("Jane");
//        System.out.println("person1 name " + person1.getName());
//        System.out.println("person2 name " + person2.getName());




    }

}
