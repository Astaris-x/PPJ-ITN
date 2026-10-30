package cwiczenia02;

public class zadanie03 {
    static void main(String[] args) {

        int liczba = 123456789;
        System.out.println(liczba);

        int ostatnie5Bitow = liczba & 0b11111;
        System.out.println(ostatnie5Bitow);

        int siodmyBit = (liczba >> 7) & 1;
        System.out.println(siodmyBit);



    }
}
