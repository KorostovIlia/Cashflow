public class VariableExpense {
    private String expanse;
    private double amount;

    public VariableExpense(String name, double amount) {
        this.expanse = name;
        this.amount = amount;
    }

    public String getExpanse() {
        return expanse;
    }

    public void setExpanse(String expanse) {
        this.expanse = expanse;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
