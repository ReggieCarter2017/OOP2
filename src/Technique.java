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

    public <T extends Number, V extends String> Technique(T ID, V name, T price, V production, T gp) // Изменен обычный конструктор на обобщенный
    {
        super(ID, name, price, production);
        this.gp = gp.intValue();
    }

    public Technique()
    {
        this(0,"Null", 0, "Null", 0);
    }

}
