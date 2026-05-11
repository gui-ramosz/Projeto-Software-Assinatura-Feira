import boundary.TelaCadastro;
import boundary.TelaCatalogo;
import persistence.GerenciadorArquivo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GerenciadorArquivo repo = new GerenciadorArquivo();
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("\n=== SISTEMA DE ASSINATURAS ===");
            System.out.println("1 - Novo Cadastro");
            System.out.println("2 - Já sou Assinante [Entrar]");
            System.out.println("3 - Sair");
            System.out.print("Escolha: ");
            opcao = scan.nextInt(); scan.nextLine();

            if (opcao == 1) {
                new TelaCadastro().iniciar();
            } else if (opcao == 2) {
                System.out.print("Celular: ");
                String cel = scan.nextLine();
                int id = repo.buscarIdPorCelular(cel);
                if (id != -1) {
                    double precoReal = repo.buscarPrecoPorIdAssinante(id);
                    int limF = (precoReal > 100) ? 10 : (precoReal > 70 ? 7 : 4);
                    int limL = (precoReal > 100) ? 8 : (precoReal > 70 ? 5 : 3);
                    int limV = (precoReal > 100) ? 6 : (precoReal > 70 ? 4 : 2);
                    
                    new TelaCatalogo().iniciar(limF, limL, limV, id, precoReal);
                } else {
                    System.out.println("Não encontrado.");
                }
            }
        }
        scan.close();
    }
}