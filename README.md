# cmsc389T-winter23
Project 1- Pacman
Group Members: Sonia Sandler, Janaki Patel

Pacman screenshot:

Running the game:

Functions
Pacman:
1. get_valid_moves()
2. move() - 
3. is_ghost_in_range()
4. consume()

Ghost
1. get_valid_moves()
2. move() - This function uses get_valid_moves() and checks if it is empty. If it is it returns false and if it isn't it returns true. The test adds a ghost and pacman to the frame and asserts that the ghost has space to move.
3. is_pacman_in_range()
4. attack()

Map
1. move(String name, Location loc, Type type)
2. getLoc(Location loc)
3. attack(String name)
4. eatCookie(String Name)
