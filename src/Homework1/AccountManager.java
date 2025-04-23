package Homework1;

public class AccountManager {
    public void testAccess() {
        Account acc = new Account();
        System.out.println(acc.owner);          // klappt, public im package sichtbar
        // System.out.println(acc.balance);     // Klappt nicht, private → nur in gleicher class sichtbar
        System.out.println(acc.pin);            // Klappt protected → sichtbar im gleichen Package
        System.out.println(acc.internalNote);   // Klappt default/package-private → sichtbar im gleichen Package
    }
}
