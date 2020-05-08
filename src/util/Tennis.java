package util;

public class Tennis {
    public static final String location = "tennis court";

    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String aName) {
        this.name = aName;
    }

    public String game(String tennisBall, String racket) {
        System.out.println("serves " + tennisBall + " with " + racket);
        System.out.println("hits " + tennisBall + "back to tennis player");
        return " playing tennis game";
    }


}