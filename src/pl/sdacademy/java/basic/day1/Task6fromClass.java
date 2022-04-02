package pl.sdacademy.java.basic.day1;

public class Task6fromClass {

    public static void main(String[] args) {
        printMultiplicationTable(6,2,5);
    }

    private static void printMultiplicationTable (int multiplier, int minMultiplicand, int maxMultiplicand) {
        // multiplier + multiplicand (od min do max)
//        for(int i = minMultiplicand; i<= maxMultiplicand; i++) {
//            //6*2(i) = 12 (6*1)
//            int result = multiplier * i;
//            System.out.println(multiplier + " x " + i + " = " + result);
//        }
        while (minMultiplicand <= maxMultiplicand) {
            int result = multiplier * minMultiplicand;
            System.out.println(multiplier + " x " + minMultiplicand + " = " + result);
            minMultiplicand++;
        }
    }
}
