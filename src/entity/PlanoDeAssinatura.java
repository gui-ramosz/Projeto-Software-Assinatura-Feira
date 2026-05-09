package entity;
import java.util.List;

public class PlanoDeAssinatura {
    private Integer idPlano;
    private String nome;
    private Double valorMensal;
    private Boolean ativo;

    public PlanoDeAssinatura(Integer idPlano, String nome, Double valorMensal, Boolean ativo) {
        this.idPlano = idPlano;
        this.nome = nome;
        this.valorMensal = valorMensal;
        this.ativo = ativo;
    }

    public Double consultarValorMensal() {
        return this.valorMensal;
    }

    public List<String> obterRegras() {
        return null;
    }

    public Integer getIdPlano() { return idPlano; }
    public void setIdPlano(Integer idPlano) { this.idPlano = idPlano; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public Double getValorMensal() { return valorMensal; }
    public void setValorMensal(Double valorMensal) { this.valorMensal = valorMensal; }
    public Boolean getAtivo() { return ativo; }
    public void setAtivo(Boolean ativo) { this.ativo = ativo; }
}