package entity;

public class OperadoraDeCartao {
    private String nomeOperadora;
    private String endpointApi;

    public OperadoraDeCartao(String nomeOperadora, String endpointApi) {
        this.nomeOperadora = nomeOperadora;
        this.endpointApi = endpointApi;
    }

    public Boolean autorizarTransacao(Double valor) {
        System.out.println("Transação autorizada pela operadora " + nomeOperadora);
        return true;
    }

    public String getNomeOperadora() { return nomeOperadora; }
    public void setNomeOperadora(String nomeOperadora) { this.nomeOperadora = nomeOperadora; }
    public String getEndpointApi() { return endpointApi; }
    public void setEndpointApi(String endpointApi) { this.endpointApi = endpointApi; }
}