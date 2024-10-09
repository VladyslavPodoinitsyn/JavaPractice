package day37_methods_overloading;

public class WarmUpMethod {
    public static void main(String[] args) {
        loginVoid("cybertekStudent", "abc123");
        loginVoid("cybertekStudent", "ABC123");
        System.out.println(login("cybertekStudent", "abc123"));

        if (login("cybertekStudent", "abc123")) {
            System.out.println("Login successful, welcome to Canvas");
            System.out.println("Select the course to continue");
        } else {
            System.out.println("Login failed");
        }

        boolean isLoginSuccess = login("nadir", "mountain");
        System.out.println("isLoginSuccess = " + isLoginSuccess);



    }

    public static void loginVoid (String userName, String password) {
        String secretUsername = "cybertekStudent";
        String secretPassword = "abc123";

        if (userName.equalsIgnoreCase(secretUsername) && password.equals(secretPassword)) {
            System.out.println("Login successful, welcome CybertekStudent");
        } else {
            System.out.println("Incorrect username or password");
        }
    }

    public static boolean login (String userName, String password){
        String secretUsername = "cybertekStudent";
        String secretPassword = "abc123";

        if (userName.equalsIgnoreCase(secretUsername) && password.equals(secretPassword)) {
            return true;
        }
        return false;
    }
}
