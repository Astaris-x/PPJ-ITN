package cwiczenia03;

public class zadanie06 {
    public static void main(String[] args) {

// Przypuszczam, iż pojawi się bład kompilacji.

        int a = 5;
        double b = 5.0;

        b = a;
        a = b;

        System.out.println(a);
        System.out.println(b);

/*  Pojawia się błąd kompilacji z powodu a = b (przypisanie wartości double do zmiennej typu int).
    Po wykomentowaniu a = b, program działa poprawnie i wypisuje na konsoli wartość zmiennej b typu double.
*/

    }
}