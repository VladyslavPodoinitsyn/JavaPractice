package day23_string_manipulation_while_loop;

public class SMSMessage {
    public static void main(String[] args) {
        String message = "Sender: [ Nadir ] From Number<2223334444> Message: {Hello, lets code some java}";
        String sender = message.substring(message.indexOf("[") + 1, message.indexOf("]"));
        String mobile = message.substring(message.indexOf("<") + 1, message.indexOf(">"));
        String text = message.substring(message.indexOf("{") + 1, message.indexOf("}"));
        System.out.println("sender - " + sender);
        System.out.println("mobile - " + mobile);
        System.out.println("text - " + text);

        System.out.println( " Fikret ".trim());
        sender = sender.trim();
        System.out.println("sender = " + sender);
        //trim -> removes spaces before and after the string NOT in between (example - " s q l " -> "s q l")
    }
}
