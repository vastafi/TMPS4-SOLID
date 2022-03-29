package DepnedencyInversion;

public class Tester implements Worker {
    @Override
    public void present() {
        System.out.println("Test developer tasks");
    }
    @Override
    public void absent() {
        System.out.println("Untested application");
    }
}