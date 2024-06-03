import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Digite 5 números:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }
        int maiorNumero = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maiorNumero) {
                maiorNumero = numbers[i];
            }
        }
        System.out.println("O maior número é: " + maiorNumero);
        scanner.close();
    }
}
