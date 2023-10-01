import java.util.Scanner;

public class Produtos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantidade produtos: ");
        int n = sc.nextInt();
        
        String[] nomes = new String[n];
        double[] precos = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Produto #%d:%n", i+1);
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Preço: ");
            precos[i] = sc.nextDouble();
        }

        double somaPrecos = 0;
        for (int i = 0; i < n; i++) {
            somaPrecos += precos[i];
        }

        double mediaPrecos = somaPrecos / n;
        
        System.out.printf("Preço médio dos produtos: R$ %.2f%n", mediaPrecos);

        sc.close();
    }
}
