import java.awt.*;
import java.io.*;
import junit.framework.*;

public class TestPacManInRange extends TestCase {

  public void testPacManInRange() throws FileNotFoundException {
    MainFrame frame1 = new MainFrame();
    Ghost ghost1 = frame1.addGhost(new Location(11,10), "Clyde", Color.red); //Creates a red ghost named "name" at location x,y
    PacMan pacman1 = frame1.addPacMan(new Location(11,9)); //Creates PacMan at location x, y
    assertTrue(pacman1.is_ghost_in_range());

    MainFrame frame2 = new MainFrame();
    Ghost ghost2 = frame2.addGhost(new Location(11,8), "Clyde", Color.red); //Creates a red ghost named "name" at location x,y
    PacMan pacman2 = frame2.addPacMan(new Location(11,9)); //Creates PacMan at location x, y
    assertTrue(pacman2.is_ghost_in_range());

    MainFrame frame3 = new MainFrame();
    Ghost ghost3 = frame3.addGhost(new Location(10,9), "Clyde", Color.red); //Creates a red ghost named "name" at location x,y
    PacMan pacman3 = frame3.addPacMan(new Location(11,9)); //Creates PacMan at location x, y
    assertTrue(pacman3.is_ghost_in_range());

    MainFrame frame4 = new MainFrame();
    Ghost ghost4 = frame4.addGhost(new Location(12,9), "Clyde", Color.red); //Creates a red ghost named "name" at location x,y
    PacMan pacman4 = frame4.addPacMan(new Location(11,9)); //Creates PacMan at location x, y
    assertTrue(pacman4.is_ghost_in_range());
  }
}
