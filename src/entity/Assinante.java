package entity;
import java.util.Date;

public class Assinante {
    private Integer idAssinante;
    private String nome;
    private String numeroCelular;
    private Date dataCadastro;

    public Assinante(Integer idAssinante, String nome, String numeroCelular, Date dataCadastro) {
        this.idAssinante = idAssinante;
        this.nome = nome;
        this.numeroCelular = numeroCelular;
        this.dataCadastro = dataCadastro;
    }

    public void cadastrar(String dados) {
        System.out.println("Cadastrando: " + dados);
    }

    public void atualizarDados() {
        System.out.println("Atualizando dados do assinante.");
    }

    public Integer getIdAssinante() { return idAssinante; }
    public void setIdAssinante(Integer idAssinante) { this.idAssinante = idAssinante; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getNumeroCelular() { return numeroCelular; }
    public void setNumeroCelular(String numeroCelular) { this.numeroCelular = numeroCelular; }
    public Date getDataCadastro() { return dataCadastro; }
    public void setDataCadastro(Date dataCadastro) { this.dataCadastro = dataCadastro; }
}