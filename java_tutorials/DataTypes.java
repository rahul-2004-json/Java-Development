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


    }

}

