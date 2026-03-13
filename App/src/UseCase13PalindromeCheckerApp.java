public class UseCase13PalindromeCheckerApp {

    public static boolean reverseStringMethod(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equals(reversed);
    }

    public static boolean twoPointerMethod(String word) {

        int start = 0;
        int end = word.length() - 1;

        while(start < end) {
            if(word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        String word = "madam";

        long start1 = System.nanoTime();
        boolean result1 = reverseStringMethod(word);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        boolean result2 = twoPointerMethod(word);
        long end2 = System.nanoTime();

        System.out.println("Reverse Method Result: " + result1);
        System.out.println("Execution Time: " + (end1 - start1) + " ns");

        System.out.println("Two Pointer Method Result: " + result2);
        System.out.println("Execution Time: " + (end2 - start2) + " ns");

    }
}