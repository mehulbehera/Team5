import java.io.*;
import java.util.*;
import java.awt.*;

import junit.framework.*;

public class TestPacManValidMoves extends TestCase {

  public void testPacManValidMoves() throws FileNotFoundException {
    //Creating A Map
    NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens Initialized

    //Creating Players
    Ghost ghost = frame.addGhost(new Location(2, 3), "name", Color.red); //Creates a red ghost named "name" at location x,y
    PacMan pacman = frame.addPacMan(new Location(4, 5)); //Creates PacMan at location x, y

    ArrayList<Location> lst = new ArrayList<Location>();
    lst.add(new Location(4, 6));
    lst.add(new Location(4, 4));
    lst.add(new Location(5, 5));
    lst.add(new Location(3, 6));
    
      
    assertFalse((pacman.get_valid_moves()).containsAll(lst) && lst.containsAll(pacman.get_valid_moves()));
  }

  public void testPacManInvalidMoves() throws FileNotFoundException {
    //Creating A Map
    NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens Initialized

    //Creating Players
    Ghost ghost = frame.addGhost(new Location(2, 3), "name", Color.red); //Creates a red ghost named "name" at location x,y
    PacMan pacman = frame.addPacMan(new Location(4, 5)); //Creates PacMan at location x, y

    frame.startGame();

    ArrayList<Location> lst = new ArrayList<Location>();
    lst.add(new Location(4, 6));
    lst.add(new Location(4, 4));
    lst.add(new Location(5, 5));
    

    assertFalse((pacman.get_valid_moves()).equals(lst));
  }
}
