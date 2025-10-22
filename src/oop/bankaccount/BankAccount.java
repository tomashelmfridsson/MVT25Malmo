package oop.bankaccount;

public class BankAccount {

    private int saldo=0; // Attribut

    public int getSaldo() {
        return saldo;
    }

    public void insert(int amount) {
        this.saldo += amount;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public boolean withdraw(int amount) {
        if (this.saldo >= amount) {
            this.saldo -= amount;
            return true;
        }
        return false;
    }
}
