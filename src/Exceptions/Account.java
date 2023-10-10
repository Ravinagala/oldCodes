package Exceptions;

import java.util.Objects;

public class Account {
    private String acno;
    private double balance;

    public Account(String acno, double balance) {
        this.acno = acno;
        this.balance = balance;
    }

    public void print() {
        System.out.println(this.acno);
        System.out.println(this.balance);
    }

    public void deposit(double amount) {
        try {
            if (amount <= 0)
                throw new InValidAmountException();
            balance += amount;
        } catch (InValidAmountException ex) {
            System.out.println(ex.getMessage()+ "your deposit amount is : "+amount);
        } finally {
            System.out.println("Balance amount is : "+balance);
            System.out.println("Thank you visit again...!");
        }
    }

    public void withdraw(double amount) {
        try {
            if (amount < 100)
                throw new InValidAmountException();
            if (balance < amount)
                throw new InSufficientAmountException();
            balance -= amount;
        } catch (InValidAmountException | InSufficientAmountException ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Thank You Visit Again");
        }
    }

    public String getAcno() {
        return acno;
    }

    public void setAcno(String acno) {
        this.acno = acno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Double.compare(balance, account.balance) == 0 && Objects.equals(acno, account.acno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(acno, balance);
    }

    @Override
    public String toString() {
        return "Account{" +
                "acno='" + acno + '\'' +
                ", balance=" + balance +
                '}';
    }
}
