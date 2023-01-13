import java.io.*;

import javax.swing.JComponent;

import junit.framework.*;

public class TestConsume extends TestCase {

	private static final JComponent cookieComponent = null;

	public void testConsumePositive() throws FileNotFoundException {

		NoFrame frame1 = new NoFrame();
		PacMan pacman = frame1.addPacMan(new Location(11, 9)); // Creates PacMan at location x, y
	    Map.Type cookieType = Map.Type.COOKIE;
	    pacman.myMap.add("add cookie", new Location(11, 9), cookieComponent, cookieType);
		assertNotNull(pacman.consume());

	}
	
	public void testConsumerNegative() throws FileNotFoundException {

		NoFrame frame1 = new NoFrame();
		PacMan pacman = frame1.addPacMan(new Location(11, 9)); // Creates PacMan at location x, y
	    Map.Type ghostType = Map.Type.GHOST;
	    pacman.myMap.add("add ghost", new Location(11, 9), cookieComponent, ghostType);
		assertNotNull(pacman.consume());

	}

}
