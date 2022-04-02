package pl.sdacademy.java.basic.day1;

public class Task9sa {

    public static void main(String[] args) {
        int rangeFrom = 1;
        int rangeTo = 20;

        for (int i = rangeFrom; i <= rangeTo; i++) {
            System.out.println(fizzBuzz(i));
        }

    }

    private static String fizzBuzz(int number) {
        if (number % 15 == 0) {
            return "FizzBuzz";
        }
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }

        return String.valueOf(number);
    }

    //jak zrobic ze Stringa inta
}
