public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalidrome(123));
    }

    public static boolean isPalidrome(int x) {
        int temp = x;
        int rev = 0;
        if (x < 0)
            return false;
        while (x > 0) {
            int digit = x % 10; // returns last digit of 'x'
            rev = (rev * 10) + digit; // Builds the reversed number by shifting digits left and adding the last digit
            x /= 10; // Removes the last digit from 'x'
        }
        if (rev == temp)
            return true;
        return false;
    }
}
