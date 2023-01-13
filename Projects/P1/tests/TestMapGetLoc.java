import java.io.*;
import junit.framework.*;

public class TestMapGetLoc extends TestCase {

    public void testMapGetLoc() throws FileNotFoundException {
      NoFrame frame = new NoFrame();
      assertFalse(frame.getMap().getLoc(new Location (3,3)).contains(Map.Type.GHOST));
      assertFalse(frame.getMap().getLoc(new Location (3,3)).contains(Map.Type.COOKIE));
    }
}
