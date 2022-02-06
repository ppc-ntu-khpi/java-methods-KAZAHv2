//package test;

//import domain.Exercise;

import java.util.Scanner;

public class TestResult {

    public static void main(String[] args) {
        System.out.print("Введіть ваше число долі: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        while (s.length() > 1) {
            int sum = 0;
            for (char c : s.toCharArray()) {
                if (Character.isDigit(c)) {
                    sum += (c - '0');
                }
            }
            s = String.valueOf(sum);
        }
        System.out.println("Ваше число долі: " + s);
    }
}
