import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        int tentativas = 5;

        //System.out.println(numeroAleatorio);

        System.out.println("""
                Bem-vindo(a) ao jogo de adivinhação!
                
                Tente adivinhar o número aleatório entre 0 a 100.
                """);

        for (int i = 1; i <= tentativas; i++) {
            System.out.print("Tentativa " + i + ": " );
            int numeroUsuario = scanner.nextInt();

            if (numeroUsuario == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou o número em " + i + " tentativas.");
                break;
            } else if (numeroUsuario < numeroAleatorio) {
                System.out.println("O número aleatório é maior.");
            } else {
                System.out.println("O número aleatório é menor.");
            }

            if (i == tentativas) {
                System.out.println("Suas tentativas acabaram. O número aleatório era: " + numeroAleatorio);
            }

        }
    }
}