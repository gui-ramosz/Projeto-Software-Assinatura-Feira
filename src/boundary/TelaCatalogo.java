package boundary;

import control.CheckoutController;
import java.util.Scanner;

public class TelaCatalogo {
    private CheckoutController controller = new CheckoutController();
    private Scanner scan = new Scanner(System.in);

    public void iniciar(int limF, int limL, int limV, int idAssinante, double valorPlano) {
        boolean cestaConfirmada = false;

        while (!cestaConfirmada) {
            controller.getItensCesta().clear();

            System.out.println("\n========================================");
            System.out.println("       MONTE SUA CESTA DA SEMANA");
            System.out.println("========================================");
            
            exibirMenuCategoria("FRUTAS", limF, new String[]{
                "Banana (1/2 dúzia)", "Maçã (4 un.)", "Uva (250g)", "Abacaxi (un.)"
            });

            exibirMenuCategoria("LEGUMES", limL, new String[]{
                "Batata (500g)", "Cenoura (3 un.)", "Abóbora (1/2 un.)", "Cebola (3 un.)"
            });

            exibirMenuCategoria("VERDURAS", limV, new String[]{
                "Alface (un.)", "Couve (un.)", "Espinafre (un.)", "Brócolis (un.)"
            });

            System.out.println("\n========================================");
            System.out.println("              MINHA CESTA");
            System.out.println("========================================");
            if (controller.getItensCesta().isEmpty()) {
                System.out.println("Sua cesta está vazia!");
            } else {
                for (String item : controller.getItensCesta()) {
                    System.out.println("✅ " + item);
                }
            }
            System.out.println("========================================");

            int op = 0;
            while (op != 1 && op != 2) {
                System.out.println("\nTudo certo com sua cesta?");
                System.out.println("1 - Sim, ir para o pagamento");
                System.out.println("2 - Não, quero refazer TUDO do zero");
                System.out.print("Escolha (1 ou 2): ");
                
                op = scan.nextInt();
                scan.nextLine(); 

                if (op == 1) {
                    cestaConfirmada = true;
                } else if (op == 2) {
                    System.out.println("\nApagando cesta... Vamos começar de novo!");
                } else {
                    System.out.println("Opção inválida! Digite 1 para avançar ou 2 para refazer.");
                }
            }
        }
        
        TelaCheckout telaCheckout = new TelaCheckout(this.controller, idAssinante, valorPlano);
        telaCheckout.iniciar();
    }

    private void exibirMenuCategoria(String nomeCategoria, int limite, String[] itens) {
        int selecionados = 0;
        System.out.println("\nINICIANDO SELEÇÃO DE: " + nomeCategoria);

        while (selecionados < limite) {
            System.out.println("\n>>> Categoria: " + nomeCategoria + " | Limite: " + limite + " | Na cesta: " + selecionados);
            for (int i = 0; i < itens.length; i++) {
                System.out.println((i + 1) + " - " + itens[i]);
            }
            
            int opcaoAvancar = itens.length + 1;
            System.out.println(opcaoAvancar + " - [ FINALIZAR " + nomeCategoria + " / AVANÇAR ]");
            
            System.out.print("Escolha o item (1 a " + opcaoAvancar + "): ");
            int id = scan.nextInt();
            
            if (id == opcaoAvancar) {
                break;
            }

            if (id >= 1 && id <= itens.length) {
                System.out.print("Quantidade desejada de " + itens[id - 1] + ": ");
                int qtd = scan.nextInt();

                if (qtd <= 0) {
                    System.out.println("Quantidade deve ser maior que zero!");
                } else if (selecionados + qtd <= limite) {
                    controller.adicionarItem(itens[id - 1], qtd);
                    selecionados += qtd;
                    System.out.println("Adicionado à cesta!");
                } else {
                    System.out.println("Erro: Você só pode adicionar mais " + (limite - selecionados) + " item(ns) desta categoria.");
                }
            } else {
                System.out.println("ID inválido! Selecione apenas valores que estão no menu.");
            }
        }
        System.out.println(nomeCategoria + " finalizadas!");
    }
}