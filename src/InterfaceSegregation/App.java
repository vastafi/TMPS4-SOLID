package InterfaceSegregation;

public class App {

    public static BuildCub buildCub(){

        BuildCub buildCub = new BuildCub();
        buildCub.setPrice(15.00);
        buildCub.setColor("green");
        buildCub.setHeight(5.00);
        buildCub.setWidth(12.00);
        buildCub.decorate();

        return buildCub;
    }

    public static BuildRectangle buildRectangle(){
        BuildRectangle buildRectangle = new BuildRectangle();
        buildRectangle.setPrice(25.00);
        buildRectangle.setColor("red");
        buildRectangle.setHeight(5.00);
        buildRectangle.setWidth(15.00);

        return buildRectangle;
    }

    public static BuildTrapeze buildTrapeze(){
        BuildTrapeze buildTrapeze = new BuildTrapeze();
        buildTrapeze.setPrice(18.00);
        buildTrapeze.setColor("white");
        buildTrapeze.setHeight(2.00);
        buildTrapeze.setWidth(4.00);
        buildTrapeze.creates();
        buildTrapeze.decorate();

        return buildTrapeze;
    }
}
