

public class reverse_recurtion {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Reverse of " + n + " is: " + reverse(n));
    }

    public static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10; // Append the last digit of n to rev
            n /= 10; // Remove the last digit from n
        }
        return rev;
    }
    
}
