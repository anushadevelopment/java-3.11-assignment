import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class LearnExceptions {
    private final static Logger logger = Logger.getLogger(LearnExceptions.class.getName()); 

    public static void main(String[] args) {
        logger.info("Application starts");
        int x = 10;
        int y = 0;

        // LBYL
        // if(y == 0) {
        //     System.out.println("Cannot divide by zero");
        // }else {
        //     int result = divide(x, y);
        //     System.out.println(result);
        // }

        // EAFP
        try {
            int result = divide(x, y);
            System.out.println(result);
        } catch (ArithmeticException exception) {
            System.out.println(exception);
            logger.severe(exception.getMessage());
        } finally {
            System.out.println("This is the finally block");
        }

        int[] numbers = { 1, 2, 3, 4, 5 };
        int index = 5;
        // System.out.println(numbers[index]);

        // LBYL
        // if (index >= 0 && index < numbers.length) {
        //     System.out.println(numbers[index]);
        // } else {
        //     System.out.println("Index is out of bounds");
        // }

        // EAFP
        try {
            if(index<0 || index > numbers.length -1) {
                throw new InvalidArrayIndexException(index + " is not a valid index");
            }
            System.out.println(numbers[index]);
        } catch (InvalidArrayIndexException exception) {
            System.out.println(exception);
            logger.severe(exception.getMessage());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        // int number = scanner.nextInt();
        // System.out.println("You have entered: " + number);
        // scanner.close();

        // LBYL
        // if(scanner.hasNextInt()){
        //     int number = scanner.nextInt();
        //     System.out.println("You have entered: " + number);
        // } else {
        //     System.out.println("Input is not an integer");
        // }

        // EAFP
        try{
            int number = scanner.nextInt();
            System.out.println("You have entered: " + number);
            scanner.close();
        } catch(InputMismatchException exception){
            System.out.println(exception);
            logger.severe(exception.getMessage());
        }
        // FileInputStream f = new FileInputStream("test.txt");

        // try {
        //     FileInputStream f = new FileInputStream("test.txt");
        //     Scanner s = new Scanner(f);
        //     System.out.println(s.nextLine());
        //     s.close();
        // } catch(FileNotFoundException exception) {
        //     System.out.println(exception.getMessage());
        // }

        try {
            readFileFirstLine("test2.txt");
        } catch(FileNotFoundException exception) {
            System.out.println(exception.getMessage());
            logger.severe(exception.getMessage());
        }

        try{
            int result = dividePositiveNumbers(10, -2);
            System.out.println(result);
        } catch(NegativeNumberException exception) {
            System.out.println(exception);
            logger.severe(exception.getMessage());
        } 
    
        try {
            int[] array = {1, 0, -3, 4, 5 }; 
            if(checkNegativeElement(array)){
                System.out.println("All good 👍, no negative numbers!");
            }
        } catch (NoNegativeElementException exception) {
            System.out.println(exception);
            logger.severe(exception.getMessage());
        }

        logger.info("Application ends");
    }

    public static boolean checkNegativeElement(int[] numbers) {
        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] < 0)
                throw new NoNegativeElementException("Element " + (index + 1) + " is a negative number");
        }
        return true;
    }

    public static int dividePositiveNumbers(int a, int b) {
        if(a < 0){
            throw new NegativeNumberException("Negative numbers are not allowed for quotient");
        }
        if(b < 0){
            throw new NegativeNumberException("Negative numbers are not allowed for divisor");
        }
        return a / b;
    }

    public static void readFileFirstLine(String filename) throws FileNotFoundException{
        FileInputStream f = new FileInputStream(filename);
        Scanner s = new Scanner(f);

        if (s.hasNextLine()) {
            System.out.println(s.nextLine());
        } else {
            System.out.println("File is empty");
        }

        s.close();
    }

    public static int divide(int x, int y) {
        return x / y;
    }

}
