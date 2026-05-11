package control;

import entity.VerificacaoSMS;
import entity.Assinante;
import entity.Assinatura;
import persistence.GerenciadorArquivo;
import java.util.Date;

public class CadastroController {
    
    private int contadorId; 
    private GerenciadorArquivo repo = new GerenciadorArquivo();
    
    // Serviço de SMS simulado
    private VerificacaoSMS smsService = new VerificacaoSMS(1, "1234", new Date(), new Date(), "PENDENTE");

    // Busca o ID real no TXT assim que o controlador inicia
    public CadastroController() {
        this.contadorId = repo.obterProximoId("banco_assinantes.txt");
    }

    public boolean enviarCodigoSMS(String celular) {
        return smsService.enviarCodigoSMS(celular);
    }

    public boolean validarCodigo(String codigo) {
        return smsService.validarCodigo(codigo);
    }

    public int criarAssinante(String nome, String celular) {
        // Usa o ID vindo do arquivo e incrementa
        int idGerado = contadorId++; 
        Assinante novo = new Assinante(idGerado, nome, celular, new Date());
        novo.cadastrar(nome + " | " + celular);
        repo.salvarAssinante(novo);
        
        return idGerado; 
    }

    public void criarAssinatura(int idAssinante, int idPlano) {
        String prot = "ASS-" + System.currentTimeMillis();
        Assinatura ass = new Assinatura(prot, new Date(), "Ativa", idAssinante, idPlano);
        
        // Ativa a assinatura
        ass.criarAssinatura(idPlano);
        System.out.println("Assinatura " + prot + " vinculada ao assinante ID: " + idAssinante);
    }
}
