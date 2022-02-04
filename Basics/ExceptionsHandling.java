package Basics;

import java.util.Scanner;

public class ExceptionsHandling {
    static void Division() {

        Scanner sc = new Scanner(System.in);

        // try, catch, finally, throws, throw

        while (true) {
            try {
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                System.out.println(n1 + "Divided by" + n2 + "gives" + n1 / n2);
                break;
            } catch (ArithmeticException ex) {
                System.out.println(ex);
            }

        }

        sc.close();
    }

    public static void main(String[] args) {
        ExceptionsHandling.Division();
    }

}
