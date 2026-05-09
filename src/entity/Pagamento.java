package entity;
import java.time.LocalDateTime;

public class Pagamento {
    private Integer idPagamento;
    private Double valorTotal;
    private LocalDateTime dataHoraPagamento;
    private String status;
    private Integer idCompra;

    public Pagamento(Integer idPagamento, Double valorTotal, LocalDateTime dataHoraPagamento, String status, Integer idCompra) {
        this.idPagamento = idPagamento;
        this.valorTotal = valorTotal;
        this.dataHoraPagamento = dataHoraPagamento;
        this.status = status;
        this.idCompra = idCompra;
    }

    public Boolean processarPagamento(Double valor, Integer idCartao) {
        System.out.println("Processando pagamento...");
        return true;
    }

    public String gerarRecibo() {
        return "Recibo de Pagamento - Valor: " + this.valorTotal;
    }

    public Integer getIdPagamento() { return idPagamento; }
    public void setIdPagamento(Integer idPagamento) { this.idPagamento = idPagamento; }
    public Double getValorTotal() { return valorTotal; }
    public void setValorTotal(Double valorTotal) { this.valorTotal = valorTotal; }
    public LocalDateTime getDataHoraPagamento() { return dataHoraPagamento; }
    public void setDataHoraPagamento(LocalDateTime dataHoraPagamento) { this.dataHoraPagamento = dataHoraPagamento; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public Integer getIdCompra() { return idCompra; }
    public void setIdCompra(Integer idCompra) { this.idCompra = idCompra; }
}
