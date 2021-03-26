
import fi.helsinki.cs.tmc.edutestutils.Points;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

@Points("12-04.1 12-04.2")
public class ListTest {

    private List<String> list = new List<>();

    @Before
    public void init() {
        list.add("Xbox360");
        list.add("XboxOne");
        list.add("XboxSeriesX");
        list.add("PS3");
        list.add("PS4");
        list.add("PS5");
    }

    @Test
    public void testSizeOfList(){
        assertEquals(6, list.size());
    }
    
    @Test
    public void testAddMethod(){
        list.add("MasterRace:PC");
        
        assertEquals(7, list.size());
    }
    
    @Test
    public void testRemove(){
        list.remove("MasterRace:PC");
        assertEquals(6, list.size());
    }
    
    @Test
    public void testContains() {

        assertEquals(true, list.contains("PS3"));
        assertEquals(false, list.contains("Nintendo"));
    }
    
    @Test
    public void testIndexOfValue(){
        assertEquals(1, list.indexOfValue("XboxOne"));
    }
    
    

}
