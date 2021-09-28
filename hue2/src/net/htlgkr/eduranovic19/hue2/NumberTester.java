package net.htlgkr.eduranovic19.hue2;

public class NumberTester {

    String fileName;
    NumberTest oddTester, primeTester, palindromeTester;

    public NumberTester(String fileName) {
        this.fileName = "Numbers.csv";
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

    }

}
