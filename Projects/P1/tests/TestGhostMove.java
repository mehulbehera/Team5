import java.io.*;
import junit.framework.*;
import java.awt.*;

public class TestGhostMove extends TestCase {

  public void testGhostMove() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    Ghost ghost = frame.addGhost(new Location(3, 3), "bob", Color.red);
    PacMan pacman = frame.addPacMan(new Location(3, 4));
    assertTrue(ghost.move() == true);
  }
}
