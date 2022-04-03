/*Napisz program, który przyjmie jako parametr tekst (typu String), a następnie zwróci jego
ostatni znak.
Przykład:
Original word: ala
Last Char: a
Original word: domek
Last Char: k
 */
// moze zwracac chara i Stringa, ale z tresci char
package pl.sdacademy.java.basic.day2;

public class Task1 {

    private static final char DEFAULT_CHAR = '\u0000';
    public static void main(String[] args) {
        String input = "domek";
        char result = getLastChar(input);
        System.out.println(result);

        input = null;
        result = getLastChar(input);
        System.out.println(result);

        input = "\n";
        result = getLastChar(input);
        System.out.println(result);

        input = "";
        result = getLastChar(input);
        System.out.println(result);


    }

    private static char getLastChar(String input) {
        //domek length: 5 domek.charAt(5) //charAt przyjmuje indeks 5 polecialby poza; gdyby (4) to bedzie literka k
        //null -> false && sie nie wykona poniewaz nie ma sensu sprawdzac 2 warunku gdy 1 to false -> false
        //"" - > true && false -> false
        if (input != null && !input.isBlank()) {//spr czy input nie jest nullem; oba warunki trzeba wywalic;jezeli bedzie null to 2 warunek nawet sie nie sprawdzi
            int lastPosition = input.length() - 1;
            return input.charAt(lastPosition);
        }

        return DEFAULT_CHAR;
    }
}
