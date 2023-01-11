import java.awt.*;
import java.io.*;
import junit.framework.*;

public class TestMapEatCookie extends TestCase {

  public void testMapEatCookie() throws FileNotFoundException {
	  MainFrame frame1 = new MainFrame();
		Ghost ghost = frame1.addGhost(new Location(15, 15), "Ghost", Color.red); 
		PacMan pacman = frame1.addPacMan(new Location(15,15)); 
		assertNotNull(pacman.consume());
  }
}
