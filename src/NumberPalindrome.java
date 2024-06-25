public class NumberPalindrome {

    public static boolean isPalindrome(int number){
        int reverse = 0;
        if (number < 0){
            number = -number;
        }
        int num = number;
        while (num > 0) {
            int lastDigit = num % 10;
            reverse = (reverse * 10) + lastDigit;
            num = num / 10;
        }

        return number == reverse;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(-707));
        System.out.println(isPalindrome(11212));
    }
}
