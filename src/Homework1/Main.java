package Homework1;

public class Main {
    public static void main(String[] args) {
        Message m1 = new Email(); //static: Message, dyynamic: Email
        Message m2 = new SMS(); //Static. essage, dynamic: SMS

        //die getType() methode existert in Message, wird aber überschrieben vom Email und SMS
        System.out.println(m1.getType());  // "Email", aufruf der methode aus Email
        System.out.println(m2.getType());  //  "SMS", aufruf der Methode aus SMS

        // m1.send();  // Fehler:  send() ist nicht in der Klasse Message,
        // der ompiler erwartet aber ein messange objekt

        // sichere möglichkeit mit instanceof:
        if (m1 instanceof Email) {
            ((Email) m1).send();
        }
    }
}
