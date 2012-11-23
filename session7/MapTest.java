import org.junit.*;

public class MapTest {

/** test whether put() adds a item in the map at the location specified
* sooo... create a new Map and and MapItem. call put() then print the contents 
* the map for output.
*/

	@Test
	public void putTest(){
	Map testmap = new MapImpl();
	MapItem testitem = new MapItem("name", 1);
	testmap.put(testitem);
	String output = System.out.println(testitem.itemValue);
	String expected = "name";
	assertEquals(output, expected);
	}
	
}	
