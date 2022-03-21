package SingleResponsability;

public class TestSingleResponsability {
    public static void main(String[] args)
    {
       Users users1 = new Users();
        users1.setSurName("Ambros");
        users1.setLastName("Vasile");
        users1.setAddress("Falesti");
        Order order1 = new Order();
        order1.setItemName("ASUS PRIME A520M-E, Socket AM4");
        order1.setQuantity(2);
        order1.setUsers(users1);
        order1.prepareOrder();

        TotalOrder total = new TotalOrder(order1);
        total.calculate();

        Delivery deliveryOrder = new Delivery(order1);
        deliveryOrder.delivery();
    }
}
