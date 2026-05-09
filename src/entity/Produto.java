package entity;

public class Produto {
    private Integer idProduto;
    private String nome;
    private String descricao;
    private Boolean disponivel;

    public Produto(Integer idProduto, String nome, String descricao, Boolean disponivel) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.descricao = descricao;
        this.disponivel = disponivel;
    }

    public Boolean verificarDisponibilidade() {
        return this.disponivel;
    }

    public String obterDetalhes() {
        return "Produto: " + nome + " - Descrição: " + descricao;
    }

    public Integer getIdProduto() { return idProduto; }
    public void setIdProduto(Integer idProduto) { this.idProduto = idProduto; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public Boolean getDisponivel() { return disponivel; }
    public void setDisponivel(Boolean disponivel) { this.disponivel = disponivel; }
}