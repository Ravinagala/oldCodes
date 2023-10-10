package Exceptions;

public class TestAccount {
    public static void main(String[] args)  {
        Account a = new Account("1001",2000);

        a.deposit(-1);

        a.withdraw(-1);

    }
}
