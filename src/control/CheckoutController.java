package control;

import java.util.ArrayList;
import java.util.List;

public class CheckoutController {
    // Lista simples de Strings para guardar os nomes e quantidades
    private List<String> itensCesta = new ArrayList<>();

    public void adicionarItem(String nome, int qtd) {
        String registro = nome + " x" + qtd;
        itensCesta.add(registro);
        System.out.println("Adicionado: " + registro); // Apenas para confirmar no console
    }
    
    // Método que usaremos na TelaPagamento depois
    public List<String> getItensCesta() {
        return itensCesta;
    }
}