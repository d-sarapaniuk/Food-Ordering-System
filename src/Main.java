public class Main {
    public static void main(String[] args) {
        Client client = new Client("Vasya");
        Product product1 = new Product("Burger", 8);
        Product product2 = new Product("Salad", 5);
        client.getCart().addToCart(product1);
        client.placeOrder(new SelfPickupDelivery());
    }
}