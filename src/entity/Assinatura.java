package entity;
import java.util.Date;

public class Assinatura {
    private String protocolo;
    private Date dataInicio;
    private String status;
    private Integer idAssinante;
    private Integer idPlano;

    public Assinatura(String protocolo, Date dataInicio, String status, Integer idAssinante, Integer idPlano) {
        this.protocolo = protocolo;
        this.dataInicio = dataInicio;
        this.status = status;
        this.idAssinante = idAssinante;
        this.idPlano = idPlano;
    }

    public void criarAssinatura(Integer idPlano) {
        this.idPlano = idPlano;
        this.status = "Ativa";
    }

    public void cancelarAssinatura() {
        this.status = "Cancelada";
    }

    public String verificarStatus() {
        return this.status;
    }

    public String getProtocolo() { return protocolo; }
    public void setProtocolo(String protocolo) { this.protocolo = protocolo; }
    public Date getDataInicio() { return dataInicio; }
    public void setDataInicio(Date dataInicio) { this.dataInicio = dataInicio; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public Integer getIdAssinante() { return idAssinante; }
    public void setIdAssinante(Integer idAssinante) { this.idAssinante = idAssinante; }
    public Integer getIdPlano() { return idPlano; }
    public void setIdPlano(Integer idPlano) { this.idPlano = idPlano; }
}