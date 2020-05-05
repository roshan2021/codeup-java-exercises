import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Say something to Bob");
        String userResponse = scanner.nextLine().trim();
        System.out.println(userResponse);
        String conversation; //created variable for Bob's reply

        if (userResponse.endsWith("?")){
            conversation  = "Sure";
        } else if (userResponse.endsWith("!")){
            conversation = "Whoa, chill out!";
        } else if(userResponse.isEmpty()){
            conversation = "Fine, be that way!";
        } else {
            conversation = "Whatever";
        }
        System.out.println(conversation);
    }
}
