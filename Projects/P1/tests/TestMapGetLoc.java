import java.io.*;
import junit.framework.*;

public class TestMapGetLoc extends TestCase {

    NoFrame frame = new NoFrame();
    frame.addGhost(new Location(3,3), "bob", Color.red);
    frame.addPacMan(new Location(4,5));
    assertTrue(frame.getLoc(new Location (3,3)).contains(Map.Type.GHOST));
    assertFalse(frame.getLoc(new Location (3,3)).contains(Map.Type.COOKIE));
}
