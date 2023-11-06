import java.util.Scanner;

public class Lotto3Card {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char playAgain = 'y';
          Card card1 = new Card();
            Card card2 = new Card();
            Card card3 = new Card();

        do {
            System.out.println("Enter n: ");
            int n = scanner.nextInt();
            int countrandom = 0;

          

            for (int i = 0; i < n; i++) {
                card1.rand();
                card2.rand();
                card3.rand();

                int sum = card1.getNumber() + card2.getNumber() + card3.getNumber();
                System.out.print(card1.getNumber() + " " + card2.getNumber() + " " + card3.getNumber() + " ");

                if (sum >= 10 && sum <= 19) {
                    System.out.println("summary is between 10 And 19");
                   countrandom++;
                } else {
                    System.out.println("summary is Out of Range");
                }
            }

            double percentage = (double) countrandom / n * 100;
            System.out.printf("Percentage %.2f\n", percentage);

            System.out.print("Do you want to continue [y/n]: ");
            playAgain = scanner.next().charAt(0);
        } while (playAgain == 'y');

        System.out.println("Bye Bye !!");
    }
}