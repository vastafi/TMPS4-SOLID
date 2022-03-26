package OpenClosed;

public class App {
    public double total(Calculate[] objects){
        double volum = 0;
        for (Calculate obj : objects) {
            volum += obj.length * obj.breadth* obj.height;
        }
        return volum;
    }
}
