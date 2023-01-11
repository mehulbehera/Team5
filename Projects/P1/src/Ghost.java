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
    ArrayList<Location> lst = new ArrayList<Location>();
    if (myLoc.x + 1 <= map.dim && myLoc.y + 1 <= map.dim) {
      lst.add(new Location(myLoc.x + 1, myLoc.y + 1));
    } else if (myLoc.x + 1 <= map.dim && myLoc.y - 1 >= 0) {
      lst.add(new Location(myLoc.x + 1, myLoc.y - 1));
    } else if (myLoc.x - 1 >= 0 && myLoc.y + 1 <= map.dim) {
      lst.add(new Location(myLoc.x - 1, myLoc.y + 1));
    } else if (myLoc.x - 1 >= 0 && myLoc.y - 1 >= 0) {
      lst.add(new Location(myLoc.x - 1, myLoc.y - 1));
    }

    return lst;
  }

  public boolean move() {
    return false;
  }

  public boolean is_pacman_in_range() {
    return false;
  }

  public boolean attack() {
    return false;
  }
}
