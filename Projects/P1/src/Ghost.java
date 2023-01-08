import java.util.ArrayList;

public class Ghost {
  String myName;
  Location myLoc;
  Map myMap;

  public Ghost(String name, Location loc, Map map) {
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

  public boolean is_pacman_in_range() {
    Location tmp_loc = new Location(myLoc.x - 1, myLoc.y); // Location to the left
    if(myMap.getLoc(tmp_loc).contains(Map.Type.PACMAN)) {
      return true;
    }
    tmp_loc.x += 2; // Location to the right
    if(myMap.getLoc(tmp_loc).contains(Map.Type.PACMAN)) {
      return true;
    }

    tmp_loc.x = myLoc.x;
    tmp_loc.y -= 1; //Location above
    if(myMap.getLoc(tmp_loc).contains(Map.Type.PACMAN)) {
      return true;
    }

    tmp_loc.y += 2; //Location below
    if(myMap.getLoc(tmp_loc).contains(Map.Type.PACMAN)) {
      return true;
    }
    return false;
  }

  public boolean attack() {
    return false;
  }
}
