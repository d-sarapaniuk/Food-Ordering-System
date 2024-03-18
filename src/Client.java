public class Client {
    private String name;

    public Cart getCart() {
        return cart;
    }

    private Cart cart;
    public Client (String name){
        this.name = name;
    }
    public Order placeOrder(DeliveryStrategy delivery){
        Order order = new Order(this, cart.getProducts(), delivery);
        return order;
    }
}