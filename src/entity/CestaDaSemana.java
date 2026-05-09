package entity;

public class CestaDaSemana {
    private Integer idCesta;
    private Double valorTotalCesta;
    private Integer idCompra;

    public CestaDaSemana(Integer idCesta, Double valorTotalCesta, Integer idCompra) {
        this.idCesta = idCesta;
        this.valorTotalCesta = valorTotalCesta;
        this.idCompra = idCompra;
    }

    public void adicionarItem(Integer idProduto, Integer qtd) {
        System.out.println("Item adicionado: " + idProduto);
    }

    public void removerItem(Integer idProduto) {
        System.out.println("Item removido: " + idProduto);
    }

    public Double calcularTotalCesta() {
        return this.valorTotalCesta;
    }

    public Integer getIdCesta() { return idCesta; }
    public void setIdCesta(Integer idCesta) { this.idCesta = idCesta; }
    public Double getValorTotalCesta() { return valorTotalCesta; }
    public void setValorTotalCesta(Double valorTotalCesta) { this.valorTotalCesta = valorTotalCesta; }
    public Integer getIdCompra() { return idCompra; }
    public void setIdCompra(Integer idCompra) { this.idCompra = idCompra; }
}