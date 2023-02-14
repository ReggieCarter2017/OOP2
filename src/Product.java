public class Product { // Сделал обычный класс обобщенным
    protected Integer ID;
    protected Double price;
    protected String name;
    protected String production;

    public Integer getID()
    {
        return ID;
    }
    void setID(Integer ID)
    {
        this.ID = ID;
    }

    public Double getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
    public String getProduction() {
        return production;
    }
    public void setPrice(Double a) {
        this.price = a;
    }
    public void setName(String a) {
        this.name = a;
    }
    public void setProduction(String a) {
        this.production = a;
    }

    public <T extends Number, V extends  String> Product(T ID, V name, T price, V production) // Изменен обычный конструктор на обобщенный
    {
        this.ID = ID.intValue();
        this.price = price.doubleValue();
        this.name = name;
        this.production = production;
    }

    public Product()
    {
        this(0, "Name", 0, "None");
    }


}
