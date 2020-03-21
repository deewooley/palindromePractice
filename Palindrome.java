import java.util.Scanner;

    public class Palindrome {
        public static void main(String[] args) {
            palindrome();
        }
        public static void palindrome() {
            boolean run = true;
            while (run) {
                System.out.println("Input word or number that is five characters or digits long:");
                Scanner scanner = new Scanner(System.in);
                String input = scanner.nextLine();
                if(input.length()!=5){
                    System.out.println("*ERROR: Must have exactly 5 digits or 5 characters!*");
                }
                else{
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
    }

