package InterfaceSegregation;

public class BuildTrapeze implements Builder, Creator, Decorator{
    double price;
    String color;
    double height;
    double width;

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void creates(){
        System.out.println("Trapeze: Start creates.");
    }
    @Override
    public void decorate(){
        System.out.println("Trapeze: Start decorate.");
    }
    @Override
    public String toString(){
        return "Trapeze: Creates and decorate trapeze - \n Price-" + price + " \n Color- "+ color + "\n Height- "+ height + " \n Width- "+ width;
    }
}
