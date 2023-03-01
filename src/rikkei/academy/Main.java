package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Linear equation resolver");
        System.out.println("given a equation 'a * x + b = c', please enter constants:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a:");
        double a = scanner.nextDouble();
        System.out.print("enter b:");
        double b = scanner.nextDouble();
        System.out.print("enter c:");
        double c = scanner.nextDouble();
        if (a != 0){
            double x = (c-b)/a;
            System.out.println("equation pass with x = "+x);

        }else {
            if (b == c){
                System.out.println("the solution is all x");
            }else {
                System.out.println("no solution");
            }
        }
    }
}