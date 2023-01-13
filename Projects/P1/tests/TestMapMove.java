import java.io.*;
import java.awt.*;

import junit.framework.*;

public class TestMapMove extends TestCase {

  public void testMapMove() throws FileNotFoundException {
    //Creating A Map
    NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens Initialized

    //Creating Players
    Ghost ghost = frame.addGhost(new Location(4, 5), "name", Color.red); //Creates a red ghost named "name" at location x,y
    PacMan pacman = frame.addPacMan(new Location(2, 3)); //Creates PacMan at location x, y

    frame.startGame();

    Map map = new Map(10);
    map.add("Ghostie", new Location(5, 5), new GhostComponent(5, 5, Color.red, 2), Map.Type.GHOST);

    assertTrue(map.move("Ghostie", new Location(5, 6), Map.Type.GHOST));
    //assertEquals(framelocations.get("Ghostie"), new Location(5, 6));
  }

  public void testMapNoMove() throws FileNotFoundException {
    //Creating A Map
    NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens Initialized

    //Creating Players
    Ghost ghost = frame.addGhost(new Location(4, 5), "name", Color.red); //Creates a red ghost named "name" at location x,y
    PacMan pacman = frame.addPacMan(new Location(2, 3)); //Creates PacMan at location x, y

    frame.startGame();

    Map map = new Map(10);
    map.add("Cookie", new Location(5, 5), new CookieComponent(5, 5, 2), Map.Type.COOKIE);

    assertFalse(map.move("Cookie", new Location(5, 6), Map.Type.COOKIE));
    //assertEquals(locations.get("Cookie"), new Location(5, 5));
  }
}
