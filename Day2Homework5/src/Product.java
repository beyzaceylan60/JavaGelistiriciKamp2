public class Product {

    public Product(){
    }
    public Product(int id, String name,double price){
        this.id = id;
        this.name = name;
        this.price= price;
    }
    private int id;
    private String name;
    private double price;

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
