import java.io.*;
import junit.framework.*;

public class TestMapGetLoc extends TestCase {

    public void testMapGetLoc() throws FileNotFoundException {
      MainFrame frame = new MainFrame();
      assertTrue(frame.getMap().getLoc(new Location (3,3)).contains(Map.Type.EMPTY));
      assertFalse(frame.getMap().getLoc(new Location (3,3)).contains(Map.Type.COOKIE));
    }
}
