public class SelfPickupDelivery implements DeliveryStrategy{
    @Override
    public void deliver() {
        System.out.println("Order is waiting to be picked up.");
    }
}
