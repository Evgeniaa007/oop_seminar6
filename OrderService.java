import java.util.Scanner;

public class OrderService {

    public String prompt(String message){
            Scanner scanner = new Scanner(System.in);
            System.out.println(message);
            return scanner.nextLine();
    }

    public Client clientInfo(Client client){
        String firstName = prompt("Введите имя клиента: ");
        String lastName = prompt("Введите фамилию клиента: ");
        String phoneNumber = prompt("Введите номер телефона: ");

        if(client != null){
            firstName = client.getFirstName();
            lastName = client.getLastName();
            phoneNumber = client.getPhoneNumber();
        }
        else{
            client = new Client(firstName, lastName, phoneNumber);
        }
        return client;
    
    }

    public Product productInfo(Product product){
        String productName = prompt("Наименование продукта: ");
        int qnt = Integer.parseInt(prompt("Кол-во: "));
        double price = Double.parseDouble(prompt("Цена: "));

        if(product != null){
            productName = product.getProductName();
            qnt = product.getQnt();
            price = product.getPrice();

        }
        else{
            product = new Product(productName, qnt, price);
        }
        return product;

    } 
    
}
