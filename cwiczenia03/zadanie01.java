package cwiczenia03;

public class zadanie01 {
    static void main(String[] args) {

// typ logiczny
        boolean booleanMin = false;
        boolean booleanMax = true;

// typ znakowy
        char char1 = 'a';
        char char2 = '!';
        char charMin = '\u0000';
        char charMax = '\uFFFF';

// zmienne liczbowe całkowite
        byte byte1 = -1;
        byte byte2 = 0b1000;
        byte byteMin = -128;
        byte byteMax = 127;
        byte byteMaxBin = 0b01111111;

        short short1 = 12345;
        short short2 = 0b0110;
        short shortMin = -32768;
        short shortMax = 32767;
        short shortMaxHex = 0x7FFF;

        int int1 = -123456;
        int int2 = 0135;
        int intMin = -2147483648;
        int intMax = 2147483647;
        int intMaxOct = 017777777777;

        long long1 = 123456789L;
        long long2 = 0x125F33;
        long longMin = -9223372036854775808L;
        long longMax = 9223372036854775807L;
        long longMaxHex = 0x7FFFFFFFFFFFFFFFL;

// zmienne zmiennoprzecinkowe
        float float1 = 3.14f;
        float floatMin = -3.4028235E38f;
        float floatMax = 3.4028235E38f;

        double double1 = 3.14159;
        double doubleMin = -1.7976931348623157E308;
        double doubleMax = 1.7976931348623157E308;


// Wyświetlenie wszystkich wartości w konsoli
        System.out.println("--- TYP LOGICZNY ---");
        System.out.println("boolean Min: " + booleanMin);
        System.out.println("boolean Max: " + booleanMax);

        System.out.println("\n--- TYP ZNAKOWY ---");
        System.out.println("char przyklad 1: " + char1);
        System.out.println("char przyklad 2: " + char2);
        System.out.println("char Min: " + (int)charMin);
        System.out.println("char Max: " + (int)charMax);

        System.out.println("\n--- ZMIENNE CAŁKOWITE: BYTE ---");
        System.out.println("byte przyklad 1: " + byte1);
        System.out.println("byte przyklad 2 (bin): " + byte2);
        System.out.println("byte Min: " + byteMin);
        System.out.println("byte Max: " + byteMax);
        System.out.println("byte Max (bin): " + byteMaxBin);

        System.out.println("\n--- ZMIENNE CAŁKOWITE: SHORT ---");
        System.out.println("short przyklad 1: " + short1);
        System.out.println("short przyklad 2 (bin): " + short2);
        System.out.println("short Min: " + shortMin);
        System.out.println("short Max: " + shortMax);
        System.out.println("short Max (hex): " + shortMaxHex);

        System.out.println("\n--- ZMIENNE CAŁKOWITE: INT ---");
        System.out.println("int przyklad 1: " + int1);
        System.out.println("int przyklad 2 (oct): " + int2);
        System.out.println("int Min: " + intMin);
        System.out.println("int Max: " + intMax);
        System.out.println("int Max (oct): " + intMaxOct);

        System.out.println("\n--- ZMIENNE CAŁKOWITE: LONG ---");
        System.out.println("long przyklad 1: " + long1);
        System.out.println("long przyklad 2 (hex): " + long2);
        System.out.println("long Min: " + longMin);
        System.out.println("long Max: " + longMax);
        System.out.println("long Max (hex): " + longMaxHex);

        System.out.println("\n--- ZMIENNE ZMIENNOPRZECINKOWE: FLOAT ---");
        System.out.println("float przyklad: " + float1);
        System.out.println("float Min: " + floatMin);
        System.out.println("float Max: " + floatMax);

        System.out.println("\n--- ZMIENNE ZMIENNOPRZECINKOWE: DOUBLE ---");
        System.out.println("double przyklad: " + double1);
        System.out.println("double Min: " + doubleMin);
        System.out.println("double Max: " + doubleMax);
    }
}