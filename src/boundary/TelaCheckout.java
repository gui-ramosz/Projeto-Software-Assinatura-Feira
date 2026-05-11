package boundary;
import control.CheckoutController;
import java.util.Scanner;

public class TelaCheckout {
    private CheckoutController controller;
    private Scanner scan = new Scanner(System.in);
    private int idAssinante;
    private double valor;

    public TelaCheckout(CheckoutController ctrl, int id, double val) {
        this.controller = ctrl;
        this.idAssinante = id;
        this.valor = val;
    }

    public void iniciar() {
        System.out.println("\n--- CHECKOUT (Total: R$" + valor + ") ---");
        System.out.println("--> Endereço: ");
        System.out.print("CEP: "); String cep = scan.nextLine();
        System.out.print("Rua: "); String rua = scan.nextLine();
        System.out.print("Num: "); String num = scan.nextLine();
        System.out.print("Bairro: "); String bairro = scan.nextLine();
        controller.salvarEndereco(cep, rua, num, bairro);

        System.out.println("--> Preferência de Entrega: ");
        System.out.print("Dia da semana (ex: seg, ter, qua): ");
        String dia = scan.nextLine();
        System.out.print("Horário Preferencial (ex: manhã, tarde, 14h): ");
        String hora = scan.nextLine();
        controller.salvarPreferencia(dia, hora);


        System.out.println("--> Pagamento: ");
        System.out.println("Por favor, forneça os dados do cartão: ");
        System.out.print("Titular: "); String tit = scan.nextLine();
        System.out.print("Número do Cartão: "); String fc = scan.nextLine();
        System.out.print("Ano de vencimento: "); int ano = scan.nextInt();
        System.out.print("Mês de vencimento: "); int mes = scan.nextInt();
        System.out.println("Código de segurança do cartão(CVV): "); int cvv = scan.nextInt();

        // PASSA O VALOR REAL PARA O CONTROLADOR SALVAR NO TXT
        controller.processarPagamento(idAssinante, tit, fc, ano, mes, cvv, valor);
        System.out.println("\n✅ SUCESSO! Valor gravado: R$" + valor);
    }
}