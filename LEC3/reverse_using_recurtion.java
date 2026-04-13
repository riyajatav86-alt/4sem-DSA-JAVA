

public class reverse_using_recurtion {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println("Reverse of " + n + " is: " + reverse(n));
    }

    public static int reverse(int n) {
        return reverseHelper(n, 0);
    }

    private static int reverseHelper(int n, int rev) {
        if (n == 0) {
            return rev; // Base case: when n is 0, return the reversed number
        }
        rev = rev * 10 + n % 10; // Append the last digit of n to rev
        return reverseHelper(n / 10, rev); // Recursive call with the remaining digits of n
    }
    
}
