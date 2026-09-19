import java.util.Scanner;

public class ex2 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Entrez la hauteur : ");
        int n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
