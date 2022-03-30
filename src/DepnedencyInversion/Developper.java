package DepnedencyInversion;

public class Developper implements Worker {
    @Override
    public void present() {
        System.out.println("Developper Solve tasks");
    }
    @Override
    public void absent() {
        System.out.println("Developper Does not perform tasks");
    }
}
