import java.util.Scanner;

public class TicTacToeAnalyzer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char[][] board = new char[3][3];
        int countX = 0;
        int countO = 0;
        boolean fullXRow = false;

        System.out.print("Enter 9 cells (X or O): ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = in.next().charAt(0);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");

                if (board[i][j] == 'X') {
                    countX++;
                } else {
                    countO++;
                }
            }
            System.out.println();
        }

        for (int i = 0; i < 3; i++) {
            if (board[i][0] == 'X' &&
                board[i][1] == 'X' &&
                board[i][2] == 'X') {
                fullXRow = true;
            }
        }

        System.out.println("X count: " + countX);
        System.out.println("O count: " + countO);

        if (fullXRow) {
            System.out.println("X has a full row");
        } else {
            System.out.println("No full X row");
        }

        in.close();
    }
}