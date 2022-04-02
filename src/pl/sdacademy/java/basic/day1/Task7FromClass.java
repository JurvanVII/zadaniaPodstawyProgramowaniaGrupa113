package pl.sdacademy.java.basic.day1;

import java.util.Scanner;

public class Task7FromClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String decision;
        do {
            System.out.println("Please insert firstDigit: ");
            float firstDigit = scanner.nextFloat();
            scanner.nextLine();

            System.out.println("Please insert operator: ");
            String operator = scanner.nextLine();

            System.out.println("Please inser secondDigit:");
            float secondDigit = scanner.nextFloat();
            scanner.nextLine();

            float result = calculate(firstDigit, secondDigit, operator);
            System.out.println("Result " + result);

            System.out.println("New calculation or Stop?");
            decision = scanner.nextLine();

            // zeby miec dostep w while zmienna musi byc stworzone przed do - decision
        } while (!"Stop".equals(decision));
    }

    private static float calculate(float firstDigit, float secondDigit, String operator) {
        return 0;
    }
}
