public class DataTypes {

    public static void main(String[] args){
        //Primitive data types : Basic built-in types used to store simple values
        // By default every numeric number is treated as an integer

        //Integral numbers
            //byte   |
            //short  | Increasing
            //int    | Order of capacity
            //long   v

        long newNum = 10231231312l;    // -> at the end we write small l

        // Use below method to find min and max range of each
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);


        // Decimal numbers
        // By default any number written with decimal is treated as double
            // float  ->  Less Precision
            // double  -> More Precision

        float digit = 100.11111f;           // -> at the end we write small f
        double digit2 = 1000.335353535353;



        // characters
            // char

        char initial = 'a';
        System.out.println(initial);    // prints  : a
        System.out.println((int) initial);  // prints : 97
        System.out.println((char) 65);
        char hindichar = 2309;
        char heart = '\u2764';            // unicode representation
        System.out.println(hindichar);   // prints अ
        System.out.println(heart);

        //ASCII = American Standard Code for Information Interchange  : Range 0 to 127
        //It assigns numbers to common English characters , as computers store information as bits and bytes so they require some numerical mapping
        // But ASCII has a problem -> ASCII was designed mainly for English and can't give letter of other language

        // Unicode solves above problem : Unicode is basically a much, much bigger table
        // It gives a unique number to characters from languages around the world
        // A -> U+0041


        // boolean
        boolean isEligible = false;



        //Widening conversion , smaller type gets fit in bigger type
        //These are implicit conversion (automatic conversion)
        byte byteValue = 10; // 1 byte
        short shortValue = byteValue; // 2 bytes
        int intValue = shortValue; // 4 bytes
        long longValue = intValue; // 8 bytes
        float floatValue = longValue; // 4 bytes
        double doubleValue = floatValue; // 8 bytes

        System.out.println("int: " + intValue);
        System.out.println("Long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);


        char charValue = 'A';
        float floatCharValue = charValue; // Widening conversion from char to float

        System.out.println("char: " + charValue);
        System.out.println("float value: " + floatCharValue);


        //Narrowing conversion or explicit conversion
        double doubleValue2 = 123.456;
        float floatValue2 = (float) doubleValue2; // Narrowing conversion from double to float
        long LongValue2 = (long) floatValue2; // Narrowing conversion from float to long
        int intValue2 = (int) LongValue2; // Narrowing conversion from long to int

        System.out.println("double: " + doubleValue2);
        System.out.println("float: " + floatValue2);
        System.out.println("long: " + LongValue2);
        System.out.println("int: " + intValue2);

    }

}

