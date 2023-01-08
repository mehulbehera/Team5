import junit.framework.*;
import java.awt.Color;

import java.io.FileNotFoundException;

public class TestMapAttack extends TestCase {

  public void testMapAttack() throws FileNotFoundException {
    try {
      MainFrame frame1 = new MainFrame();
      Ghost ghost1 = frame1.addGhost(new Location(10, 9), "clyde", Color.red); //Creates a red ghost named "name" at location x,y
      PacMan pacman1 = frame1.addPacMan(new Location(11, 9)); //Creates PacMan at location x, y
      assertTrue(frame1.getMap().attack("clyde"));

      MainFrame frame2 = new MainFrame();
      Ghost ghost2 = frame2.addGhost(new Location(10, 9), "clyde", Color.red); //Creates a red ghost named "name" at location x,y
      PacMan pacman2 = frame2.addPacMan(new Location(7, 7)); //Creates PacMan at location x, y
      assertTrue(!(frame2.getMap().attack("clyde")));

      MainFrame frame3 = new MainFrame();
      Ghost ghost3 = frame3.addGhost(new Location(10, 9), "clyde", Color.red); //Creates a red ghost named "name" at location x,y
      assertTrue(!(frame3.getMap().attack("clyde")));

    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}
