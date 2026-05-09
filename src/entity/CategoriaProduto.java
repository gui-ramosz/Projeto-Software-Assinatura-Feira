package entity;
import java.util.List;

public class CategoriaProduto {
    private Integer idCategoria;
    private String nome;

    public CategoriaProduto(Integer idCategoria, String nome) {
        this.idCategoria = idCategoria;
        this.nome = nome;
    }

    public List<String> listarProdutosPorCategoria() {
        return null; 
    }

    public Integer getIdCategoria() { return idCategoria; }
    public void setIdCategoria(Integer idCategoria) { this.idCategoria = idCategoria; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
}