public class Task2 {

    public static void main(String[] args) {
        Account account = getAccount();

        account.deposit(10);
        account.withdraw(10);

        // ..
    }

    public static Account getAccount() {
        return new SimpleAccount();
    }
}


interface Account {
    void deposit(int amount);

    void withdraw(int amount);
}

class SimpleAccount implements Account {
    private int amount = 0;

    @Override
    public void deposit(int amount) {
        this.amount += amount;
    }

    @Override
    public void withdraw(int amount) {
        this.amount -= amount;
    }
}