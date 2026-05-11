package boundary;

import control.CadastroController;
import java.util.Scanner;

public class TelaCadastro {
    private CadastroController controller = new CadastroController();
    private Scanner scan = new Scanner(System.in);

    public void iniciar() {
        System.out.print("Nome: "); String nome = scan.nextLine();
        System.out.print("Celular: "); String celular = scan.nextLine();
        controller.enviarCodigoSMS(celular);
        System.out.print("SMS (1234): "); String codigo = scan.nextLine();

        if (controller.validarCodigo(codigo)) {
            int idAssinante = controller.criarAssinante(nome, celular);
            int plano = 0; double valor = 0; int f=0, l=0, v=0;
            boolean ok = false;
            while (!ok) {
                System.out.println("===== PLANOS =====");
                System.out.println("1 - Básico(49,90): 4 frutas, 3 legumes, 2 verduras");
                System.out.println("2 - Plus(79,90): 7 frutas, 5 legumes, 4 verduras");
                System.out.println("3 - Premium(109,90): 10 frutas, 8 legumes, 6 verduras");
                System.out.print("Escolha (1, 2 ou 3): ");
                plano = scan.nextInt();
                if (plano==1) { valor=49.9; f=4; l=3; v=2; ok=true; }
                else if (plano==2) { valor=79.9; f=7; l=5; v=4; ok=true; }
                else if (plano==3) { valor=109.9; f=10; l=8; v=6; ok=true; }
                else System.out.println("Inválido! Escolha o plano digitando 1, 2 ou 3.");
            }
            controller.criarAssinatura(idAssinante, plano);
            new TelaCatalogo().iniciar(f, l, v, idAssinante, valor);
        }
    }
}