public class fixeAusgaben extends variableAusgaben {
    private String faelligkeit;

    public fixeAusgaben(String faelligkeit, String name, double amount) {
        super(name, amount);
        this.faelligkeit = faelligkeit;
    }
}
