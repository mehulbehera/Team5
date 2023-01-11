import java.io.*;
import junit.framework.*;

public class TestPacManValidMoves extends TestCase {

	@Test
	public void testPacManValidMoves() throws FileNotFoundException {
		PacMan pac = new PacMan("Pac", new Location(9, 11), new Map(12));
		
		AssertTrue(pac.get_valid_moves);
  }
}
