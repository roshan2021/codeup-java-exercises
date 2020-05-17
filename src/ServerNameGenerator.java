
import java.util.Random;

public class ServerNameGenerator{
    public static String[] adjectives = {
            "fantastic",
            "pretty",
            "amazing",
            "great",
            "magnificent",
            "sweet",
            "clean",
            "dirty",
            "sharp",
            "dull"
    };

    public static String[] nouns = {
            "cat",
            "dog",
            "camel",
            "horse",
            "tree",
            "chair",
            "table",
            "glass",
            "pot",
            "medicine"
    };

    public static String getWord(String[] options){
        Random randomOptions = new Random();
        int randomWord = randomOptions.nextInt(options.length);
        return options[randomWord];
    }


    public static void main(String[] args) {
        System.out.println("Here is your server name: ");
        System.out.println(getWord(adjectives) + "-" + (getWord(nouns)));
    }
}
