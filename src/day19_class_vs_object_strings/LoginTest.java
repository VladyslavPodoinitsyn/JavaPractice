package day19_class_vs_object_strings;

public class LoginTest {
    public static void main(String[] args) {
        String expUserName = "cybertek";
        String expPassword = "Abc123";

        String userName = "CYBERTEK";
        String password = "Abc123";

        if (userName.equalsIgnoreCase(expUserName) && password.equals(expPassword)) {
            System.out.println("Pass - user successfully logged in");
        } else if (userName != expUserName && password.equals(expPassword)){
            System.out.println("Incorrect Username");
        } else {
            if (userName.equalsIgnoreCase(expUserName) && password != expPassword) {
                System.out.println("Incorrect Password");
            } else {
                System.out.println("Username and Password are not correct");
            }
        }
    }
}
