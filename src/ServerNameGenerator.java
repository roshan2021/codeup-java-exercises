
public class ServerNameGenerator {


    public static String [] adjectives = {
            "Clam",
            "Happy",
            "Cool",
            "Beautiful",
            "Square",
            "Perfect",
            "Machine",
            "Red",
            "Super",
            "Same"
    };

    public static String [] nouns = {
            "Dog",
            "Cat",
            "Beaver",
            "Man",
            "Woman",
            "truck",
            "Table",
            "Chair",
            "Tree",
            "Birds"
    };


    public static String randomNounAdjective(String[] arr) {
        int random = (int) (Math.random() * (arr.length-1) + 1);
        System.out.println(random);
        return arr[random];
    }


    public static void main (String[] args){
        System.out.println(randomNounAdjective(nouns));
        System.out.println(randomNounAdjective(adjectives));
    }
}