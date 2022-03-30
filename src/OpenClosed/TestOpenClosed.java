package OpenClosed;

public class TestOpenClosed {
    public static void main(String args[])
    {
        Object obj1 = new Object();
        obj1.length = 4;
        obj1.breadth = 5;
        obj1.height = 10;

        Object obj2 = new Object();
        obj2.length = 2;
        obj2.breadth = 4;
        obj2.height = 6;

        Object[] calculate = new Object[2];
        calculate[0] = obj1;
        calculate[1] = obj2;

        App app = new App();
        double vol = app.total(calculate);
        System.out.println("The volume total is " + vol);
    }
}
