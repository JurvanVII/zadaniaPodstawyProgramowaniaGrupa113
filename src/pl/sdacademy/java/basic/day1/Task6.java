/*Napisz program, który wypisze poniższy kawałek tabliczki mnożenia:
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
* Zmodyfikuj metodę, tak aby wyświetlała powyższy kawałek tabliczki mnożenia dla zadanego
mnożnika i mnożnej (dwa parametry: od - do) zadanych jako parametry.
Przykład:
void printMultiplicationTable(int multiplier,int minMultiplicand, int maxMultiplicand)
multiplier = 6, multiplicandMin = 2, multiplicandMax = 5
6 x 2 = 12
6 x 3 = 18
6 x 4 = 24
6 x 5 = 30

 */

package pl.sdacademy.java.basic.day1;

public class Task6 {
    public static void main(String[] args) {
        multiplicationTable(5);
    }
    private static void multiplicationTable(int number) {
        if (number<1) System.out.println("Liczba musi byc wieksza od 0!");
        int wynik;
        for (int i=1; i<= number; i++) {
            wynik = i*5;
            System.out.println("5 x " + i + " = " + wynik);
        }
    }
}
