package Interview;

public class NumberReverse {
        public static void main(String[] args) {
            int number = 1234;
            int reversedNumber = reverse(number);
            System.out.println("Original number: " + number);
            System.out.println("Reversed number: " + reversedNumber);
        }
        public static int reverse(int number) {
            int reversedNumber = 0;
            while (number != 0) {
                int digit = number % 10;
                reversedNumber = reversedNumber * 10 + digit;
                number /= 10;
            }
            return reversedNumber;
        }
    }

