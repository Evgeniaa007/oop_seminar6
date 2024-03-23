public class Program {
    public static void main(String[] args) {
        System.out.println("Укажите параметры заказа");
        Order order = new Order();

        Saver saver = new Saver();
        saver.saveToJson(order);
    }
}
