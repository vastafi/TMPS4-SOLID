package InterfaceSegregation;

public class BuildCub implements Builder, Decorator {
    double price;
    String color;
    double height;
    double width;
    
    @Override
    public void setPrice(double price){
        this.price = price;
    }
    
    @Override
    public void setColor(String color){
        this.color = color;
    }
    
    @Override
    public void setHeight(double height){
        this.height = height;
    }
    
    @Override
    public void setWidth(double width){
        this.width = width;
    }
    @Override
    public void decorate(){
        System.out.println("Cub: Start decorating");
    }

    @Override
    public String toString(){
        return "Build Cub: \n Price-" + price + " \n Color- "+ color + "\n Height- "+ height + " \n Width- "+ width;
    }
}
