public class PhoneNumberSumToSingleDigit {
    // sum the numbers in a phonenumber till to single digit number using recursion


    static long num = 9123456789l, sum = 0;   // If we look at num variable, int data type is throwing error whereas we need to use long.

    public static void main(String[] args) {
        sum();
        System.out.println(sum);
    }

    //recursive method
    public static void sum() {
        if (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
            sum();
        }
        if (sum > 10 && num == 0) {
            num = sum;
            sum = 0;
            sum();
        }
    }


}
