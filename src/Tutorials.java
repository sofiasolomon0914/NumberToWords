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

    }


}


