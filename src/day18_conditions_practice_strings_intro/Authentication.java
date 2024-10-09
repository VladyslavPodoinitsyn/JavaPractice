package day18_conditions_practice_strings_intro;

public class Authentication {
    public static void main(String[] args) {
        int last4SSN = 4444;
        int pinCode = 1234;

        int expLast4SSN = 4444;
        int expPinCode = 1234;

        if (last4SSN == expLast4SSN && pinCode == expPinCode) {
            System.out.println("Authentication successful");
        } else {
            if (last4SSN != expLast4SSN && pinCode == expPinCode) {
                System.out.println("Last 4 of SSN did not match");
            } else if (pinCode != expPinCode && last4SSN == expLast4SSN) {
                System.out.println("pinCode did not match");
            } else {
                System.out.println("Last 4 of SSN and the pinCode did not match");
            }
        }
    }
}
