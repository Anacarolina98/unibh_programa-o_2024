import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String nome;
        do {
            System.out.print("Digite seu nome (mais de 3 caracteres): ");
            nome = scanner.nextLine();
        } while (nome.length() <= 3);
        
        int idade;
        do {
            System.out.print("Agora sua idade (entre 0 e 150): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Esta errado. Deve ser um número inteiro.");
                scanner.next();
            }
            idade = scanner.nextInt();
            scanner.nextLine();
        } while (idade < 0 || idade > 150);
        
        double salario;
        do {
            System.out.print("Digite o salário (maior que zero): ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Salário inválido. Deve ser um número.");
                scanner.next(); 
            }
            salario = scanner.nextDouble();
            scanner.nextLine();
        } while (salario <= 0);
        
        char sexo;
        do {
            System.out.print("Qual o seu sexo ('f' ou 'm'): ");
            sexo = scanner.next().charAt(0);
        } while (sexo != 'f' && sexo != 'm');
        
        char estadoCivil;
        do {
            System.out.print("Digite o estado civil ('s', 'c', 'v', 'd'): ");
            estadoCivil = scanner.next().charAt(0);
        } while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd');
        
        System.out.println("Informações válidas:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);

        scanner.close();
    }
}
