import java.io.*;
import junit.framework.*;

public class TestPacManMove extends TestCase {

<<<<<<< HEAD
  Mainframe frame = new MainFrame(10);
  Cookie cookie = frame.addCookie(new Location(3, 3), "cookie");
  PacMan pacman = frame.addPacMan(new Location(3, 4));
  assertTrue(pacman.move(3,3) == false);
  assertTrue(p.move(4,4) == true);

=======
  public void testPacManMove() throws FileNotFoundException {
    return null;
  }
>>>>>>> a0f239c90e1a85d30037d3de6b41b3d8a21aa8e5
}
