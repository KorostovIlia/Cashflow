public class FixedExpense {
  private double expanse;
  private String name;

    public FixedExpense(double outf, String name) {
        this.expanse = outf;
        this.name = name;
    }

    public double getExpanse() {
        return expanse;
    }

    public void setExpanse(double expanse) {
        this.expanse = expanse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
