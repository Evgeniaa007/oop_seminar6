import java.io.FileWriter;
import java.io.IOException;

public class Saver {

    
    public void saveToJson(Order order){
        Client client = order.getClient();
        Product product = order.getProduct();
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)){
            writer.write("{\n");
            writer.write("\"firstName\":\""+ client.getFirstName()+ "\", \n");
            writer.write("\"lastName\":\""+ client.getLastName()+ "\", \n");
            writer.write("\"phoneNumber\":\""+ client.getPhoneNumber()+ "\", \n");
            writer.write("\"productName\":\""+ product.getProductName()+ "\", \n");
            writer.write("\"qnt\":\""+ product.getQnt() + "\", \n");
            writer.write("\"price\":\""+ product.getPrice() + "\", \n");
            writer.write("}\n");
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }


    }
    
}
