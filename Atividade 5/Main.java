import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta;

        do {
            System.out.print("Informe a população inicial do país A: ");
            int populacaoA = obterEntradaInteiraPositiva(scanner);

            System.out.print("Informe a taxa de crescimento anual do país A (em %): ");
            double taxaCrescimentoA = obterEntradaDecimalPositiva(scanner) / 100;

            System.out.print("Informe a população inicial do país B: ");
            int populacaoB = obterEntradaInteiraPositiva(scanner);

            System.out.print("Informe a taxa de crescimento anual do país B (em %): ");
            double taxaCrescimentoB = obterEntradaDecimalPositiva(scanner) / 100;

            int anos = 0;
            while (populacaoA <= populacaoB) {
                populacaoA += populacaoA * taxaCrescimentoA;
                populacaoB += populacaoB * taxaCrescimentoB;
                anos++;
            }
            System.out.println("Número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B: " + anos);
            System.out.print("Deseja repetir a operação? (s/n): ");
            resposta = scanner.next();
        } while (resposta.equalsIgnoreCase("s"));

        scanner.close();
    }
    public static int obterEntradaInteiraPositiva(Scanner scanner) {
        int valor;
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro positivo.");
                scanner.next(); 
            }
            valor = scanner.nextInt();
            if (valor <= 0) {
                System.out.println("A entrada deve ser um número positivo.");
            }
        } while (valor <= 0);
        return valor;
    }
    public static double obterEntradaDecimalPositiva(Scanner scanner) {
        double valor;
        do {
            while (!scanner.hasNextDouble()) {
                System.out.println("Entrada inválida. Por favor, insira um número decimal positivo.");
                scanner.next();
            }
            valor = scanner.nextDouble();
            if (valor <= 0) {
                System.out.println("A entrada deve ser um número positivo.");
            }
        } while (valor <= 0);
        return valor;
    }
}
