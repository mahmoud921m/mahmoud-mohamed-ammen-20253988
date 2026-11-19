import java.util.Scanner;

public class WordGridAnalyzer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char[][] grid = new char[3][4];
        int vowelCount = 0;

        System.out.println("Enter 3 words (4 letters each):");

        for (int i = 0; i < 3; i++) {
            String word = in.next();

            for (int j = 0; j < 4; j++) {
                grid[i][j] = word.charAt(j);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Columns: ");

        for (int j = 0; j < 4; j++) {
            String columnWord = "";

            for (int i = 0; i < 3; i++) {
                columnWord = columnWord.concat(
                    String.valueOf(grid[i][j])
                );

                if ("aeiou".indexOf(grid[i][j]) != -1) {
                    vowelCount++;
                }
            }

            System.out.print(columnWord + " ");
        }

        System.out.println();
        System.out.println("Vowels: " + vowelCount);

        in.close();
    }
}