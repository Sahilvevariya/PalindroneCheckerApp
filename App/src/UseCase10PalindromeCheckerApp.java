public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "A man a plan a canal Panama";

        String normalized = word.replaceAll("\\s+", "").toLowerCase();

        String reversed = new StringBuilder(normalized).reverse().toString();

        if(normalized.equals(reversed)) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }

    }
}