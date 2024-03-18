import java.util.*;
public class Order {
    private Client client;
    private List<Product> products;
    private DeliveryStrategy deliveryMethod;
    public Order(Client client, List<Product> products, DeliveryStrategy delivery){
        this.client = client;
        this.products = products;
        deliveryMethod = delivery;
    }
}