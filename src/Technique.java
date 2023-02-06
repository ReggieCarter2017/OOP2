public class Technique extends Product implements Interface {
    private Integer gp; // guarantee period = гарантийный период

    public Integer getGP()
    {
        return gp;
    }
    public void setBBD(Integer gp)
    {
        this.gp = gp;
    }
    @Override
    public void showInfo() {
        System.out.printf("Name: %s;\nPrice: %s;\nProduction: %s;\nGuarantee period: %s", getName(), getPrice(), getProduction(), getGP());
    }

    public Technique(String name, Integer price, String production, Integer gp)
    {
        super(name, price, production);
        this.gp = gp;
    }

    public Technique()
    {
        this("Null", 0, "Null", 0);
    }
}
