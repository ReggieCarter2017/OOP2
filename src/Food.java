public class Food extends Product implements Interface {
    private Integer bbd; // best before date = срок годности пищи

    public Integer getBBD()
    {
        return bbd;
    }
    public void setBBD(Integer bbd)
    {
        this.bbd = bbd;
    }
    @Override
    public void showInfo() {
        System.out.printf("Name: %s;\nPrice: %s;\nProduction: %s;\nBest before date: %s", getName(), getPrice(), getProduction(), getBBD());
    }

    public Food(String name, Integer price, String production, Integer bbd)
    {
        super(name, price, production);
        this.bbd = bbd;
    }

    public Food()
    {
        this("Null", 0, "Null", 0);
    }
}
