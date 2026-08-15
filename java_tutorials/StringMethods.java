import java.util.Locale;

public class StringMethods {
    public static void main(String[] args){
        // String Method
        String str1 = "remote";
        String str2 = "car";

        // compareTo method returns an integer value
        // It compares two strings lexicographically character by character
        // and gives the difference value
        // for comparison of str1 "r"  with str2 "c" gives 15 : because r different from c and their ASCII value
        // difference us 114 - 99 = 15
        int i = str1.compareTo(str2);



        //IMPORTANT : String in JAVA are immutable
        // Reason : Because literals are stored inside the string pool , many variable refer to this pool
        // If string were mutable , then it would cause the change at other place as well

        // All the methods in JAVA related to string like uppercase, lowercase , substring retun a new string and it is
        // stored in string pool , original string on which operation was performed stays as it is

        String name = "Rahul";
        // "Rahul" is not changed.
        // toLowerCase() returns a new String: "rahul"
        // The variable 'name' is then reassigned to refer to the new String.
        name = name.toLowerCase();
        System.out.println(name); // Output: rahul
        // A String object is immutable, but a String reference variable
        // can be reassigned to point to another String object.


        // Convert another value into string
        int age = 25;
        String str = String.valueOf(age);
        System.out.println(age);


        // Substring and Subsequence
        String name2 = "Amar Jadhav";
        // both methods return the same continous output in JAVA
        // this is because subsequence may return a lot of combinations between index 2 - 8 ,
        // hence it only gives continuous sequence
        System.out.println(name2.substring(2,8));
        System.out.println(name2.subSequence(2,8));

    }
}
