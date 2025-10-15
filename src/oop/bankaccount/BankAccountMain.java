package oop.bankaccount;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(500);
        BankAccount kallesAccount = new BankAccount(1000);
        System.out.println("Mitt saldo är: "+myAccount.getSaldo());
        myAccount.setSaldo(1000);
        System.out.println("Mitt nya saldo är: "+myAccount.getSaldo());
        myAccount.insert(200);
        System.out.println("Mitt nya saldo efter insättning är: "+myAccount.getSaldo());
        if (myAccount.withdraw(700)) {
            System.out.println("Mitt nya saldo efter uttaget är: " + myAccount.getSaldo());
        }
        if (!myAccount.withdraw(10000)){
            System.out.println("Så mycket pengar har jag inte , mitt belopp är: "+myAccount.getSaldo());
        }

    }
}
