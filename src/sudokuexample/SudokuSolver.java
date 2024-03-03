package sudokuexample;

public class SudokuSolver {
        public void solveSudoku(int[][] board) {
            if (solve(board, 0, 0))
                printBoard(board);
            else
                System.out.println("No solution exists");
        }

        private boolean solve(int[][] board, int row, int col) {
            if (row == 9 - 1 && col == 9)
                return true;

            boolean solved = false;
            if (col == 9) {
                row++;
                col = 0;
            }

            if (board[row][col] == 0) {
                for (int num = 1; num <= 9; num++) {
                    if (isSafe(board, row, col, num)) {
                        board[row][col] = num;
                        solved = solve(board, row, col + 1) || solved;
                    }

                    if (solved)
                        return true;
                    board[row][col] = 0; // replace it
                }
            } else {
                solved = solve(board, row, col + 1);
            }

            return solved;
        }

        private boolean isSafe(int[][] board, int row, int col, int num) {
            for (int x = 0; x <= 8; x++) {
                if (board[row][x] == num)
                    return false;
                if (board[x][col] == num)
                    return false;
            }

            int startRow = row - row % 3, startCol = col - col % 3;

            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++)
                    if (board[i + startRow][j + startCol] == num)
                        return false;

            return true;
        }

        private void printBoard(int[][] board) {
            for (int[] row : board) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
    }

