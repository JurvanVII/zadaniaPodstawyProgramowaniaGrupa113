package pl.sdacademy.java.basic.day1;

import java.util.Scanner;

//rekruter podaje int to zostajemy przy int - robic zgodnie z wymaganiami, nie robic po swojemu
public class Task4 {
    private static final Scanner scanner = new Scanner(System.in);// wartosc pol bylaby wspolna dla wszystkich obiektow, nie zawsze to chcemy
    private static final double BMI_MIN_RANGE = 18.5;
    private static final double BMI_MAX_RANGE = 24.9;

    public static void main(String[] args) {
        float weight = getWeightFromUser();
        int height = getHeightFromUser();
        float bmi = calculateBMI(weight, height);
        displayBmiResult(bmi);
    }

    private static float getWeightFromUser() {
        System.out.println("Please insert weight in kg: ");
        return scanner.nextFloat();
    }

    private static int getHeightFromUser() {
        System.out.println("Please insert height in cm: ");
        return scanner.nextInt();
    }

    private static float calculateBMI(float weight, int height) {
        //weight / height[m]^2
        float heightInMeter = height/100F; // F zeby sie nie czepial, bez f sugeruje ze cos
//        float heightInMeter = (float)height/100;
        return weight / (float) Math.pow(heightInMeter, 2);
    }
    private static void displayBmiResult(float bmi) {
        if(bmi < BMI_MIN_RANGE || bmi > BMI_MAX_RANGE) {
            System.out.println("BMI is not correct: " + bmi);
        } else {
            System.out.println("BMI is correct: " + bmi);
        }
    }
 }
