import java.util.Scanner;

    public class Palindrome {
        public static void main(String[] args) {
            palindrome();
        }
        public static void palindrome() {
            boolean run = true;
            while (run) {
                System.out.println("Input word or number:");
                Scanner scanner = new Scanner(System.in);
                String input = scanner.nextLine();

                int charsLength = input.length() - 1;
                String refference = "";
                String reffVar = input.toLowerCase();

                char[] refferenceArray = reffVar.toCharArray();
                for (int i = charsLength; i >= 0; i--) {
                    refference += refferenceArray[i];
                }
                if (reffVar.equals(refference)) {
                    System.out.println("Palindrome");
                    run = false;
                } else {
                    System.out.println("Not a Palindrome, Try Again.");
                }
            }
        }
    }

