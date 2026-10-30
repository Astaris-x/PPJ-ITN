package cwiczenia02;

public class zadanie01{
    public static void main(String[] args){

        int liczba = 165;
        System.out.println("Liczba " + liczba + " w zapisie binarnym: " + Integer.toBinaryString(liczba));
        System.out.println("Liczba " + liczba + " w zapisie oktalnym: " + Integer.toOctalString(liczba));
        System.out.println("Liczba " + liczba + " w zapisie heksadecymalnym: " + Integer.toHexString(liczba));

        System.out.println("Literał binarny: " + 0b10100101);
        System.out.println("Literał oktalny: " + 0245);
        System.out.println("Literał heksadecymalny: " + 0xa5);
    }
}
