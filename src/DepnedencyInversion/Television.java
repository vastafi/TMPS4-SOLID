package DepnedencyInversion;

public class Television implements Commutator {
    @Override
    public void on() {
        System.out.println("TV: Television on.");
    }
    @Override
    public void off() {
        System.out.println("TV: Television off.");
    }
}