package InterfaceSegregation;

public class BuildRectangle implements Builder{
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
        this.color=color;
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
    public String toString(){
        return "Build Rectangle: \n Price-" + price + " \n Color- "+ color + "\n Height- "+ height + " \n Width- "+ width;
    }
}
