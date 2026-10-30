package cwiczenia03;

public class zadanie02 {
    public static void main(String[] args) {

        boolean boolean1 = false;
        int int1 = 8;
        double double1 = 3.14;
        char char1 = 'a';

// Porównanie typów liczbowych i znakowych
        System.out.println(int1 == double1);
        System.out.println(int1 == int1);
        System.out.println(int1 == char1);
        System.out.println(double1 == double1);
        System.out.println(double1 == char1);
        System.out.println(char1 == char1);

// Porównania typów liczbowych i znakowych z typem logicznym - BŁĄD, ponieważ w Javie nie da się porównać boolean z liczbami/znakami za pomocą ==
        // System.out.println(boolean1 == int1);            BŁĄD KOMPILACJI
        // System.out.println(boolean1 == double1);         BŁĄD KOMPILACJI
        // System.out.println(boolean1 == char1);           BŁĄD KOMPILACJI

    }
}