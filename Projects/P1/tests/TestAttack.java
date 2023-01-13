import java.awt.*;
import java.io.*;
import junit.framework.*;

public class TestAttack extends TestCase {
	
	public void testAttackPositive() throws FileNotFoundException {
		
		NoFrame frame1 = new NoFrame();
		Ghost ghost = frame1.addGhost(new Location(11, 10), "Ghost", Color.red); 
		PacMan pacman = frame1.addPacMan(new Location(11,9)); 
		assertTrue(ghost.attack());

	}
	
	public void testAttackNegative() throws FileNotFoundException {
		
		NoFrame frame1 = new NoFrame();
		Ghost ghost = frame1.addGhost(new Location(11, 10), "Ghost", Color.red); 
		PacMan pacman = frame1.addPacMan(new Location(15,15)); 
		assertFalse(ghost.attack());

	}

	  
}
