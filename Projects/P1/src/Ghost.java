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
    Location tmp_loc = new Location(myLoc.x - 1, myLoc.y - 1);
    if(myMap.getLoc(tmp_loc).contains(Map.Type.PACMAN)) {
      return true;
    }
    tmp_loc.x += 1;
    if(myMap.getLoc(tmp_loc).contains(Map.Type.PACMAN)) {
      return true;
    }

    tmp_loc.x += 1;
    if(myMap.getLoc(tmp_loc).contains(Map.Type.PACMAN)) {
      return true;
    }

    tmp_loc.x -= 2;
    tmp_loc.y += 1;
    if(myMap.getLoc(tmp_loc).contains(Map.Type.PACMAN)) {
      return true;
    }

    tmp_loc.x += 2;
    if(myMap.getLoc(tmp_loc).contains(Map.Type.PACMAN)) {
      return true;
    }

    tmp_loc.x -= 2;
    tmp_loc.y += 1;
    if(myMap.getLoc(tmp_loc).contains(Map.Type.PACMAN)) {
      return true;
    }

    tmp_loc.x += 1;
    if(myMap.getLoc(tmp_loc).contains(Map.Type.PACMAN)) {
      return true;
    }

    tmp_loc.x += 1;
    if(myMap.getLoc(tmp_loc).contains(Map.Type.PACMAN)) {
      return true;
    }
    return false;
  }

  public boolean attack() {
    return false;
  }
}
