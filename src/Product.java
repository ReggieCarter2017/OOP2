public class Product {
    protected Integer price;
    protected String name;
    protected String production;

    public Integer getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
    public String getProduction() {
        return production;
    }
    public void setPrice(Integer a) {
        this.price = a;
    }
    public void setName(String a) {
        this.name = a;
    }
    public void setProduction(String a) {
        this.production = a;
    }

    public Product(String name, Integer price, String production)
    {
        this.name = name;
        this.production = production;
        this.price = price;
    }
    public Product(){
        this("Null", 0, "Null");
    }


}
