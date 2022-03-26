package DepnedencyInversion;

public class PowerSwitch implements Switch {
    public Commutator client;
    public boolean on;

    public PowerSwitch(Commutator client) {
        this.client = client;
        this.on = false;
    }
    public boolean isOn() {
        return this.on;
    }
    public void press(){
        boolean checkOn = isOn();
        if (checkOn) {
            client.off();
            this.on = false;
        } else {
            client.on();
            this.on = true;
        }
    }
}
