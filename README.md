# cmsc389T-winter23
Project 1- Pacman
Group Members: Sonia Sandler, Janaki Patel, Roshan Mathew

Pacman screenshot:

Running the game:
``` java

javac -cp "src/" src/*.java
java -cp "src/" StartMenu

```

Functions

Pacman:
1. get_valid_moves() - This function takes into account PacMan's current position and checks for Walls (internally or along the game board dimensions) to see if it can move in a direction. If there is no Wall, it adds the new Location into an ArrayList of Locations. A PacMan can move either up, down, left, or right.
2. move() - This function uses get_valid_moves() and checks if it is empty. If it is it returns false and if it isn't it returns true. The test adds a cookie and pacman to the frame and asserts that the pacman has space to move.
3. is_ghost_in_range()- this method checks to see if there is a ghost next to the current object (up, down, right, left)
4. consume()- this function checks for power cookie within range and calls eatCookie if valid

Ghost
1. get_valid_moves() - This function takes into account a Ghost's current position and checks for Walls (internally or along the game board dimensions) to see if it can move in a direction. If there is no Wall, it adds the new Location into an ArrayList of Locations. A Ghost can move either up, down, left, or right.
2. move() - This function uses get_valid_moves() and checks if it is empty. If it is it returns false and if it isn't it returns true. The test adds a ghost and pacman to the frame and asserts that the ghost has space to move.
3. is_pacman_in_range() - this method checks to see if there is a pacman next to the current object (up, down, right, left)
4. attack() - checks to see if pacman is within attack range. Returns true or false accordingly

Map
1. move(String name, Location loc, Type type) - This function takes a name, location, and Map.Type and if the Type is GHOST or PACMAN, since they are the only Types that can move, it attempts to move them and returns True. If the type is anything else, then it returns False.
2. getLoc(Location loc) - This function checks the loc HashSet to find the corresponding type. If it is null, returns the emptySet else it returns the type. The test adds a ghost and a pacman and then asserts that the type at those locations correspond to what was put there.
3. attack(String name) - this method is supposed to be called by the Ghost class when there is a successful attack. It updates gameOver to be true
4. eatCookie(String Name)- This function controls pacman eating a cookie. Updates the cookies, field, location and componenents accordingly. 
