package HackerRank;

import java.util.Scanner;

public class StaticInitializerBlock {
    static int B;
    static int H;
    static boolean flag = true;

    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();

        try{
            if(B <= 0 || H <= 0) {
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        } catch(Exception e) {
        System.out.println(e);
        }
    }
    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    } //end of main

} //end of class



//public class StaticInitializerBlock {
//
//    static int B;
//    static int H;
//    static boolean flag = true;
//
//    static {
//        Scanner scan = new Scanner(System.in);
//        B = scan.nextInt();
//        H = scan.nextInt();
//
//        if (B <= 0 || H <= 0) {
//            flag = false;
//            System.out.println("java.lang.Exception: Breadth and height must be positive");
//        } else{
//            flag = true;
//        }
//    }
//
//
////    public static void main(String[] args) {
////        if (flag) {
////            int area = B * H;
////            System.out.print(area);
////        }
////    }
//}