package util;

public class TennisGame {
    public static void main(String[] args){
        Tennis roshan = new Tennis ();
        Tennis brett = new Tennis ();
        roshan.setName("Roshan");
        brett.setName("Brett");

        System.out.println(roshan.getName() + (roshan.game(  "tennis ball", "racket")));

    }
}
