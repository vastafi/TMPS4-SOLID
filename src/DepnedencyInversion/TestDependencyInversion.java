package DepnedencyInversion;
import org.junit.Test;
public class TestDependencyInversion {

    @Test
    public void testPress() throws Exception {
        Commutator switchablePC = new Computer();
        Switch computerPowerSwitch = new PowerSwitch(switchablePC);
        computerPowerSwitch.press();
        computerPowerSwitch.press();
        Commutator switchableTV = new Television();
        Switch tvPowerSwitch=new PowerSwitch(switchableTV);
        tvPowerSwitch.press();
        tvPowerSwitch.press();
      
    }
}

