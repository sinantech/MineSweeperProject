import java.util.Scanner;

public class GamePlay {
    public static void main(String[] args) {
        try (Scanner data = new Scanner(System.in)) {

            while (true) {
                System.out.println("Welcome To Text Based Minesweeper Game");
                System.out.print("Enter The Game Row : ");
                int rows = data.nextInt();
                System.out.print("Enter The Game Column : ");
                int columns = data.nextInt();

                if (rows < 2 && columns < 2) {
                    System.out.println("Please Enter Bigger Matrix and Matrix Number Cannot Be Below Zero...!");
                    continue;
                }
                MineSweeper mine = new MineSweeper(rows, columns);
                mine.play();
                break;
            }
        }
    }
}
