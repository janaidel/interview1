
abstract class Account {

    int amount;

    public abstract void add(int amount);

    public abstract void subtract(int amount);

}

class RegAccount extends Account {
    int amount;
    public void add(int amount) {
        this.amount += amount;
    }
    public void subtract(int amount) {
        this.amount -= amount;
    }
}


public class Task2 {

    public static void main(String[] args) {
        Account account = new RegAccount();

        account.add(200);
        account.subtract(100);

        System.out.print("amount " + account.amount);
    }
}
