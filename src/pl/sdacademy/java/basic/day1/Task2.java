/*
Napisz program, który pobierze od użytkownika średnicę okręgu (typu float), a następnie obliczy
obwód oraz pole tego okręgu. Do obliczeń przyjmij:
a) π = 3,14;
b) wartość stałej π z klasy Math.
Przykład:
Please insert diameter: 2,5
Circumference Of A Circle: 7.8500004
Area Of A Circle: 4.90625
 */

package pl.sdacademy.java.basic.day1;

import java.util.Scanner;

public class Task2 {
    private static final float PI = 3.14F;

    public static void main(String[] args) {
        float radius = getDiameterFromUser() / 2;
        float circumference = calculateCircumferenceOfACircle(radius); //metoda w zmiennej zeby to bylo czytelne!!!!
        float area = calculateAreaOfACircle(radius);
        System.out.println("Circumference of a circle: " + circumference);
        System.out.println("Area of a circle: " + area);
    }

    private static float getDiameterFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert diameter: ");
        //float diameter = scanner.nextFloat();
        //return diameter; NIZEJ DOKLADNIE TO SAMO
        return scanner.nextFloat();
    }

    private static float calculateCircumferenceOfACircle(float radius) {
        return 2 * (float) Math.PI * radius;
//        return 2 * PI * radius;
    }

    private static float calculateAreaOfACircle(float radius) {
        return (float) (Math.PI * Math.pow(radius, 2));
        //return PI * radius * radius;
    }
}
