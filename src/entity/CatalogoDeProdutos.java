package entity;
import java.util.Date;
import java.util.List;

public class CatalogoDeProdutos {
    private Integer idCatalogo;
    private String semanaReferencia;
    private Date dataAtualizacao;

    public CatalogoDeProdutos(Integer idCatalogo, String semanaReferencia, Date dataAtualizacao) {
        this.idCatalogo = idCatalogo;
        this.semanaReferencia = semanaReferencia;
        this.dataAtualizacao = dataAtualizacao;
    }

    public List<String> listarProdutosDisponiveis() {
        return null;
    }

    public void atualizarCatalogoSemanal() {
        System.out.println("Catálogo da semana atualizado!");
    }

    public Integer getIdCatalogo() { return idCatalogo; }
    public void setIdCatalogo(Integer idCatalogo) { this.idCatalogo = idCatalogo; }
    public String getSemanaReferencia() { return semanaReferencia; }
    public void setSemanaReferencia(String semanaReferencia) { this.semanaReferencia = semanaReferencia; }
    public Date getDataAtualizacao() { return dataAtualizacao; }
    public void setDataAtualizacao(Date dataAtualizacao) { this.dataAtualizacao = dataAtualizacao; }
}