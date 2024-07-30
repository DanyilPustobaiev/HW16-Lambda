package app;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Supplier;


public class Main {

    public static void main(String[] args) {

        MathOperation mathOperation = new MathOperation() {

            @Override
            public int operation(int a, int b) {
                return a + b;
            }

        };

        System.out.println("Result of addition: " + mathOperation.operation(1, 1));

        StringManipulator stringManipulator = (str) ->
                System.out.println("Input string to uppercase:  " + str.toUpperCase());
        Scanner sc = new Scanner(System.in);
        System.out.print("Type some string: ");
        String input = sc.nextLine();
        stringManipulator.manipulator(input);

        Function<String, Integer> function = StringListProcessor::countUppercase;
        System.out.println("Number of capital letters in a string: " +
                StringListProcessor.countUppercase("hOmEWorK-16 Lamda"));

        System.out.println("Random Number from -100 to 0: " + RandomNumberGenerator.generateRandomNumber(-100, 0));

        Supplier<Integer> randomIntegerSupplier = () -> (int) (Math.random() * 100);
        System.out.println("Random Number from 0 to 100 : " + randomIntegerSupplier.get());


    }

}
