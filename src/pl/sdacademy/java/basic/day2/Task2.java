/*Napisz program, który przyjmie jako argumenty input i prefix (oba typu String), a następnie
sprawdzi czy zmienna input rozpoczyna się od słowa przesłanego pod argumentem prefix.
* Spróbuj napisać program, który będzie robił to samo ale z podanym suffixem.
Przykład:
Input: programowanie, Prefix: pro
Result: true
Input: programowanie, Suffix: nie
Result: true

 */

package pl.sdacademy.java.basic.day2;

public class Task2 {

    public static void main(String[] args) {

        String input = "programowanie";
        String prefix = "pro";
        boolean result = isWordContainsPrefix(input, prefix);
        System.out.println(result);

        result = isWordContainsPrefix(input, null);
        System.out.println(result);

        result = isWordContainsPrefix("", "");
        System.out.println(result);
    }

    private static boolean isWordContainsPrefix(String input, String prefix) {
        if(StringHelper.isValid(input) && StringHelper.isValid(prefix)) {
            return input.startsWith(prefix);
        }
        return false;
    }
}
