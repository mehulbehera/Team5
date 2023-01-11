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
    if (get_valid_moves().isEmpty()){
	return false;
    }else{
        myLoc = get_valid_moves().get(0);
        myMap.move(myName, myLoc, Map.TYPE.GHOST);
        return true;
    }
  }

  public boolean is_pacman_in_range() {
    Location tmp_loc = new Location(myLoc.x - 1, myLoc.y);
    if(myMap.getLoc(tmp_loc).contains(Map.Type.PACMAN)) {
      return true;
    }
    tmp_loc.x += 2;
    if(myMap.getLoc(tmp_loc).contains(Map.Type.PACMAN)) {
      return true;
    }

    tmp_loc.x = myLoc.x;
    tmp_loc.y -= 1;
    if(myMap.getLoc(tmp_loc).contains(Map.Type.PACMAN)) {
      return true;
    }
    tmp_loc.y += 2;
    if(myMap.getLoc(tmp_loc).contains(Map.Type.PACMAN)) {
      return true;
    }

    return false;
  }

  public boolean attack() {
    return false;
  }
}
