import java.util.ArrayList;
import javax.swing.JComponent;

public class PacMan {
  String myName;
  Location myLoc;
  Map myMap;
  Location shift;

  public PacMan(String name, Location loc, Map map) {
    this.myLoc = loc;
    this.myName = name;
    this.myMap = map;
  }

  public ArrayList<Location> get_valid_moves() {
    ArrayList<Location> lst = new ArrayList<Location>();
    if (myLoc.y + 1 <= map.dim) {
      lst.add(new Location(myLoc.x, myLoc.y + 1));
    } else if (myLoc.y - 1 >= 0) {
      lst.add(new Location(myLoc.x, myLoc.y - 1));
    } else if (myLoc.x - 1 >= 0) {
      lst.add(new Location(myLoc.x - 1, myLoc.y));
    } else if (myLoc.x + 1 <= map.dim) {
      lst.add(new Location(myLoc.x + 1, myLoc.y));
    }

    return lst;
  }

  public boolean move() {
    if (get_valid_moves.isEmpty()){
	return false;
    }else{
	return true;
    }
  }

  public boolean is_ghost_in_range() {
    return false;
  }

  public JComponent consume() {
    return null;
  }
}
