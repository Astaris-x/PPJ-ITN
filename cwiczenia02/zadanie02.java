package cwiczenia02;

public class zadanie02 {
    static void main(String[] args) {
        int liczba = 14;
        String zamianaLiczbyNaSystemBinarny = Integer.toBinaryString(liczba);
        System.out.println(zamianaLiczbyNaSystemBinarny);
        int liczbaBinarna = 0b1110;
        System.out.println(liczbaBinarna);

        int rezultat1 = liczbaBinarna >> 0;
        System.out.println("Pierwszy rezultat: " + rezultat1);

        int rezultat2 = rezultat1 << 2;
        System.out.println("Drugi rezultat: " + rezultat2);

        int rezultat3 = rezultat2 >> 4;
        System.out.println("Trzeci rezultat: " + rezultat3);
    }
}
