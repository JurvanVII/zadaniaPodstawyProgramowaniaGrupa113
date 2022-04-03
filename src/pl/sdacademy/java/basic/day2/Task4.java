package pl.sdacademy.java.basic.day2;

public class Task4 {

    public static final String REPLACEMENT = "-STOP-";

    public static void main(String[] args) {
        String input = "Ala, ma kota. Kot, ma Alę.";
        String result = replaceString(input);
        System.out.println(result);

    }

    private static String replaceString(String input) { //input.rep all -regex, replace wyra reg
        if (StringHelper.isValid(input)) {
//            // ala , ma kota. kot, ma ale
//            // ala, ma kota-STOP- kot, ma ale.replace()
//            return input
//                    .replace(".", REPLACEMENT)
//                    .replace(",", "-STOP-");
            return input.replaceAll("[.,],", REPLACEMENT);
        }
        return input;
    }
}
