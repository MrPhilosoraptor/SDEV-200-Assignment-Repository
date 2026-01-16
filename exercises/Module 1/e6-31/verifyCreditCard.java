import java.util.Scanner;

public class verifyCreditCard {
    public static boolean isValid(int number) {
        return number % 10 == 0;
    }

    public static int sumOfDoubleEvenPlace(int[] digits) {
        int sum = 0;
        for (int i = 0; i < digits.length; i += 2) {
            int doubled = digits[i] * 2;
            if (doubled > 9) {
                sum += (doubled / 10) + (doubled % 10);
            } else {
                sum += doubled;
            }
        }
        return sum;
    }

    public static int getDigit(int number) {
        if (number > 9) {
            return (number / 10) + (number % 10);
        }
        return number;
    }

    public static int sumOfOddPlace(int[] digits) {
        int sum = 0;
        for (int i = 1; i < digits.length; i += 2) {
            sum += digits[i];
        }
        return sum;
    }

    public static boolean prefixMatched(int[] digits, int d) {
        String prefix = Integer.toString(d);
        String numberPrefix = "";
        for (int i = 0; i < prefix.length(); i++) {
            numberPrefix += Integer.toString(digits[i]);
        }
        return numberPrefix.equals(prefix);
    }

    public static int getSize(int[] digits) {
        return digits.length;
    }

    public static long getPrefix(int[] digits, int k) {
        String prefix = "";
        for (int i = 0; i < Math.min(k, digits.length); i++) {
            prefix += Integer.toString(digits[i]);
        }
        return Long.parseLong(prefix);
    }

    public static void main(String[] args) {
        String cardNum;
        int[] digitList;
        int evenTotal, oddTotal;
        try (Scanner scan = new Scanner(System.in)) {
            cardNum = scan.nextLine();
            digitList = cardNum.chars().map(Character::getNumericValue).toArray();
        }

        evenTotal = sumOfDoubleEvenPlace(digitList);
        oddTotal = sumOfOddPlace(digitList);

        System.out.println("Even total: " + evenTotal);
        System.out.println("Odd total: " + oddTotal);
        int finalTotal = evenTotal + oddTotal;
        System.out.println("Final total: " + finalTotal);
        if (isValid(finalTotal)) {
            System.out.println(cardNum + " is valid");
        } else {
            System.out.println(cardNum + " is invalid");
        }
    }
}
