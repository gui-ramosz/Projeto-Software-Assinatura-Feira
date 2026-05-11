package entity;
import java.time.LocalDate;

public class CartaoDeCredito {
    private Integer idCartao;
    private String nomeTitular;
    private String numeroFinal;
    private Integer mesValidade;
    private Integer anoValidade;
    private Integer limite;

    public CartaoDeCredito(Integer idCartao, String nomeTitular, String numeroFinal, Integer mesValidade, Integer anoValidade, Integer limite) {
        this.idCartao = idCartao;
        this.nomeTitular = nomeTitular;
        this.numeroFinal = numeroFinal;
        this.mesValidade = mesValidade;
        this.anoValidade = anoValidade;
        this.limite = limite;
    }

    public void salvarCartao() {
        System.out.println("Cartão salvo para futuras compras.");
    }

    public Boolean validarVencimento() {
        LocalDate dataAtual = LocalDate.now();
        int anoAtual = dataAtual.getYear();
        int mesAtual = dataAtual.getMonthValue();
        if(this.anoValidade > anoAtual){
            return true;
        }
        else if(this.anoValidade == anoAtual && this.mesValidade >= mesAtual){
            return true;
        }
        else{
            return false;
        }
    }

    public Integer getIdCartao() { return idCartao; }
    public void setIdCartao(Integer idCartao) { this.idCartao = idCartao; }
    public String getNomeTitular() { return nomeTitular; }
    public void setNomeTitular(String nomeTitular) { this.nomeTitular = nomeTitular; }
    public String getNumeroFinal() { return numeroFinal; }
    public void setNumeroFinal(String numeroFinal) { this.numeroFinal = numeroFinal; }
    public Integer getMesValidade() { return mesValidade; }
    public void setMesValidade(Integer mesValidade) { this.mesValidade = mesValidade; }
    public Integer getAnoValidade() { return anoValidade; }
    public void setAnoValidade(Integer anoValidade) { this.anoValidade = anoValidade; }
    public Integer getLimite(){ return limite;}
}