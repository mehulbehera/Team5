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
    return false;
  }

  public JComponent consume() {
     Map.Type cookieType = Map.Type.COOKIE;
     
    if (myMap.getLoc(myLoc).contains(cookieType)) {
      myMap.eatCookie(myName);
      CookieComponent cookieComponent = new CookieComponent(myLoc.x, myLoc.y ,20);
      return cookieComponent;
    } else {
      return null;
    }
  }
}
