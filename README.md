

# Tic Tac Toe Game (Java)

This project implements a console-based **Tic Tac Toe game** using Object-Oriented Design (OOD) principles. The game allows two players to take turns on a 3x3 board, tracks the current player, validates moves, and checks for win or draw conditions.

**Design Reference:**  
This implementation is modeled after the clean OOD architecture outlined in the [Tic Tac Toe design from ycwkatie's OOD repo](https://github.com/ycwkatie/OOD-Object-Oriented-Design/blob/main/ood/tic_tac_toe.md).

---

## Key Components

| Class       | Description                                                                 |
|-------------|-----------------------------------------------------------------------------|
| `TicTacToe` | Main controller class that manages turns, input, and the game loop         |
| `Board`     | Represents the 3x3 board, validates moves, and checks for win/draw states  |

---

## Game Flow

The game supports a simple two-player flow:

1. The board is initialized with 3x3 empty cells (`'-'`).
2. Player X always starts.
3. Players take turns entering their move (row and column index).
4. The board is updated if the cell is valid and empty.
5. After every move:
   - The system checks if the current player has won.
   - If not, it checks if the board is full (draw).
   - If neither, it switches to the other player.

---

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/tic-tac-toe-java.git
   ```

2. Compile and run the project:
   ```bash
   cd tic-tac-toe-java
   javac TicTacToe.java
   java TicTacToe
   ```

---

## Project Structure

| File             | Description                          |
|------------------|--------------------------------------|
| `Board.java`     | Manages board state and logic        |
| `TicTacToe.java` | Manages players and the game loop    |

