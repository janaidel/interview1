public class Task2 {
}


abstract class Account {
    int amount;

    public abstract void add(int amount);

    public abstract void subtract(int amount);
}

class reg_Account extends Account{
    int amount;

    public void add(int amount){
        this.amount += amount;
    }
    public void subtract(int amount){
        this.amount -= amount;
    }

}