package control;

import entity.*;
import persistence.GerenciadorArquivo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CheckoutController {
    private List<String> itensCestaStr = new ArrayList<>();
    private GerenciadorArquivo repo = new GerenciadorArquivo();
    
    private int idComp;
    private int idCest;
    private int idEnd;
    private int idPref;

    public CheckoutController() {
        this.idComp = repo.obterProximoId("banco_compras.txt");
        this.idCest = repo.obterProximoId("banco_cestas.txt");
        this.idEnd = repo.obterProximoId("banco_enderecos.txt");
        this.idPref = repo.obterProximoId("banco_preferencias.txt");
    }

    public void adicionarItem(String nome, int qtd) {
        itensCestaStr.add(nome + " x" + qtd);
    }

    public void salvarEndereco(String cep, String rua, String num, String bairro) {
        EnderecoDeEntrega e = new EnderecoDeEntrega(idEnd++, cep, rua, num, "", bairro);
        repo.salvarEndereco(e);
    }

    public void salvarPreferencia(String dia, String hora) {
        PreferenciaDeEntrega p = new PreferenciaDeEntrega(idPref++, dia, hora, "", 1);
        repo.salvarPreferencia(p);
    }

    public boolean processarPagamento(int idAssinante, String titular, String numCartao, int ano, int mes, int cvv, double valorTotal) {
        OperadoraDeCartao operadora = new OperadoraDeCartao(titular, numCartao);
        CartaoDeCredito cartao = new CartaoDeCredito(idAssinante, titular, numCartao, mes, ano, 1000);
        boolean compraAprovada = false; 
        if(operadora.validarLimite(cartao, valorTotal) && cartao.validarVencimento() == true){
            compraAprovada = true;
        }
        String statusPagamento = compraAprovada ? "APROVADO" : "RECUSADO";
        String statusCompra = compraAprovada ? "CONCLUÍDA" : "CANCELADA";  
        Date dataAtual = new Date();
        
        Compra novaCompra = new Compra(idComp++, new Date(), statusCompra, idAssinante);
        CestaDaSemana novaCesta = new CestaDaSemana(idCest++, valorTotal, novaCompra.getIdCompra());
        
        Pagamento pag = new Pagamento(novaCompra.getIdCompra(), valorTotal, dataAtual, statusPagamento, idAssinante);

        repo.salvarCompra(novaCompra);
        repo.salvarCesta(novaCesta, itensCestaStr);
        repo.salvarPagamento(pag);
        
        return compraAprovada;
    }

    public List<String> getItensCesta() { return itensCestaStr; }
} 