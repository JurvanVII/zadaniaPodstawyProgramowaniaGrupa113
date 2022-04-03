/*Napisz program, który przyjmie jako argument input (typu String) i znak (typu char), a następnie
zwróci liczbę wystąpień podanego znaku w danym łańcuchu znaków.
Przykład:
Input: Ala ma kota
Searched Character: a
Result: 3

 */
package pl.sdacademy.java.basic.day2;

public class Task5 {

    public static void main(String[] args) {
        String input =  "Ala ma kota.";
        char letter = 'z';
        int result = countLetter(input, letter);
        System.out.println(result);
    }

    private static int countLetter(String input, char searchedCharacter) {
        int counter = 0;
        if (StringHelper.isValid(input) && input.contains(String.valueOf(searchedCharacter))) { //zmiana z chara na Stringa przez valueOf VALIDACJA ZEBY ULEPSZYC. przy milinioe wystapien nie leci petla tylko sprawdza najpierw czy wgl wystepuje literka. oszczednosc czasu i pamieci
            for (int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == searchedCharacter) {
                    counter++;
                }
            }
        }
        return counter;
    }

}
