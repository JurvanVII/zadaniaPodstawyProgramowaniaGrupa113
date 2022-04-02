package pl.sdacademy.java.basic.day1;
/* tu duzo mozna w mainie, kluczowa metoda sprawdzajaca czy liczba jest liczba pierwsza
Napisz program, który dla zadanego zakresu od 0 do X, wyświetli tylko liczby pierwsze.
Przykład:
Range from 0 to 10
Prime numbers:
2
3
5
7
 */

public class Task8 {

    public static void main(String[] args) {
        int rangeFrom = 0;
        int rangeTo = 10;
        for(int i = rangeFrom; i <= rangeTo; i++) {
            if(isPrimeNumber(i)) {
                System.out.println(i);
            }
        }
    }

    // 0 1 2 3 4 5 6 ...
    private static boolean isPrimeNumber(int number) {
        // 11/2 11/3 11/4 11/5 |||| 11/6 11/7 11/8 11/9
        // 10/2 10/3 10/4 |||| 10/5 10/6 10/7
        if(number < 2) {
            return false;
        }
        for(int i = 2; i <= number/2; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
