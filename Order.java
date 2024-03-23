public class Order {

    private Client client;

    private Product product;


    public Client getClient() {
            return client;
        }
    public Product getProduct() {
        return product;
    }

    OrderService service =  new OrderService();

    public Order(Client client, Product product) {
        this.client = client;
        this.product = product;
    }

    public Order(){
        inputFromConsole();
    }

    public void inputFromConsole(){
        client = service.clientInfo(client);
        product = service.productInfo(product);
    }

    
}
