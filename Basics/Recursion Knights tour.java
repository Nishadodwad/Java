import java.util.Scanner;

public class Solution {

    // Function to print the knight's tour
    public static void print(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Function to perform the knight's tour using backtracking
    public static void knight(int a[][], int row, int col, int num) {
        int n = a.length;

        // Check if the current position is out of bounds or already visited
        if (row < 0 || col < 0 || row >= n || col >= n || a[row][col] != 0) {
            return;
        }

        // If the knight has completed the tour, print the board
        if (num == n * n) {
            a[row][col] = num;
            print(a);
            a[row][col] = 0;  // Backtrack
            return;
        }

        // Place the knight at the current position
        a[row][col] = num;

        // Recursive calls for all 8 possible moves of a knight
         knight(a, row - 2, col + 1, num + 1);  // Move 5
         knight(a, row - 1, col + 2, num + 1);  // Move 6
        knight(a, row + 1, col + 2, num + 1);  // Move 7
        knight(a, row + 2, col + 1, num + 1);  // Move 8
        knight(a, row + 2, col - 1, num + 1);  // Move 1
        knight(a, row + 1, col - 2, num + 1);  // Move 2
        knight(a, row - 1, col - 2, num + 1);  // Move 3
        knight(a, row - 2, col - 1, num + 1);  // Move 4
       
       
        

        // Backtrack: remove the knight from the current position
        a[row][col] = 0;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
  
        int n = scn.nextInt();  // Size of the chessboard (n x n)
        
        int row = scn.nextInt();  // Starting row of the knight
        
        int col = scn.nextInt();  // Starting column of the knight
        int a[][] = new int[n][n];  // Initialize the chessboard

        // Call the knight's tour function starting from the given position
        knight(a, row, col, 1);
        scn.close();  // Close the scanner
    }
}
