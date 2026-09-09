// Iniciando Projeto Hero
import java.util.Scanner;

public class ClassificadorHeroi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {

            // Entrada de dados
            System.out.print("Digite o nome do Hero: ");
            String nome = scanner.nextLine();

            System.out.print("Digite a quantidade de XP: ");
            int xp = scanner.nextInt();
            scanner.nextLine();

            // Variável que receberá o nível e XP
            String nivel;

            // Estrutura de decisão
            if (xp <= 1000) {
                nivel = "Ferro";

            } else if (xp <= 2000) {
                nivel = "Bronze";

            } else if (xp <= 5000) {
                nivel = "Prata";

            } else if (xp <= 7000) {
                nivel = "Ouro";

            } else if (xp <= 8000) {
                nivel = "Platina";

            } else if (xp <= 9000) {
                nivel = "Ascendente";

            } else if (xp <= 10000) {
                nivel = "Imortal";

            } else {
                nivel = "Radiante";
            }

            // Saída Output
            System.out.println();
            System.out.println("O Hero de nome " + nome
                    + " está no nível de " + nivel);

            System.out.println();

            // Pergunta se deseja continuar
            System.out.print("Deseja classificar outro hero? (s/n): ");
            continuar = scanner.nextLine();

            System.out.println();
        }

        scanner.close();
    }
}