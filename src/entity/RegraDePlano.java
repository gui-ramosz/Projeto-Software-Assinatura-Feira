package entity;

public class RegraDePlano {
    private Integer idRegra;
    private Integer limiteDeItens;
    private Integer idPlano;
    private Integer idCategoria;

    public RegraDePlano(Integer idRegra, Integer limiteDeItens, Integer idPlano, Integer idCategoria) {
        this.idRegra = idRegra;
        this.limiteDeItens = limiteDeItens;
        this.idPlano = idPlano;
        this.idCategoria = idCategoria;
    }

    public Boolean validarLimite(Integer qtd, Integer idCategoria) {
        if (this.idCategoria.equals(idCategoria)) {
            return qtd <= limiteDeItens;
        }
        return false;
    }

    public Integer getIdRegra() { return idRegra; }
    public void setIdRegra(Integer idRegra) { this.idRegra = idRegra; }
    public Integer getLimiteDeItens() { return limiteDeItens; }
    public void setLimiteDeItens(Integer limiteDeItens) { this.limiteDeItens = limiteDeItens; }
    public Integer getIdPlano() { return idPlano; }
    public void setIdPlano(Integer idPlano) { this.idPlano = idPlano; }
    public Integer getIdCategoria() { return idCategoria; }
    public void setIdCategoria(Integer idCategoria) { this.idCategoria = idCategoria; }
}