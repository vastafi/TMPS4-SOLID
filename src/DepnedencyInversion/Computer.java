package DepnedencyInversion;

public class Computer implements Commutator {
    @Override
    public void on() {
        System.out.println("PC: Computer on.");
    }
    @Override
    public void off() {
        System.out.println("PC: Computer off.");
    }
}
