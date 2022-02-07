import java.util.Scanner;

public class HomeworkDay3 {
    /**
     * doing casting of variables from byte to double
     *
     * @param a
     */
    public static void Casting(byte a) {

        short b;
        b = a;
        System.out.println("Variable byte a: " + a);
        System.out.println("Variable short b: " + b);

        int c = b;

        System.out.println("Variable int c: " + c);

        long d = c;

        System.out.println("Variable long d: " + d);

        float f = d;

        System.out.println("Variable float d: " + f);


        double e = f;
        System.out.println("Variable double e: " + e + "\n");
    }

    /**
     * doing casting of variables from double to byte
     *
     * @param a
     */
    public static void Casting(double a) {
        float b = (float) a;
        System.out.println("Variable double a: " + a);
        System.out.println("Variable float b: " + b);

        long c = (long) b;
        System.out.println("Variable long c: " + c);

        int d = (int) c;
        System.out.println("Variable int d: " + d);

        short e = (short) d;
        System.out.println("Variable short e: " + e);

        byte f = (byte) e;
        System.out.println("Variable byte f: " + f + "\n");
    }

    /**
     * converting  temperature from Fahrenheit to Celsius
     *
     * @param Farenheit
     */
    public static void converterTemperature(float Farenheit) {

        float CelsiusF = (Farenheit - 32) / 1.8f;
        int CelsiusI = (int) CelsiusF;
        System.out.println("Temperature in Celsius = " + CelsiusI + "\n");
    }

    /**
     * Computing area  and perimeter of circle.
     * @param radius
     */
    public static void areaAndPerimeterOfCircle(double radius) {

        final double PI = 3.14159;

        System.out.println("Area and perimeter of circle = " + PI * radius * radius + " and " + 2 * PI * radius+"\n");
    }

    /**
     * Printing the result of this expression 1 / 3
     */
    public static void resultOfExpression(){
        float f = 1/3.0f;
        double d = 1/3.0;
        System.out.println("float 1/3 = "+f+"\ndouble 1/3 = "+d+"\n");
    }

    /**
     *  printing Name and year of birth using only char primitive and int types
     */
    public static void nameAndYearInChar(){
        char m = 'M';
        char h = 'h';
        char e = 'e';
        char r = 'r';
        int year = 1994;

        System.out.println(m);
        System.out.println(h);
        System.out.println(e);
        System.out.println(r);
        System.out.println();
        System.out.println(year);
        System.out.println();
    }

    /**
     * Casting char to int.
     */
    public static void castingCharToInt(){
        char m = 'M';
        int numM = (int)m;
        System.out.println("int 'M' = "+numM+"\n");
    }

    /**
     * program parses your name letters as a integers, calculate average of them
     * @param name
     */
    public static void averageOfnameLetters(String name){

        int sum = 0;
        for (int i = 0; i < name.length(); i++) {
            sum += name.charAt(i);
        }
        System.out.println(name +" "+ (double)(sum/name.length())+"\n");
    }

    /**
     * finding char value corresponding to that int value
     * @param inputNum
     */
    private static void charValueOfInt(int inputNum) {
        System.out.println(inputNum + " - "+ (char)inputNum+"\n");
    }

    /**
     * Concatenating string values
     * @param str1
     * @param str2
     */
    private static void concanetateStrings(String str1, String str2) {
        System.out.println(str1+" "+str2+"\n");
    }

    /**
     * Testing what happens if concatenate string and another primitive type
     */
    private static void concatenateTest() {
        int a = 10;
        char m = 'M';
        String str = "Hello";
        System.out.println("int a + int a = "+(a+a));
        System.out.println("int a + char m = "+a+m);
        System.out.println("String str + int a = "+str+a);
        System.out.println("String str + char m = "+str+m+"\n");
    }

    /**
     * trying to print text
     */
    private static void printText() {
        System.out.println("We are the so-called \"Vikings\" from the north.");
    }

    /**
     * Swaping 2 integers without using temp.
     */
    private static void swap2Number() {
        int num1 = 10;
        int num2 = 15;
        System.out.println("Numbers before swap " +
                "\nnum1 = " + num1+
                "\nnum2 = "+num2);
        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;
        System.out.println("\nNumbers after swap " +
                "\nnum1 = " + num1+
                "\nnum2 = "+num2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number from-128 to 127");
        byte task1 = scanner.nextByte();
        Casting(task1);

        System.out.println("Input double type number ");
        double task2 = scanner.nextDouble();
        Casting(task2);

        System.out.println("Enter temperature in Farenheit");
        int farenheit = scanner.nextInt();
        converterTemperature(farenheit);

        System.out.println("Enter radius of circle");
        double radius = scanner.nextDouble();
        areaAndPerimeterOfCircle(radius);

        resultOfExpression();

        nameAndYearInChar();

        castingCharToInt();

        System.out.println("Enter your name and program  parses your name letters" +
                " as a integers and calculate average of them");
        String name = scanner.nextLine();
        averageOfnameLetters(name);

        System.out.println("Enter number and program will show corresponding char value.");
        charValueOfInt(scanner.nextInt());

        System.out.println("Enter 2 String values and program will concatenate them.");
        concanetateStrings(scanner.nextLine(),scanner.nextLine());

        concatenateTest();

        printText();

        swap2Number();
    }
}
