package pl.sdacademy.java.basic.day2;

//public class StringHelper {
//    public static boolean isValid(String input) {
////        if (input != null && !input.isBlank()) {
////            return true;
////        }
////        return false;
//        //operator trojelemntowy : wyrazenie logiczne ? operacja_1 : operacja_2
//        // jesli true wykona sie operacja 1 jesli false to wykona sie operacja 2
////        return (input != null && !input.isBlank()) ? true : false;
//        return input != null && input.isBlank();
//    }
//}

public class StringHelper {

    public static boolean isValid(String input) {
//        if(input != null && !input.isBlank()) {
//            return true;
//        }
//        return false;
        // wyrażenie_logiczne ? operacja_1 : operacja_2;
        return input != null && !input.isBlank();
    }
}