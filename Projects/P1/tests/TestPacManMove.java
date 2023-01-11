import java.io.*;
import junit.framework.*;

public class TestPacManMove extends TestCase {
  public void testPacManMove() throws FileNotFoundException {
    Mainframe frame = new MainFrame(10);
    Cookie cookie = frame.addCookie(new Location(3, 3), "cookie");
    PacMan pacman = frame.addPacMan(new Location(3, 4));
    assertTrue(pacman.move(3,3) == false);
    assertTrue(p.move(4,4) == true);
  }
}
