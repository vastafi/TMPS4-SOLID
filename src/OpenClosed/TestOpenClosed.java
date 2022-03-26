package OpenClosed;

public class TestOpenClosed {
    public static void main(String args[])
    {
        Calculate obj1 = new Calculate();
        obj1.length = 4;
        obj1.breadth = 5;
        obj1.height = 10;

        Calculate obj2 = new Calculate();
        obj2.length = 2;
        obj2.breadth = 4;
        obj2.height = 6;

        Calculate[] calculate = new Calculate[2];
        calculate[0] = obj1;
        calculate[1] = obj2;

        App app = new App();
        double vol = app.total(calculate);
        System.out.println("The volume total is " + vol);
    }
}
