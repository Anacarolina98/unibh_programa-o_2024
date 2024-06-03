import java.util.Scanner;
public class Atividade_2 {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      boolean infoValidas = false;
      String nomeUsuario;
      String senha;

      do {

      System.out.print("Digite o nome do usuário:");
      nomeUsuario = scan.next();

      System.out.print("Digite a senha:");
      senha = scan.next();

      if (nomeUsuario.equalsIgnoreCase(senha)){
      System.out.println("Senha igual a usuário, digite novamente.");
      } else {
      infoValidas = true;
      System.out.println("Senha e usuários válidos.");
          }

    } while (!infoValidas);
  }
}
