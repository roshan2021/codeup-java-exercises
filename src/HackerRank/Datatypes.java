package HackerRank;

import java.util.Scanner;

public class Datatypes{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            try {
                long x = sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x >= -128 && x <= 127)
                    System.out.println("* byte");
                if(x >= -(Math.pow(2,15)) && x <= (Math.pow(2,15)-1))
                    System.out.println("* short");
                if(x >= -(Math.pow(2,31)) && x <= (Math.pow(2,31)-1))
                    System.out.println("* int");
                if(x >= -(Math.pow(2,63)) && x <= (Math.pow(2,63)-1))
                    System.out.println("* long");
            }
            catch(Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }
}



//import java.util.*;
//        import java.io.*;
//class Solution{
//    public static void main(String []argh) {
//        Scanner sc = new Scanner(System.in);
//        int t=sc.nextInt();
//        for(int i=0;i<t;i++) {
//            try {
//                long x=sc.nextLong();
//                System.out.println(x+” can be fitted in:”);
//                if(x>=–128 && x<=127) System.out.println(“* byte”);
//                if(x>=-32768 && x<=32767) System.out.println(“* short”);
//                if(x>=-2147483648 && x<=2147483647) System.out.println(“* int”);
//                if(x>=-9223372036854775808 &&
//                        x<=9223372036854775807)System.out.println(“* long”);
//            }
//            catch(Exception e) {
//                System.out.println(sc.next()+” can’t be fitted anywhere.”);
//            }
//        }
//    }
//}



//import java.util.*;
//        import java.io.*;

//class DataTypes{
//    public static void main(String []argh)
//    {
//        Scanner sc = new Scanner(System.in);
//        int t=sc.nextInt();
//
//        for(int i=0;i<t;i++)
//        {
//            try
//            {
//                long x=sc.nextLong();
//                System.out.println(x+" can be fitted in: ");
//                if(x>=-128 && x<=127) {System.out.println("* byte");}
//                if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE){System.out.println("* short");}
//                if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE){System.out.println("* int");}
//                if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE){System.out.println("* long");}
//            }
//            catch(Exception e)
//            {
//                System.out.println(sc.next()+" can't be fitted anywhere.");
//            }
//
//        }
//    }
//}