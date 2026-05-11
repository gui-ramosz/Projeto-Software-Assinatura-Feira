package entity;
import java.util.Date;

public class VerificacaoSMS {
    private Integer idVerificacao;
    private String codigoGerado;
    private Date dataHoraEnvio;
    private Date dataHoraExpiracao;
    private String status;


    public VerificacaoSMS(){
        this.idVerificacao = 0;
        this.codigoGerado = "0000";
        this.dataHoraEnvio = new Date();
        this.dataHoraExpiracao = new Date();
        this.status = "PENDENTE"; 
    }

    public VerificacaoSMS(Integer idVerificacao, String codigoGerado, Date dataHoraEnvio, Date dataHoraExpiracao, String status) {
        this.idVerificacao = idVerificacao;
        this.codigoGerado = codigoGerado;
        this.dataHoraEnvio = dataHoraEnvio;
        this.dataHoraExpiracao = dataHoraExpiracao;
        this.status = status;
    }

    public Boolean enviarCodigoSMS(String celular) {
        System.out.println("Enviando SMS para " + celular);
        return true;
    }

    public Boolean validarCodigo(String codigo) {
        return this.codigoGerado.equals(codigo);
    }

    public Integer getIdVerificacao() { return idVerificacao; }
    public void setIdVerificacao(Integer idVerificacao) { this.idVerificacao = idVerificacao; }
    public String getCodigoGerado() { return codigoGerado; }
    public void setCodigoGerado(String codigoGerado) { this.codigoGerado = codigoGerado; }
    public Date getDataHoraEnvio() { return dataHoraEnvio; }
    public void setDataHoraEnvio(Date dataHoraEnvio) { this.dataHoraEnvio = dataHoraEnvio; }
    public Date getDataHoraExpiracao() { return dataHoraExpiracao; }
    public void setDataHoraExpiracao(Date dataHoraExpiracao) { this.dataHoraExpiracao = dataHoraExpiracao; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}