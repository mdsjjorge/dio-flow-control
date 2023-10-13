import java.security.InvalidParameterException;
import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Please, enter first parameter: ");
        int parameterOne = terminal.nextInt();
        System.out.println("Please, enter second parameter: ");
        int parameterTwo = terminal.nextInt();

        try {
            count(parameterOne, parameterTwo);

        } catch ( InvalidParameterException e ) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }

    }
    static void count(int parameterOne, int parameterTwo ) throws InvalidParameterException {

        if (parameterOne < 0 || parameterTwo < 0) {
            throw new InvalidParameterException("Parameters must be positive values.");
        }

        int count = parameterTwo - parameterOne;
        if (count <= 0) {
            throw new InvalidParameterException("The first parameter must be less than the second parameter.");
        }

        for (int i = 1; i <= count; i++) {
            System.out.println("printing number " + i);
        }
    }
}