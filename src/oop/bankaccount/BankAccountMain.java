package oop.bankaccount;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        BankAccount callesAccount = new BankAccount();
        BankAccount ollesAccount = new BankAccount();
        BankAccount nissesAccount = new BankAccount();


        System.out.println("Mitt saldo är: "+myAccount.getSaldo());
        myAccount.setSaldo(1000);
        System.out.println("Mitt nya saldo är: "+myAccount.getSaldo());
        myAccount.insert(200);
        System.out.println("Mitt nya saldo efter insättning är: "+myAccount.getSaldo());
        if (myAccount.withdraw(19900)) {
            System.out.println("Mitt nya saldo efter uttaget är: " + myAccount.getSaldo());
        }
        else {
            System.out.println("Så mycket pengar har jag inte , mitt belopp är: "+myAccount.getSaldo());
        }

    }
}
