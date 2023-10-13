public class Balance implements Budget{
    double balance;

    public Balance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }




    @Override
    public void addCash(double in) {
        balance += in;
    }

    @Override
    public void substractCash(double in) {
        balance -= in;
    }

    @Override
    public void status() {

    }
}
