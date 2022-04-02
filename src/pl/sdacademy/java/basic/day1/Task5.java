/*Napisz program, który dla zadanych parametrów firstDigit i secondDigit (oba typu int), obliczy
sumę liczb od firstDigit do secondDigit.
Przykład:
Please insert first digit: 4
Please insert second digit: 11
Sum: 6
 */

package pl.sdacademy.java.basic.day1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert firstDigit: ");
        int firstDigit = scanner.nextInt();

        System.out.println("Insert secondDIgit: ");
        int secondDigit = scanner.nextInt();

        int sum = sumOfTheSequence(firstDigit, secondDigit);
        System.out.println("Sum: " + sum);
    }

    private static int sumOfTheSequence(int firstDigit, int secondDigit) {
        if(firstDigit > secondDigit) {
            int temp = firstDigit;
            firstDigit = secondDigit;
            secondDigit = temp;
        }
        int sum = 0;
        for (int i = firstDigit; i <= secondDigit; i++) {
            sum += i;
        }

//        for(;firstDigit <= secondDigit; firstDigit++) {
//            sum += firstDigit;
//        }

//        while(firstDigit <= secondDigit) {
//            sum += firstDigit;
//            firstDigit++;
//        }

//        do {
//            sum += firstDigit;
//            firstDigit++;
//        } while (firstDigit <= secondDigit);
        return sum;
    }

}
