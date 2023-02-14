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
        System.out.printf("ID: %s;\nName: %s;\nPrice: %s;\nProduction: %s;\nBest before date: %s", getID(), getName(), getPrice(), getProduction(), getBBD());
    }

    public <T extends Number, V extends String> Food(T ID, V name, T price, V production, T bbd) // Изменен обычный конструктор на обобщенный
    {
        super(ID, name, price, production);
        this.bbd = bbd.intValue();
    }

    public Food()
    {
        this(0, "Null", 0, "Null", 0);
    }
}
