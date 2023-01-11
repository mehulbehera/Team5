import java.io.*;
import junit.framework.*;

public class TestGhostMove extends TestCase {

  MainFrame frame = new MainFrame(10);
  Ghost ghost = frame.addGhost(new Location(3, 3), "bob", Color.red);
  PacMan pacman = frame.addPacMan(new Location(3, 4));
  assertTrue(ghost.move() == true);
}
