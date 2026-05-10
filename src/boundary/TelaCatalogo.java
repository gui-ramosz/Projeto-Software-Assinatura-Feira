package boundary;

import control.CheckoutController;
import java.util.Scanner;

public class TelaCatalogo {
    private CheckoutController controller = new CheckoutController();
    private Scanner scan = new Scanner(System.in);

    public void iniciar(int limF, int limV, int limL) {      
        exibirMenuFrutas(limF);
        exibirMenuVerduras(limV);
        exibirMenuLegumes(limL);    
    }

    public void exibirMenuFrutas(int limite) {
        int selecionados = 0;
        while (selecionados < limite) {
            System.out.println("\n--- FRUTAS ---");
            System.out.println("1 - Maçã (un.)");
            System.out.println("2 - Banana (1/2 dúzia)");
            System.out.println("3 - Uva (250g)");
            System.out.println("4 - Abacaxi (un.)");
            System.out.println("5 - Próximo");
            System.out.println("0 - Voltar");

            System.out.print("Escolha o ID: ");
            int id = scan.nextInt();

            if (id == 0) return; 
            if (id == 5) break;  

            System.out.print("Quantidade: ");
            int qtd = scan.nextInt();

            if (selecionados + qtd <= limite) {
                String nome = switch(id) {
                    case 1 -> "Maçã (un.)";
                    case 2 -> "Banana (1/2 dúzia)";
                    case 3 -> "Uva (250g)";
                    case 4 -> "Abacaxi (un.)";
                    default -> null;
                };
                
                if (nome != null) {
                    controller.adicionarItem(nome, qtd);
                    selecionados += qtd;
                }
            } else {
                System.out.println("Quantidade excede o limite do plano!");
            }
        }
    }

    public void exibirMenuVerduras(int limite) {
        int selecionados = 0;
        while (selecionados < limite) {
            System.out.println("\n--- VERDURAS ---");
            System.out.println("1 - Alface (un.)");
            System.out.println("2 - Repolho (un.)");
            System.out.println("3 - Brócolis (250g)");
            System.out.println("4 - Coentro (un.)");
            System.out.println("5 - Próximo");
            System.out.println("0 - Voltar");

            System.out.print("Escolha o ID: ");
            int id = scan.nextInt();

            if (id == 0) return; // Volta para o menu de frutas
            if (id == 5) break;  // Sai deste loop e vai para legumes

            System.out.print("Quantidade: ");
            int qtd = scan.nextInt();

            if (selecionados + qtd <= limite) {
                String nome = switch(id) {
                    case 1 -> "Alface (un.)";
                    case 2 -> "Repolho (un.)";
                    case 3 -> "Brócolis (250g)";
                    case 4 -> "Coentro (un.)";
                    default -> null;
                };
                
                if (nome != null) {
                    controller.adicionarItem(nome, qtd);
                    selecionados += qtd;
                }
            } else {
                System.out.println("Quantidade excede o limite do plano!");
            }
        }
    }

    public void exibirMenuLegumes(int limite) {
        int selecionados = 0;
        while (selecionados < limite) {
            System.out.println("\n--- LEGUMES ---");
            System.out.println("1 - Batata (250g)");
            System.out.println("2 - Cenoura (250g)");
            System.out.println("3 - Cebola (250g)");
            System.out.println("4 - Abóbora (1kg)");
            System.out.println("5 - Próximo");
            System.out.println("0 - Voltar");

            System.out.print("Escolha o ID: ");
            int id = scan.nextInt();

            if (id == 0) return; // Volta para o menu de verduras
            if (id == 5) break;  // Finaliza a fase de catálogo

            System.out.print("Quantidade: ");
            int qtd = scan.nextInt();

            if (selecionados + qtd <= limite) {
                String nome = switch(id) {
                    case 1 -> "Batata (250g)";
                    case 2 -> "Cenoura (250g)";
                    case 3 -> "Cebola (250g)";
                    case 4 -> "Abóbora (1kg)";
                    default -> null;
                };
                
                if (nome != null) {
                    controller.adicionarItem(nome, qtd);
                    selecionados += qtd;
                }
            } else {
                System.out.println("Quantidade excede o limite do plano!");
            }
        }
    }
}