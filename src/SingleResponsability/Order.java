package SingleResponsability;

import java.util.Random;

public class Order {
    private Users users;
    private String orderId;
    private String itemName;
    private int quantity;
    private int total;

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users)
    {
        this.users = users;
    }

    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        Random random = new Random();
        this.orderId = orderId + "-" + random.nextInt(500);
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName)
    {
        this.itemName = itemName;
        setOrderId(itemName);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total)
    {
        this.total = total;
    }

    public void prepareOrder()
    {
        System.out.println("Preparing order for user: "
                + this.getUsers().getLastName() +' '
                + this.getUsers().getSurName()
                + "who ordered"
                + this.getItemName());
    }
}
