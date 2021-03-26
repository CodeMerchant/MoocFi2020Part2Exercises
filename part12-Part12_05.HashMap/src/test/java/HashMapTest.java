
import fi.helsinki.cs.tmc.edutestutils.Points;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;

@Points("12-05.1 12-05.2 12-05.3")
public class HashMapTest {

    private Hashmap<Integer, String> myHashmap = new Hashmap<>();

    @Before
    public void init() {

        myHashmap.add(1, "Volvo");
        myHashmap.add(2, "Volkswagen");
        myHashmap.add(3, "Mercedes");
        myHashmap.add(4, "Kia");

        assertNotNull(myHashmap);

    }

    @Test
    public void testGet() {
        assertEquals("Mercedes", myHashmap.get(3));
    }

    @Test
    public void testRemove() {
        assertEquals("Volvo", myHashmap.remove(1));
    }

    @Test
    public void testSize() {
        assertEquals(12, myHashmap.size());
    }
}
