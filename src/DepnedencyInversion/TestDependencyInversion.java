package DepnedencyInversion;
import org.junit.Test;
public class TestDependencyInversion {

    @Test
    public void testPress() throws Exception {
        Worker taskManagerDevelop = new Developper();
        Manager taskManager1 = new TaskManager(taskManagerDevelop);
        taskManager1.delegateTasks();
        taskManager1.delegateTasks();
        Worker taskManagerTester = new Tester();
        Manager taskManager2 = new TaskManager(taskManagerTester);
        taskManager2.delegateTasks();
        taskManager2.delegateTasks();
      
    }
}

