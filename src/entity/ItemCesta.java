package entity;

public class ItemCesta {
    private Integer idItem;
    private Integer quantidadeEscolhida;
    private Integer idProduto;
    private Integer idCesta;

    public ItemCesta(Integer idItem, Integer quantidadeEscolhida, Integer idProduto, Integer idCesta) {
        this.idItem = idItem;
        this.quantidadeEscolhida = quantidadeEscolhida;
        this.idProduto = idProduto;
        this.idCesta = idCesta;
    }

    public void alterarQuantidade(Integer novaQtd) {
        this.quantidadeEscolhida = novaQtd;
    }

    public Integer getIdItem() { return idItem; }
    public void setIdItem(Integer idItem) { this.idItem = idItem; }
    public Integer getQuantidadeEscolhida() { return quantidadeEscolhida; }
    public void setQuantidadeEscolhida(Integer quantidadeEscolhida) { this.quantidadeEscolhida = quantidadeEscolhida; }
    public Integer getIdProduto() { return idProduto; }
    public void setIdProduto(Integer idProduto) { this.idProduto = idProduto; }
    public Integer getIdCesta() { return idCesta; }
    public void setIdCesta(Integer idCesta) { this.idCesta = idCesta; }
}
