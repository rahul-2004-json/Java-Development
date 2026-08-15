public class println_print_printf {
    public static void main(String[] args){
        System.out.print(1);
        System.out.print(2);
        // Prints in same line like 1 ,2

        System.out.println("Rahul");
        System.out.println("Yadav");
        // Prints in separate line
        // Rahul
        // Yadav


        int a =1;
        int b= 2;
        String c = "Sum";
        System.out.println(a + b + c); // prints 3Sum
        System.out.println(c + a + b); // prints Sum12

        // printf doesn't add new line at the end , we can add with "\n"
        System.out.printf("%s of %d + %d: %d",c,a,b,a+b);


    }
}
