import java.util.Scanner;

public class TaskFive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите w >= 3: ");
        int w = scanner.nextInt();
        System.out.println("Введите h >= 3: ");
        int h = scanner.nextInt();

        for(int i = 1; i <= h; i++) {
            for(int j = 1; j <= w; j++) {
                if((i == 1 && j == 1) || (i == 1 && j == w) || (i == h && j == 1) || (i == h && j == w)) {
                    System.out.printf("*");
                }
                else {
                    if (i == 1 || i == h) {
                        System.out.printf("-");
                    } else if (j == 1 || j == w) {
                        System.out.printf("|");
                    } else {
                        System.out.printf(" ");
                    }
                }
            }
            System.out.printf("\n");
        }
    }
}