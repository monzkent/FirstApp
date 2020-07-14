import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("First line from app"); // This is a line comment
        System.out.println("Second line from app");
        System.out.println("Third line from app");
/*
        //variables
        int myVar;
        myVar = 50;
        System.out.println(myVar);
        int anotherVar = 100;
        System.out.println(anotherVar);

        final int maxStudents = 25;
        System.out.println(maxStudents);

        //primitive data types
        float kilometersInAMarathon = 42.195f;
        System.out.println(kilometersInAMarathon);

        char accentedU = '\u00DA';
        System.out.println(accentedU);

        // ++ increases by 1
        // -- reduces by 1
        int someValue = 5;
        System.out.println(++someValue);
        System.out.println(someValue);

        int someOtherValue = 5;

        System.out.println(someOtherValue++);
        System.out.println(someOtherValue);


        int myValue = 50;
        myValue -= 5;

        System.out.println(myValue);

        int myOtherValue = 100;
        int val1 = 5;
        int val2 = 10;

        myOtherValue /= val1 * val2;

        System.out.println(myOtherValue);

        int valA = 21;
        int valB = 6;
        int valC = 3;
        int valD = 1;

        int result1 = valA - valB / valC;
        int result2 = (valA - valB) / valC;

        System.out.println(result1);
        System.out.println(result2);

        int result3 = valA / valC * valD + valB;
        int result4 = valA / (valC * (valD + valB));

        System.out.println(result3);
        System.out.println(result4);

        float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal = 5;

        short result1 = (short) longVal;
        short result2 = (short) (byteVal - longVal);
        float result3 = longVal - floatVal;

        int value1 = 7;
        int value2 = 5;

        int maxValue = value1 > value2 ? value1 : value2;

        System.out.println(maxValue);

        // if else
        // if (condition) true-statement;

        int value1 = 10;
        int value2 = 4;
        if(value1 < value2)
            System.out.println("value 1 is bigger");
        else
            System.out.println("value 2 is bigger");

        int value3 = 10;
        int value4 = 40;
        if (value3 > value4)
            System.out.println("value 1 is bigger");
        else if (value3 < value4)
            System.out.println("value 2 is bigger");
        else
            System.out.println("value 1 and value 2 is equal");


        double value1 = 100.0d;
        double value2 = 50.0d;
        double result = 0.0d;
        char opCode = ' ';

        if (opCode == 'a')
            result = value1 + value2;
        else if (opCode == 's')
            result = value1 - value2;
        else if (opCode == 'm')
            result = value1 * value2;
        else if (opCode == 'd')
            result = value1 / value2;
        else
            result = 0.0d;

        System.out.println(result);



        int a = 20, b = 14, c = 5;
        if (a > b & b > c)
            System.out.println("a greater than c");

        if (a > b | b > c)
            System.out.println("a greater than c");

        // exclusive ir (xor) ^
        // and & true & true
        // Or | false|true true|false true|true
        // Exclusive or (XOR) ^ false^true true^false
        // Negation ! false


        boolean done = false;

        if (! done)
            System.out.println("Keep going");

        int students = 150;
        int rooms = 0;

        if(rooms != 0 && students/rooms > 30)
            System.out.println("Crowded");


        // block statement

        int v1 = 10, v2 = 4;
        final int diff;

        if(v1 < v2) {
            diff = v1 - v2;
            System.out.println("v1 is bigger than v2, diff = " + diff);
        }
        else {
            diff = v2 - v1;
            System.out.println("v1 is not bigger than v2, diff = " + diff);
        }


        double students = 30.0d, rooms = 4.0d;

        if (rooms >0.0d) {
            System.out.println(students);
            System.out.println(rooms);
            double avg = students / rooms;
            System.out.println(avg);
        }

        // switch statement


        double value1 = 100.0d;
        double value2 = 50.0d;
        double result = 0.0d;
        char opCode = 'd';

        switch (opCode){
            case 'a':
                result = value1 + value2;
                break;
            case 's':
                result = value1 - value2;
                break;
            case 'm':
                result = value1 * value2;
                break;
            case 'd':
                result = value2 != 0 ? value1 / value2 : 0.0d;
                break;
            default:
                System.out.println("Invalid opCode: "+opCode);
                result = 0.0d;
                break;

        }

        //while loop

        int someValue = 4;
        int factorial = 1;

        while(someValue > 1) {
            factorial *= someValue;
            someValue--;
        }
        System.out.println(factorial);

       //do-while loop

        int iVal = 80;

        do {
            System.out.print(iVal);
            System.out.print(" * 2 = ");
            iVal *= 2;
            System.out.println(iVal);
        } while(iVal < 25);

        //for loop


        for(int i = 1; i < 100; i *= 2)
            System.out.println(i);


        //arrays
        float[] theVals = {10.0f, 20.0f, 15.0f};
//        float[] theVals = new float[3];
        //theVals[0] = 10.0f;
        //theVals[1] = 20.0f;
        //theVals[2] = 15.0f;

        float sum = 0.0f;
        for(int index = 0; index <theVals.length; index++)
            sum+= theVals[index];
        System.out.println(sum);


        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] opCodes = {'d', 'a', 's', 'm'};
        double[] results = new double[opCodes.length];

        for(int i = 0; i < opCodes.length; i++) {

            switch (opCodes[i]) {
                case 'a':
                    results[i] = leftVals[i] + rightVals[i];
                    break;
                case 's':
                    results[i] = leftVals[i] - rightVals[i];
                    break;
                case 'm':
                    results[i] = leftVals[i] * rightVals[i];
                    break;
                case 'd':
                    results[i] = rightVals[i] != 0 ? leftVals[i] / rightVals[i] : 0.0d;
                    break;
                default:
                    System.out.println("Invalid opCode: " + opCodes[i]);
                    results[i] = 0.0d;
                    break;
            }

        }
        //for-each loop
        for(double currentResult : results)
            System.out.println(currentResult);

        //methods

        System.out.println("Before method call");
        doSomething();
        System.out.println("after method call");

        static void doSomething() {
            System.out.println("inside method");
            System.out.println("still inside");
        }


        double result = showSum(7.5, 1.4, 3);
        System.out.println("Back from showsum");

        static void showSum(float x, float y, int count) {
            float sum = x + y;
            for(int i = 0; i < count; i++)
                System.out.println(sum);
            return sum;
        }


        System.out.println("*** end of program ***");
*/

        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] opCodes = {'d', 'a', 's', 'm'};
        double[] results = new double[opCodes.length];
        System.out.println("a = "+ args.length);
        if(args.length == 0){
            for(int i = 0; i < opCodes.length; i++) {
                results[i] = execute(opCodes[i], leftVals[i], rightVals[i]);
            }
            //for-each loop
            for(double currentResult : results)
                System.out.println(currentResult);
        } else if(args.length == 1 && args[0].equals("interactive"))
            executeInteractively();
        else if(args.length == 3)
            handleCommandLine(args);
        else
            System.out.println("Please provide an operation codea nd 2 numeric values");
    }

    static void executeInteractively() {
        System.out.println("Enter an operation and two numbers:");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] parts = userInput.split(" ");
        performOperation(parts);
    }

    private static void performOperation(String[] parts) {
        char opCode = opCodeFromString(parts[0]);
        double leftVal = valueFromWord(parts[1]);
        double rightVal = valueFromWord(parts[2]);
        double result = execute(opCode, leftVal, rightVal);
        displayResult(opCode, leftVal, rightVal, result);
    }

    private static void displayResult(char opCode, double leftVal, double rightVal, double result) {
        char symbol = symbolFromOpCode(opCode);
        StringBuilder builder = new StringBuilder(20);
        builder.append(leftVal);
        builder.append(" ");
        builder.append(symbol);
        builder.append(" ");
        builder.append(rightVal);
        builder.append(" = ");
        builder.append(result);
        String output = builder.toString();
        System.out.println(output);
    }

    private static char symbolFromOpCode(char opCode){
        char[] opCodes = {'a', 's', 'm', 'd'};
        char[] symbols = {'+', '-', '*', '/'};
        char symbol = ' ';
        for(int index = 0; index < opCodes.length; index++){
            if(opCode == opCodes[index]) {
                symbol = symbols[index];
                break;
            }
        }
        return symbol;
    }

    private static void handleCommandLine(String[] args) {
        char opCode = args[0].charAt(0);
        double leftVal = Double.parseDouble(args[1]);
        double rightVal = Double.parseDouble(args[2]);
        double result = execute(opCode, leftVal, rightVal);
        System.out.println(result);
    }

    static double execute(char opCode, double leftVal, double rightVal) {
        double result;
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            case 'd':
                result = rightVal != 0 ? leftVal / rightVal : 0.0d;
                break;
            default:
                System.out.println("Invalid opCode: " + opCode);
                result = 0.0d;
                break;
        }
        return result;
    }

    static char opCodeFromString(String operationName) {
        char opCode = operationName.charAt(0);
        return opCode;
    }

    static double valueFromWord(String word) {
        String[] numberWords = {
                "zero","one","two","three","four",
                "five","six","seven","eight","nine"
        };
        double value = 0d;
        for(int index = 0; index < numberWords.length; index++){
            if(word.equals(numberWords[index])){
                value = index;
                break;
            }
        }
        return value;
    }
}
