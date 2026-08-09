public class Test {
    //String[] args : Method accepts an array of strings as parameters. This is where command line arguments can be passed to your program
    // JVM runs the below method as Test.main , since main is public it is accessible to JVM
    // this method is static , means it is run without creating any object instance

    // String[] args is the standard entry point that jvm looks for
    public static void main(String[] args){
        // System is a class , using which we access the println method
        System.out.println("Hello World");
    }


    // We can overload main( ) method as well , given that parameters are different
    // int[] args is not the standard entry point
    public static void main(int[] args) {
        System.out.println("Integer array main");
    }
}


// How to pass arguments to the main method
/*
* 1. Compile the .java file
* 2. Then run the code as java <filename> <argument1> <argument2>
* 3. Within code we can access these arguments as args[0], args[1]
* */


// You can have multiple classes with their own main() methods in the same file:
class Demo {
    public static void main(String[] args) {
        System.out.println("Demo");
    }
}

// We can either run java Test  or java Demo from cmd line
