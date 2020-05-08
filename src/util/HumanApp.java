package util;

//Define Class
public class HumanApp {
    //create main to run the program that pulls fields / methods from Human class constructors ?
    public static void main(String[] args){

        //Creating stacy is new object variable for Human
        Human stacy = new Human();

        //Creating fer is new object variable for Human
        Human fer = new Human();

        //Setting name to stacy object as "Stacy" using setName method
        stacy.setName("Stacy");

        //Setting name to fer object as "Fer" using setName method
        fer.setName("Fer");

        //Setting email to fer object using getName method and concating last part of email chain
        fer.setEmail(fer.getName() + "@gmail.com");
        stacy.setEmail(stacy.getName() + "@yahoo.com");

        //Sending email method
        stacy.sendMail("instructors@codeup.com");
        stacy.sendMail("instructors&codeup.com");
        fer.sendMail("support@google.com");
    }
}