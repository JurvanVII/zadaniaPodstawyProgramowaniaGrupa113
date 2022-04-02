/*
Napisz program, który wyświetli na ekranie wyraz SDA, nie używając ani jednego znaku " lub ' ANI SCANNERA
 */
//kazdy znak ma swoja interprteacje w tabeli ascii
// mozna nie
package pl.sdacademy.java.basic.day1;

public class Task1 {
    public static void main(String[] args) {
        displayWordUsingDecimalFormat();
        displayWordUsingBinaryFormat();
        displayWordUsingHexaFormat();
    }

    //83 68 65
    private static void displayWordUsingDecimalFormat() {
        char s = 83;
        char d = 68;
        char a = 65;
        //        System.out.println(s + d + a); nie zadziala da 216
        System.out.print(s);
        System.out.print(d);
        System.out.println(a);
    }

    private static void displayWordUsingBinaryFormat() {
        char s = 0b001010011; //trzeba dodac prefix 0b, bedzie wiedzla ze binarny
        char d = 0b01000100;
        char a = 0b01000001;
        System.out.print(s);
        System.out.print(d);
        System.out.println(a);
    }

    private static void displayWordUsingHexaFormat() { // potrzebny prefix 0x zeby komplilator wiedzial ze to hexa a nie decimal
        char s = 0x53; //trzeba dodac prefix 0b, bedzie wiedzla ze binarny
        char d = 0x44;
        char a = 0x41;
        System.out.print(s);
        System.out.print(d);
        System.out.print(a);
    }
}
