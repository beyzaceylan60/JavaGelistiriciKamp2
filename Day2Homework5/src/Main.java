public class Main {
    public static void main(String[] args) {
        //Without Constructor
        Product product = new Product();
        ProductManager productManager = new ProductManager();
        product.setName("Laptop");
        product.setId(999999);
        product.setPrice(7999.99);

        //With Constructor
        Product product1 = new Product(9999,"Mouse", 399.99);

        productManager.Add(product);
    }
}