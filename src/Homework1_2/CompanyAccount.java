package Homework1_2;
import Homework1.Account;

public class CompanyAccount extends Account{
    public void testAccess() {
        System.out.println(owner);             // klappt da public
        // System.out.println(balance);        // klappt nicht, private nur in der klasse
        System.out.println(pin);               // klappt protected → sichtbar über Vererbung
        // System.out.println(internalNote);   // Klappt nicht default/package-private ist nur im gleichen package sichtbar
    }
}
