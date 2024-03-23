public class Product {

    private String productName;

    private int qnt;

    private double price;

    public Product(String productName, int qnt, double price) {
        this.productName = productName;
        this.qnt = qnt;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }




    
}
