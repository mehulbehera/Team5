import java.io.*;
import junit.framework.*;

public class TestMapGetLoc extends TestCase {

    public void testMapGetLoc() throws FileNotFoundException {
      NoFrame frame = new NoFrame();
      Map myMap = frame.getMap();
      assertFalse(frame.getMap().getLoc(new Location (2,5)).contains(Map.Type.GHOST));
      assertFalse(frame.getMap().getLoc(new Location (3,2)).contains(Map.Type.COOKIE));
    }
}
