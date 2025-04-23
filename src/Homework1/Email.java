package Homework1;

public class Email extends Message{
    public String getType(){
        return "Email";
    }

    public void send() {
        System.out.println("E-Mail sent");
    }
}
