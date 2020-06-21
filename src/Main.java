public class Main {
    public static void main(String[] args) {
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(252));
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(257));
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(0));
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(5));
    }
}

//* sumFirstAndLastDigit(252); → should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
//
//* sumFirstAndLastDigit(257); → should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
//
//* sumFirstAndLastDigit(0); → should return 0, the first digit and the last digit is 0 since we only have 1 digit,
// which gives us 0+0 and the sum is 0.
//
//* sumFirstAndLastDigit(5); → should return 10, the first digit and the last digit is 5 since we only have 1 digit,
// which gives us 5+5 and the sum is 10.