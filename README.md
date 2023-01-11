# cmsc389T-winter23
Project 1- Pacman
Group Members: Sonia Sandler, Janaki Patel

Pacman screenshot:

Running the game:
``` java
javac -cp "tests/junit-4.10.jar:src/:tests/" src/*.java tests/*.java
java -cp "tests/junit-4.10.jar:src/:tests/" org.junit.runner.JUnitCore your_test_here
ex: java -cp "tests/junit-4.10.jar:src/:tests/" org.junit.runner.JUnitCore TestGhostMove
```

Functions

Pacman:
1. get_valid_moves()
2. move() - This function uses get_valid_moves() and checks if it is empty. If it is it returns false and if it isn't it returns true. The test adds a cookie and pacman to the frame and asserts that the pacman has space to move.
3. is_ghost_in_range()- this method checks to see if there is a ghost next to the current object (up, down, right, left)
4. consume()

Ghost
1. get_valid_moves()
2. move() - This function uses get_valid_moves() and checks if it is empty. If it is it returns false and if it isn't it returns true. The test adds a ghost and pacman to the frame and asserts that the ghost has space to move.
3. is_pacman_in_range() - this method checks to see if there is a pacman next to the current object (up, down, right, left)
4. attack()

Map
1. move(String name, Location loc, Type type)
2. getLoc(Location loc) - This function checks the loc HashSet to find the corresponding type. If it is null, returns the emptySet else it returns the type. The test adds a ghost and a pacman and then asserts that the type at those locations correspond to what was put there.
3. attack(String name) - this method is supposed to be called by the Ghost class when there is a successful attack. It updates gameOver to be true

4. eatCookie(String Name)
