import org.junit.*;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class TestExample {
    @Test
    public void testExample(){
        int i=1;
       Main main=new Main();
        for(int j=0;j<10;j++)
            main.count(j);
        assertNotNull("Test passed",main.count(i));
    }

}
