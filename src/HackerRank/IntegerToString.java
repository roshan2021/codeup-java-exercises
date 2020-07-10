package HackerRank;

import java.util.Scanner;

public class IntegerToString {
    public static void main(String[] args) {

//        DoNotTerminate.forbidExit();

        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter an integer");
            int n = in .nextInt();
            in.close();
            //String s=???; Complete this line below
            //Write your code here
            String s = Integer.toString(n);
            //negative numbers work
            //if you have an array of values you can use String.valueOf(n);
            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        } catch (Exception e) {
            System.out.println("Wrong answer");
        }
    }
}



//    public static void main(String[] args) {
        //try / catch for exception if user does not input an integer
//        try{
//            //userInput new Scanner object
//            Scanner userInput = new Scanner(System.in);
//            //asking user to enter an integer
//            System.out.println("Enter an integer");
//            //n is assigned to the user's input of an "Integer"
//            int n = userInput.nextInt();
//            //convert userInput Integer "n" to a String "s"
//            String s = Integer.toString(n);
//            //if condition or comparision is true then print "good job"
//            //hardcoding comparision does "n" equal the conversion of String "s" into an integer?
//            if(n == Integer.parseInt(s)){
//                System.out.println("Good job");
//            }
//            //if condition is false, print out wrong answer
//        } catch(Exception e){
//            System.out.println("Wrong answer");
//        }
//    }
//}




//
////The following class will prevent you from terminating the code using exit(0)!
//class DoNotTerminate {
//
//    public static class ExitTrappedException extends SecurityException {
//
//        private static final long serialVersionUID = 1;
//    }
//
////    public static void forbidExit() {
////        final SecurityManager securityManager = new SecurityManager() {
////            @Override
////            public void checkPermission(Permission permission) {
////                if (permission.getName().contains("exitVM")) {
////                    throw new ExitTrappedException();
////                }
////            }
////        };
////        System.setSecurityManager(securityManager);
////    }
//}
