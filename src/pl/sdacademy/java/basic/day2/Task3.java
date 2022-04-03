/*Napisz program, który przyjmie jako parametry input oraz word (oba typu String), a następnie
sprawdzi czy word występuje w input. Jeżeli tak, wtedy wynikiem jest pozycja na której zaczyna
się word. Jeżeli nie udało się znaleźć szukanego tekstu wtedy wynikiem powinno być -1.
Przykład:
Input: Ala ma kota
Word: ma
Result: 4
Input: Ala ma kota
Word:
Result: -1
 */ //charAt po indeksie zwraca chara, tutaj indexOf

package pl.sdacademy.java.basic.day2;

public class Task3 {
    public static void main(String[] args) {
        String input = "Ala ma kota";
        String word = "ma";
        int result = getIndex(input, word);
        System.out.println(result);

        word = "";
        result = getIndex(input, word);
        System.out.println(result);
    }

    private static int getIndex(String input, String word) {
        if(StringHelper.isValid(input) && StringHelper.isValid(word)) {
//            boolean result = input.contains(word);
//            if(result) {
//                return input.indexOf(word);
//            }
        return  input.indexOf(word);
        }
        return -1;
    }
}
