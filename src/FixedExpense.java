public class FixedExpense {
  private double outf;
  private String name;

    public FixedExpense(double outf, String name) {
        this.outf = outf;
        this.name = name;
    }

    public double getOutf() {
        return outf;
    }

    public void setOutf(double outf) {
        this.outf = outf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}