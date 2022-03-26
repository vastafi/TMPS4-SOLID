package SingleResponsability;

public class Delivery {

    private Order order;
    public Delivery(Order order) { this.order = order; }

    public void delivery()
    {
        System.out.println("Delivering");
        System.out.println("Order as " + this.order.getOrderId()+ " delivered to " + this.order.getUsers().getSurName());
        System.out.println("Order delivered to: " + this.order.getUsers().getAddress());
    }
}

