package net.htlgkr.eduranovic19.hue2;

import java.util.Scanner;

public class NumberTester {

    String fileName;
    Scanner s;
    NumberTest oddTester, primeTester, palindromeTester;

    public NumberTester(String fileName) {
        this.fileName = "Numbers.csv";
    }

    public static void main(String[] args) {

    }

    public void setOddEvenTester(NumberTest oddTester) {
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester) {
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester) {
        this.palindromeTester = primeTester;
    }

    public void testFile() {
        s = new Scanner(fileName);
        NumberTest isEven = (number) -> (number % 2) == 0;
        NumberTest isPrime = (number) -> {
            return true;
        };
    }

}
