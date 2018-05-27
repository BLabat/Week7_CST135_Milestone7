public class Product {

  
    double price;
    String name;
    String image;
    int quantity;
    String productID;


    Product() {
    }


    public Product(String name, Double price, Integer quantity, String productID){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    //sets all variables using constructors
    public Product(String name, double price, String image, int quantity, String productID) {
        this.name = name;
        this.price = price;
        this.image = image;
        this.quantity = quantity;
        this.productID = productID;
    }

    //setters and getters
    double getPrice() {
        return price;
    }

    protected void setPrice(double price) {
        this.price = price;
    }

    String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    protected void setImage(String image) {
        this.image = image;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void changeQuantity(int quantity) {
        this.quantity = this.quantity + quantity;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    //toString method
    public String toString() {
        return name + " " + price + " " + quantity + " " + productID;
    }

    public int compareTo(Product other) {
        if (getName().toUpperCase().compareTo(other.getName().toUpperCase()) > 0) {
            return 1;
        } else if (getName().toUpperCase().compareTo(other.getName().toUpperCase()) < 0) {
            return -1;
        } else if (getPrice() > other.getPrice()) {
            return 1;
        } else if (getPrice() < other.getPrice()) {
            return -1;
        } else return 0;
    }
}