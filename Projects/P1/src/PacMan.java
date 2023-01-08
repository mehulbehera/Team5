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
    return null;
  }

  public boolean move() {
    return false;
  }

  public boolean is_ghost_in_range() {
    Location tmp_loc = new Location(myLoc.x - 1, myLoc.y - 1);
    if(myMap.getLoc(tmp_loc).contains(Map.Type.GHOST)) {
      return true;
    }
    tmp_loc.x += 1;
    if(myMap.getLoc(tmp_loc).contains(Map.Type.GHOST)) {
      return true;
    }

    tmp_loc.x += 1;
    if(myMap.getLoc(tmp_loc).contains(Map.Type.GHOST)) {
      return true;
    }

    tmp_loc.x -= 2;
    tmp_loc.y += 1;
    if(myMap.getLoc(tmp_loc).contains(Map.Type.GHOST)) {
      return true;
    }

    tmp_loc.x += 2;
    if(myMap.getLoc(tmp_loc).contains(Map.Type.GHOST)) {
      return true;
    }

    tmp_loc.x -= 2;
    tmp_loc.y += 1;
    if(myMap.getLoc(tmp_loc).contains(Map.Type.GHOST)) {
      return true;
    }

    tmp_loc.x += 1;
    if(myMap.getLoc(tmp_loc).contains(Map.Type.GHOST)) {
      return true;
    }

    tmp_loc.x += 1;
    if(myMap.getLoc(tmp_loc).contains(Map.Type.GHOST)) {
      return true;
    }
    return false;
  }

  public JComponent consume() {
    return null;
  }
}
