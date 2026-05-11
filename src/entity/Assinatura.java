package entity;
import java.util.Date;

public class Assinatura {
    private String protocolo;
    private Date dataInicio;
    private String status;
    private Integer idAssinante;
    private Integer idPlano;

    public Assinatura() {
        this.protocolo = "PENDENTE";
        this.status = "Inativa";
        this.dataInicio = new Date();
    }

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
        this.dataInicio = new Date();
    }

    public void cancelarAssinatura() {
        this.status = "Cancelada";
        System.out.println("Assinatura " + protocolo + " foi cancelada com sucesso.");
    }

    public String verificarStatus() {
        return this.status;
    }

    public String getProtocolo() { return protocolo; }
    public void setProtocolo(String p) { protocolo = p; }
    public String getStatus() { return status; }
    public void setStatus(String s) { status = s; }
    public Integer getIdAssinante() { return idAssinante; }
    public void setIdAssinante(Integer id) { idAssinante = id; }
    public Integer getIdPlano() { return idPlano; }
    public void setIdPlano(Integer id) { idPlano = id; }
    public Date getDataInicio() { return dataInicio; }
    public void setDataInicio(Date d) { dataInicio = d; }
}
