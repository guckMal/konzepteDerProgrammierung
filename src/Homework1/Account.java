package Homework1;

public class Account {
    public String owner;
    private double balance;
    protected int pin;
    String internalNote;

    double getBalance() {
        return balance;
    }

    void changePin(int pin, int neu){
        if (pin == this.pin){
            this.pin = neu;
        }
    }
}
/*
Als alternatives Design eignet es sich, alle attribute privaate zu machen und
kontrollierten zugriff über Getter und Setter zu ermöglichen

unterschiede zwischne der verwendung von protected und der verwendung von private und gettern
sind:
 mit protected hat man direten zugriff auf die attribute, mit gettern über methoden
 zudem kann ien getter, wenn er public ist, auch von einer nicht erbenden klasse in einem anderen package benutzt werden
 */