import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int[] numbers = new int[5];
        System.out.println("Digite 5 números:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }
        int soma = 0;
        for (int i = 0; i < numbers.length; i++) {
            soma += numbers[i];
        }
        double media = (double) soma / numbers.length;
        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);
        scanner.close();
    }
}

