import junit.framework.*;
import java.awt.Color;

import java.io.FileNotFoundException;

public class TestMapAttack extends TestCase {

  public void testMapAttack() throws FileNotFoundException {
    try {
      MainFrame frame1 = new MainFrame();
      assertTrue(frame1.getMap().attack("clyde"));
      aasertTrue(frame1.isGameOver());

    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}
