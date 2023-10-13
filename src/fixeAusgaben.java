public class fixeAusgaben extends Ausgabentypen{
    private String faelligkeit;

    public fixeAusgaben(String faelligkeit, String name, double amount) {
        super(name, amount);
        this.faelligkeit = faelligkeit;
    }
}
