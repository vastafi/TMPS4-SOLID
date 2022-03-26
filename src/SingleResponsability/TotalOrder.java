package SingleResponsability;

import java.util.Random;

public class TotalOrder {
    private Order order;
    public TotalOrder (Order order){
        this.order = order;
    }
    public void calculate(){
        Random rand = new Random();
        int total = rand.nextInt(200) * this.order.getQuantity();

        this.order.setTotal(total);
        System.out.println("Order with order id  " + this.order.getOrderId()+ " has a total bill amount of " + this.order.getTotal());
    }
}

