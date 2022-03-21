package SingleResponsability;

public class Delivery {

    private Order order;
    public Delivery(Order order) { this.order = order; }

    public void delivery()
    {
        System.out.println("Delivering the order");
        System.out.println(
                "Order with order id as "
                        + this.order.getOrderId()
                        + " being delivered to "
                        + this.order.getUsers().getSurName());
        System.out.println(
                "Order is to be delivered to: "
                        + this.order.getUsers().getAddress());
    }
}

