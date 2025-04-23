package Homework1_2;
import Homework1.Account;
public class ExternalAudit {
    public void testAccess() {
        Account acc = new Account();
        System.out.println(acc.owner);          // klappt da public
        // System.out.println(acc.balance);     // klappt nicht, da private nur in gleicher class
        // System.out.println(acc.pin);         // klappt nicht, protected → nicht sichtbar ohne Vererbung
        // System.out.println(acc.internalNote); // klappt nicht, default/package-private → nicht sichtbar in anderem package
    }
}
