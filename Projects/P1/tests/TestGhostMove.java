import java.io.*;
import junit.framework.*;

public class TestGhostMove extends TestCase {

  Mainframe frame = new MainFrame(10);
  Ghost ghost = frame.addGhost(new Location(3, 3), "bob", Color.red);
  PacMan pacman = frame.addPacMan(new Location(3, 4));
  assertTrue(ghost.move(3,4) == false);
  assertTrue(p.move(4,3) == true); 
}
