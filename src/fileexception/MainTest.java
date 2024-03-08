package fileexception;

public class MainTest {
        public static void main(String[] args) {
            int inputNumber = 5;
            try {
                ClassA.processEvenNumber(inputNumber);
            } catch (NullPointerException e) {
                System.out.println("Caught Checked Exception: " + e.getMessage());
            }

            try {
                ClassA.processOddNumber(inputNumber);
            } catch (Exception e) {
                System.out.println("Caught Checked Exception: " + e.getMessage());
            }

            try {
                ClassB.processEvenNumber(inputNumber);
            } catch (NullPointerException e) {
                System.out.println("Caught Unchecked Exception: " + e.getMessage());
            }

            try {
                ClassB.processOddNumber(inputNumber);
            } catch (Exception e) {
                System.out.println("Caught Unchecked Exception: " + e.getMessage());
            }
        }
    }

