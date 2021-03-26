
import fi.helsinki.cs.tmc.edutestutils.Points;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

@Points("12-02")
public class PipeTest {

    @Test
    public void tests() {

        Pipe<Integer> pipe = new Pipe<>();
        
        pipe.putIntoPipe(5);
        pipe.putIntoPipe(3);
        pipe.putIntoPipe(2);
        
        assertNotNull(pipe);
        
        assertEquals(true, pipe.isInPipe());
        
    }
}
