public class CourierDelivery implements DeliveryStrategy{
    @Override
    public void deliver() {
        System.out.println("Order is being delivered by a courier.");
    }
}
