package src.Exceptions.runtimeexcpetion.test;

import java.io.IOException;
import java.sql.SQLException;

public class MultiplasRuntimeExceptionTest {

    public static void main(String[] args) {

        try {
            // throw new ArrayIndexOutOfBoundsException();
            // throw new IllegalArgumentException();
            // throw new ArithmeticException();
            // throw new RuntimeException();
            throw new IndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("DENTRO DO ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("DENTRO DO IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("DENTRO DO IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("DENTRO DO ArithmeticException");
        }

        System.out.println("Final do programa.");

        /**
        try {
            talvezLanceException();
        } catch (SQLException | IOException e) {

        }
         **/
    }

    private static void talvezLanceException() {

    }
}
