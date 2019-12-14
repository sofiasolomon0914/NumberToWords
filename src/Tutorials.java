public class Tutorials {    //class name must match the file name, and all code must be inside class
    //all classes should start with an uppercase first letter
    public static void main(String[] args) {    //code inside main() will always be executed
        System.out.println("Hello World");  //println() is used to print a message
        /*
        STRING: Stores text, string values are surrounded by double quotes
        INT: stores integers, without decimals
        FLOAT: Stores floating point numbers, with decimals
        CHAR: Stores single characters, surrounded by single quotes
        BOOLEAN: Stores values with two states: true or false
         */

    //Format to create a variable is: type variable = value
    String name = "John";
    System.out.println(name);
    int myNum = 15;
    System.out.println(myNum);
    //you can also declare a variable without assigning the value, and then assign the value later.
    int myNumb;
    myNumb = 15;
    System.out.println(myNumb);
    //you can also change the value of an existing variable
    myNum = 20; //myNum is now 20
    System.out.println(myNum);
    // if you do not want to to change the existing value you can use the keyword final
    final int myNumber = 15;
    System.out.println(myNumber);
    //Refer below for declaring variables fo other types
    int myNumbers = 5;
    float myFloatNum = 5.99f;
    char myLetter = 'D';
    boolean myBool = true;
    String myText = "Hello";
    System.out.println(myNumbers);
    System.out.println(myFloatNum);
    System.out.println(myLetter);
    System.out.println(myBool);
    System.out.println(myText);
    //println() method is used to display variables
    //You can also use the + sign to ass a variable to another
    String firstName = "John";
    String lastName = "Doe";
    String fullName = firstName + lastName;
    System.out.println(fullName);

    //the + operator can also be used as a mathematical operator
    int x = 5;
    int y = 6;
    System.out.println(x + y);  //Print the value of x + y

    // you can also declare more than one variable as long as they all are the same type
    int a = 5, b = 6, c = 50;
    System.out.println(a + b + c);

    /*
    Data type are divided into two groups

    PRIMITIVE DATA TYPES: byte, short, int, long, float, double, boolean and char
    NON-PRIMITIVE DATA TYPES: string, arrays, and classes
     */

    /*
    Primitive number types are divided into two groups

    INTEGER TYPES: stores whole numbers, positive or negative
    FLOATING POINT TYPES: represents numbers with a fractional part

    most commonly used are int(for whole numbers) and double (for floating point numbers)
     */

    //a byte can store whole numbers from -128 to 127
    byte myByte = 100;
    System.out.println(myByte);

    //a short data type can store whole numbers from -32768 to 32767
    short myShort = 5000;
    System.out.println(myShort);

    //the int data type can store whole numbers from -2147483648 to 2147483647
    int myInt = 100000;
    System.out.println(myInt);

    //the long data type can store whole numbers from -9223372036854775808 to 9223372036854775807
    long myLong = 15000000000L;
    System.out.println(myLong);

    //The float data type can store fractional numbers from 3.4e-038 to 3.4e+038; always end with 'f'
    float nyFloat = 5.75f;
    System.out.println(nyFloat);

    //double can store fractional numbers from 1.7e-308 to 1.7e+308; always end with 'd'
    double myDouble = 19.99d;
    System.out.println(myDouble);

    //better to use double because it can calculate more digits

    //can also use 'e' to indicate power of 10
    float f1 = 35e3f;
    double d1 = 12e4d;
    System.out.println(f1);
    System.out.println(d1);

    //the char data type can be used to store a single character
    char myGrade = 'B';
    System.out.println(myGrade);
    char h = 65, i = 66, j = 67;
    System.out.println(h);
    System.out.println(i);
    System.out.println(j);






    }


}


