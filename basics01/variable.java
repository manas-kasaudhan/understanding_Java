package basics01 ;

// variable --> a reusable container for a value

// Primitive --> simple value stored directly in memory (stack)

// Reference --> memory address (stack) that points to the (heap)

// Primitive vs Reference 
// -------        --------
// int             string 
// double          array 
// char            object
// boolean 

public class variable {
    public static void main(String[] args) {
        // int --> stores integers

        int age = 22; // declaration and initialization of variable
        int new_age = 24; // assignment of variable

        System.out.println("The age is " + age + " and the new age is " + new_age);

        // double --> stores a decimal value

        double price = 19.99;
        double gpa = 8.06;

        System.out.println("The price is " + price +" $");

        // char = stores a single character 

        char grade = 'A';
        char currency = '$';

        System.out.println("The grade is " + grade);
        System.out.println("The currency mode is " + currency);

        // boolean --> either true or false 

        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;

        System.out.println(isStudent);
        System.out.println("For sale: " + forSale);
        System.out.println("Is online: " + isOnline);

        // String --> Chain/Series of characters (Reference Data Type)

        String name = "Manas Kasaudhan";

        String email = "NakliHai@gmail.com";

        System.out.println("Hello " + name);
        System.out.println("Hello , Your email is  " + email);

        System.out.println("Hello " + name + " , your email is " + email + " and your gpa is " + gpa );

    }
}