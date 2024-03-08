package fileexception;

import java.io.FileNotFoundException;

public class ClassA {
        public static void processEvenNumber(int number) throws RuntimeException {
            if (number % 2 == 0) {
                throw new RuntimeException("Even number encountered - Checked Exception");
            } else {
                System.out.println("Processing odd number in CheckedExceptionClass");
            }
        }
        public static void processOddNumber(int number) throws Exception {
            if (number % 2 != 0) {
                throw new FileNotFoundException("Odd number encountered - Checked Exception");
            } else {
                System.out.println("Processing even number in CheckedExceptionClass");
            }
        }
    }
