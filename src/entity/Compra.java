package entity;
import java.util.Date;

public class Compra {
    private Integer idCompra;
    private Date dataPedido;
    private String status;
    private Integer idAssinante;

    public Compra(Integer idCompra, Date dataPedido, String status, Integer idAssinante) {
        this.idCompra = idCompra;
        this.dataPedido = dataPedido;
        this.status = status;
        this.idAssinante = idAssinante;
    }

    public void gerarCompraSemanal(Integer idAssinatura) {
        System.out.println("Compra da semana gerada para assinatura: " + idAssinatura);
    }

    public void atualizarStatus(String status) {
        this.status = status;
    }

    public Integer getIdCompra() { return idCompra; }
    public void setIdCompra(Integer idCompra) { this.idCompra = idCompra; }
    public Date getDataPedido() { return dataPedido; }
    public void setDataPedido(Date dataPedido) { this.dataPedido = dataPedido; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public Integer getIdAssinante() { return idAssinante; }
    public void setIdAssinante(Integer idAssinante) { this.idAssinante = idAssinante; }
}