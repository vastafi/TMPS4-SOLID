package SingleResponsability;

public class TestSingleResponsability {
    public static void main(String[] args)
    {
       Users usersTest = new Users();
        usersTest.setSurName("Ambros");
        usersTest.setLastName("Vasile");
        usersTest.setAddress("Falesti");
        Order orderTest = new Order();
        orderTest.setItemName("ASUS PRIME A520M-E, Socket AM4");
        orderTest.setQuantity(2);
        orderTest.setUsers(usersTest);
        orderTest.prepareOrder();

        TotalOrder total = new TotalOrder(orderTest);
        total.calculate();

        Delivery deliveryOrder = new Delivery(orderTest);
        deliveryOrder.delivery();
    }
}
