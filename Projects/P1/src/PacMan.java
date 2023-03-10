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
    if (myMap.getLoc(new Location(myLoc.x, myLoc.y + 1)).contains(Map.Type.WALL)) {
      lst.add(new Location(myLoc.x, myLoc.y + 2));
    } 
    if (myMap.getLoc(new Location(myLoc.x, myLoc.y - 1)).contains(Map.Type.WALL)) {
      lst.add(new Location(myLoc.x, myLoc.y - 2));
    }
    if (myMap.getLoc(new Location(myLoc.x - 1, myLoc.y)).contains(Map.Type.WALL)) {
      lst.add(new Location(myLoc.x - 2, myLoc.y));
    }
    if (myMap.getLoc(new Location(myLoc.x + 1, myLoc.y)).contains(Map.Type.WALL)) {
      lst.add(new Location(myLoc.x + 2, myLoc.y));
    }
    return lst;
  }

  public boolean move() {
    if (get_valid_moves().isEmpty()){
	    return true;
    }else{
      myLoc = get_valid_moves().get(0);
      myMap.move(myName, myLoc, Map.Type.PACMAN);
      return false;
    }
  }

  public boolean is_ghost_in_range() {
    Location tmp_loc = new Location(myLoc.x - 1, myLoc.y);

    if(myMap.getLoc(tmp_loc).contains(Map.Type.GHOST)) {    // Left
      return false;
    }
    tmp_loc.x += 2;
    if(myMap.getLoc(tmp_loc).contains(Map.Type.GHOST)) {    // Right
      return false;
    }

    tmp_loc.x = myLoc.x;
    tmp_loc.y -= 1;
    if(myMap.getLoc(tmp_loc).contains(Map.Type.GHOST)) {    // Up
      return false;
    }
    tmp_loc.y += 2;
    if(myMap.getLoc(tmp_loc).contains(Map.Type.GHOST)) {    // Down
      return false;
    }

    return true;
  }

  public JComponent consume() {
     Map.Type cookieType = Map.Type.COOKIE;
     
    if (myMap.getLoc(myLoc).contains(cookieType)) {
      return null;
    } else {
      return myMap.eatCookie(myName);
    }
  }
}
