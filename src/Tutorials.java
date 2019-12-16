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

    /*
    Casting is when you assign a value of one primitive data type to another type

    WIDENING CASTING(automatically): converting a smaller type to a larger type size
    NARROWING CASTING(manually): converting a larger type to a smaller type
     */

        //narrowing casting example
        int intWide = 9;
        double doubleNum = myInt; //Automatic casting: int to double

        System.out.println(intWide);    //outputs 9
        System.out.println(doubleNum); //outputs 9.0

        //narrowing casting example
        double classDouble = 9.78;
        int intClass = (int) classDouble;   //Manual casting: double to find int

        System.out.println(classDouble);    //Outputs 9.78
        System.out.println(intClass);   //Outputs 9


    /*
    Java operators include arithmetic operators, assignment operators, comparison operators,
    logical operators, bitwise operators
    */

        //Arithmetic operators examples
        int g = 12, k = 4;
        System.out.println(g + k);  //adds together two values
        System.out.println(g - k);   //subtracts one value from another
        System.out.println(g * k);  //Multiplies two values
        System.out.println(g / k);    //Divides two values
        System.out.println(g % k);  //Returns the division remainder
        System.out.println(++k);  //Increases teh value of a variable by 1
        System.out.println(--k);    //Decreases the value of a variable by 1

        //Assignment operator examples
        int r = 5;
        System.out.println(r = 5);  //same as r = 5
        System.out.println(r += 3); //same as r + 3
        System.out.println(r -= 3); //same as r - 3
        System.out.println(r *= 3); //same as r * 3
        System.out.println(r /= 3); //same as r / 3
        System.out.println(r %= 3); //same as r % 3
        System.out.println(r & 3);  //same as r & 3
        System.out.println(r |= 3); //same as r | 3
        System.out.println(r ^= 3); //same as r ^ 3
        System.out.println(r >>= 3);    //same as r = r >> 3
        System.out.println(r <<= 3);    //same as r = << 3

        //Comparison operator examples
        int w = 2, m = 5;
        System.out.println(w == m); //equal to
        System.out.println(w != m); //Not equal to
        System.out.println(w > m);  //greater than
        System.out.println(w > m);  //less than
        System.out.println(w >= m); //greatest than or equal to
        System.out.println(w <= m); //less than or equal to

        //Logical operator examples
        int e = 9;
        System.out.println(e < 5 && e < 10);    //Logical and...Returns true if both statements are true
        System.out.println(e < 5 || e < 4);   //Logical or...Returns true if one of the statements is true
        System.out.println(!(e < 5 && e < 10)); //Logical not...Reverse the result, returns false is the result is true

        //Java strings: used for storing text
        String greeting = "Hello";
        //String length: finding the the length of a string
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWKYZ";
        System.out.println("The length of the txt string is: " + txt.length());
        //Changing the string to lowercase/UPPERCASE
        String word = "Hello World";
        System.out.println(word.toUpperCase());    //Outputs "HELLO WORLD"
        System.out.println(word.toLowerCase());     //Outputs "hello world"
        //indexOf() returns the position of the first occurrence of a specified text in a string;starts counting from 0
        String textIndex = "Please locate where 'locate' occurs!";
        System.out.println(textIndex.indexOf("locate"));    //Outputs 7

        //You can use the + operator to combine string (concatenation)
        String first_Name = "John";
        String last_Name = "Doe";
        System.out.println(first_Name + " " + last_Name);
        //You can also use concat() to concatenate the two strings
        System.out.println(first_Name.concat(last_Name));

        //you can use a backslash to turn special characters into string characters
        String textOne = "We are the so-called \"Vikings\" from the north.";
        System.out.println(textOne);
        String textTwo = "It\'s alright.";
        System.out.println(textTwo);
        String textThree = "The character \\ is called backslash.";
        System.out.println(textThree);

    /*
    Other escape sequences include: \n  \r  \t  \b  \f
    \n NEW LINE
    \r CARRIAGE RETURN
    \t TAB
    \b BACKSPACE
    \f FORM FEED
    */

        //If you add two strings, the result will be a string concatenation
        String d = "10";
        String s = "20";
        String z = d + s;   // z will be 1020 (a String)
        System.out.println(z);

        System.out.println(Math.max(5, 10));     //You can use Math.max(x, y) to find the highest value of x and y
        System.out.println(Math.min(5, 10));    //Used to find the lowest value of x and y
        System.out.println(Math.sqrt(64));      //Used to return the square root of x
        System.out.println(Math.abs(-4.7));     //Used to return the absolute (positive) value of x
        System.out.println(Math.random());      //Used to return number between 0 (inclusive), and 1 (exclusive)

        //Booleans are values that can only have one of two values: YES/NO, ON/OFF, TRUE.FALSE
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);  //outputs true
        System.out.println(isFishTasty);    //outputs false

        //you can also use comparison operators to test if an expression is true
        int v = 10;
        int u = 9;
        System.out.println(v > u);  //return true, because 10 is higher than 9
        System.out.println(10 > 9); //returns true, because 10 is higher than 9
        System.out.println(10 == 15);   //returns false, because 10 9s not equal to 15

    /*
    Java If... Else uses a logical condition and a condition statement

    Logical conditions include:
        Less than: a < b
        Less than ot equal to: a <= b
        Greater than: a > b
        Greater than or equal to: a >= b
        Equal to a == b
        Not equal to: a != b

    Conditional Statements include:
        if... to specify a block of code to be executed, if a specified condition is true
        else... to specify a block of code to be executed, if the same condition is false
        else if... to specify a new condition to test, if the first condition is false
        switch... to specify many alternative block of code to be executed

    Syntax:
        if (condition)  {
            block of code to be executed if condition is true
        } else if (condition2)  {
            block of code to be executed if the condition is false and condition2 is true
        } else {
            block of code to be executed if the conditional is false and condition2 is true
        }
     */
    int time = 22;
    if (time < 10) {
        System.out.println("Good mroning.");
    } else if (time < 20) {
        System.out.println("Good day.");
    } else {
        System.out.println("Good evening.");
    }
    // Outputs "Good evening."

    /*
    There is also a short hand If...Else (Ternary Operator)

    variable = (condition)  ?  expressionTrue :  expressionFalse;

     */

    int timeOne = 20;
    String result = (timeOne < 18)  ? "Good day."  :  "Good evening.";
    System.out.println(result);

    /*
    You can use the switch statement to select one of many code blocks to be executed.

    Syntax:
        switch(expression)  {
            case x:
                code block
                break;
            case y:
                code block
                break;
            default:
                code block
        }
     */

    int day = 4;
    switch (day) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        default:
            System.out.println("Looking forward to the Weekend");   //defaults keyword specifies code to run if there is no case match
    }

    /*
    The while loop loops through a block of code as long as the specified condition is true.

    Syntax:

        while (condition)   {
            code block to be executed
        }

     */
    int q = 0;
    while (q < 5)   {
        System.out.println(q);
        q++;
    }
    }


}


