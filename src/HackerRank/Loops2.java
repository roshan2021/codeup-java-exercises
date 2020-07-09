package HackerRank;

import java.util.Scanner;

public class Loops2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tests = scan.nextInt();
        int a, b, n;
        for (int t = 0; t < tests; t++) {
            a = scan.nextInt();
            b = scan.nextInt();
            n = scan.nextInt();
            loop(a, b, n);
        }
    }

    static void loop(int a, int b, int n) {
        int sum = a;
        for (int x = 0; x < n; x++) {
            sum += b * (1<<x);
            System.out.print(sum + " ");
        }
        System.out.println();
    }
}

class Loopstwo{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        for(int i = 0; i < test; i++ ){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum = a;
                for(int j = 0; j < n; j++){
                    sum += (Math.pow(2,j)*b);
                    System.out.println("");
                }
            System.out.println();
        }
    }
}


class LoopsII{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int temp = a;
            for (int j = 0; j < n; j++) {
                temp += (Math.pow(2, j) * b);
                System.out.print(temp + " ");
            }
            System.out.println();
        }
        in.close();
    }
}