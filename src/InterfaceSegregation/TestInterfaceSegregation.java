package InterfaceSegregation;

import org.junit.Test;
public class TestInterfaceSegregation {

    @Test
    public void testBuildCub() throws Exception {
        BuildCub buildCub = App.buildCub();
        System.out.println(buildCub);
        System.out.println("---------------------------------");
    }

    @Test
    public void testBuildRectangle() throws Exception {
        BuildRectangle buildRectangle = App.buildRectangle();;
        System.out.println(buildRectangle);
        System.out.println("---------------------------------");
    }
    @Test
    public void testBuildTrapeze() throws Exception {
        BuildTrapeze buildTrapeze = App.buildTrapeze();
        System.out.println(buildTrapeze);
        System.out.println("---------------------------------");
    }
}

