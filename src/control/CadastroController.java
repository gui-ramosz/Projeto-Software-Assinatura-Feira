package control;

import entity.VerificacaoSMS;
import entity.Assinante;
import entity.Assinatura;

public class CadastroController {
    private VerificacaoSMS smsService = new VerificacaoSMS();

    public boolean enviarCodigoSMS(String celular) {
        return smsService.enviarCodigoSMS(celular);
    }

    public boolean validarCodigo(String codigo) {
        return smsService.validarCodigo(codigo);
    }

    public void criarAssinante(String dados) {
        Assinante cliente = new Assinante();
        cliente.cadastrar(dados);
    }

    public void criarAssinatura(int idAssinante, int idPlano) {
        Assinatura novaAssinatura = new Assinatura();
        novaAssinatura.criarAssinatura(idPlano); 
    }
}