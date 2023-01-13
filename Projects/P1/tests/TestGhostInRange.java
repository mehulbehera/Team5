import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestGhostInRange extends TestCase {

  public void testGhostInRange() throws FileNotFoundException {
    NoFrame frame1 = new NoFrame();
    Ghost ghost1 = frame1.addGhost(new Location(11,9), "Clyde", Color.red); //Creates a red ghost named "name" at location x,y
    PacMan pacman1 = frame1.addPacMan(new Location(11,10)); //Creates PacMan at location x, y
    assertTrue(ghost1.is_pacman_in_range());

    NoFrame frame2 = new NoFrame();
    Ghost ghost2 = frame2.addGhost(new Location(11,9), "Clyde", Color.red); //Creates a red ghost named "name" at location x,y
    PacMan pacman2 = frame2.addPacMan(new Location(11,8)); //Creates PacMan at location x, y
    assertTrue(ghost2.is_pacman_in_range());

    NoFrame frame3 = new NoFrame();
    Ghost ghost3 = frame3.addGhost(new Location(11,9), "Clyde", Color.red); //Creates a red ghost named "name" at location x,y
    PacMan pacman3 = frame3.addPacMan(new Location(10,9)); //Creates PacMan at location x, y
    assertTrue(ghost3.is_pacman_in_range());

    NoFrame frame4 = new NoFrame();
    Ghost ghost4 = frame4.addGhost(new Location(11,9), "Clyde", Color.red); //Creates a red ghost named "name" at location x,y
    PacMan pacman4 = frame4.addPacMan(new Location(12,9)); //Creates PacMan at location x, y
    assertTrue(ghost4.is_pacman_in_range());
  }
}
