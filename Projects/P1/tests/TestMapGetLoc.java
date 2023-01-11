import java.io.*;
import junit.framework.*;

public class TestMapGetLoc extends TestCase {

    NoFrame frame = new NoFrame();
    assertTrue(frame.getMap().getLoc(new Location (3,3)).contains(Map.Type.EMPTY));
    assertFalse(frame.getMap().getLoc(new Location (3,3)).contains(Map.Type.COOKIE));
}
