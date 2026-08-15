
public class StringDataType {

    public static void main(String[] args){

        // String is not a primitve data type , it is a class in java
        // Two ways to create string
        String address = new String("India");   // an object with literal "India" is created in heap memory , address points to location storing this object
        String name = "Rahul";
        System.out.println(address + name);


        // IMPORTANT : String Pool in JAVA
        // String Pool is a "special area" in heap memory where Java stores and reuses String literals.
        String x = "Ram";  //Java checks: Does "Ram" already exist in the String Pool?
        // Initially, no. So Java creates it:

        String a = new String("Ram");
        //The literal "Ram" already exists in the String Pool because of x
        //But new String("Ram") explicitly tells Java: Create a new String object
        //Java creates another String object outside the pool (on the heap memory)

        // Here we are not checking string equality , we are checking referrence
        System.out.println(x == a); //will be false , Because they point to different objects.

        String b = new String("Ram");
        // a == b will also be false because both point to different objects


        String c = "Ram"; // Now Java again checks the String Pool: Is "Ram" already present?
        // Yes , already present for x , hence no new object created instead c points to the same object which x points.

    }

}
