package entity;
import java.util.Date;

public class Assinante {
    private Integer idAssinante;
    private String nome;
    private String numeroCelular;
    private Date dataCadastro;

    public Assinante() {
        this.dataCadastro = new Date();
    }

    public Assinante(Integer idAssinante, String nome, String numeroCelular, Date dataCadastro) {
        this.idAssinante = idAssinante;
        this.nome = nome;
        this.numeroCelular = numeroCelular;
        this.dataCadastro = dataCadastro;
    }

    public void cadastrar(String dados) {
        System.out.println("Cadastro Realizado!");
    }

    public void atualizarDados() {
        System.out.println("Dados de " + nome + " atualizados no sistema.");
    }

    public Integer getIdAssinante() { return idAssinante; }
    public void setIdAssinante(Integer id) { idAssinante = id; }
    public String getNome() { return nome; }
    public void setNome(String n) { nome = n; }
    public String getNumeroCelular() { return numeroCelular; }
    public void setNumeroCelular(String c) { numeroCelular = c; }
    public Date getDataCadastro() { return dataCadastro; }
    public void setDataCadastro(Date d) { dataCadastro = d; }
}