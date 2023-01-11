import java.io.*;
import junit.framework.*;

public class TestPacManMove extends TestCase {
  public void testPacManMove() throws FileNotFoundException {
    MainFrame frame = new MainFrame();
    PacMan pacman = frame.addPacMan(new Location(3, 4));
    assertTrue(pacman.move() == true);
  }
}
