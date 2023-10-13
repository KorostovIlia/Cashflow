public class VariableExpense {
    private String outV;
    private double amount;

    public VariableExpense(String name, double amount) {
        this.outV = name;
        this.amount = amount;
    }

    public String getOutV() {
        return outV;
    }

    public void setOutV(String outV) {
        this.outV = outV;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
