import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Estudante[] quartos = new Estudante[10];

        System.out.print("Digite número estudantes alugar quartos: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nAluguel #" + (i + 1) + ":");
            sc.nextLine();
            System.out.print("Nome estudante: ");
            String nome = sc.nextLine();
            System.out.print("Email estudante: ");
            String email = sc.nextLine();
            System.out.print("Número quarto escolhido (de 0 a 9): ");
            int numQuarto = sc.nextInt();

            quartos[numQuarto] = new Estudante(nome, email);
        }

        System.out.println("\nRelatório ocupação:");
        for (int i = 0; i < 10; i++) {
            if (quartos[i] != null) {
                System.out.println(i + ": " + quartos[i]);
            }
        }

        sc.close();
    }
}