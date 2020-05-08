package util;

public class Human {

    //Constructors for class Human, fields, methods to be used in HumanApp Class in the main method to run program

    //Stays static (same, never changes) for every Human
    public static final String planet = "earth";

    private String name;
    private String email;
    private String address;

    public String getName(){
        //has to return a string and notice zero parameters used
        return this.name;
    }


    public void setName(String aName){
        //void does not return, but pass String aName as a parameter
        this.name = aName;
    }

    public String getEmail() {
        //has to return a String, notice zero parameters used
        return email;
    }

    public void setEmail(String email) {
        //void does not return, but pass String email as a parameter
        this.email = email;
    }

    public String getAddress() {
        //has to return a String, notice zero parameters used
        return address;
    }

    public void setAddress(String address) {
        //void does not return, but pass String address as a parameter
        this.address = address;
    }

    public boolean verify(String email){
        //boolean returns something, NOTICE String email is used as a parameter in boolean type declared
        return email.contains("@");
    }

    public void sendMail(String to){
        //void does not return, but pass String to as a parameter used!
        if(this.verify(to)){
            System.out.println("sending email from " + this.email + " to " + to);
        }else{
            System.out.println("Wrong email format");
        }
    }
}