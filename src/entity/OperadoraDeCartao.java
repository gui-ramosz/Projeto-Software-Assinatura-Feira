package entity;

public class OperadoraDeCartao {
    private String nomeOperadora;
    private String endpointApi;

    public OperadoraDeCartao(String nomeOperadora, String endpointApi) {
        this.nomeOperadora = nomeOperadora;
        this.endpointApi = endpointApi;
    }

    public String getNomeOperadora() { return nomeOperadora; }
    public void setNomeOperadora(String nomeOperadora) { this.nomeOperadora = nomeOperadora; }
    public String getEndpointApi() { return endpointApi; }
    public void setEndpointApi(String endpointApi) { this.endpointApi = endpointApi; }

    public boolean validarLimite(CartaoDeCredito cartao, double valorCompra) {
        if (valorCompra <= 0) {
            return false;
        }
        // Simulação de limite do cliente
        double limiteDisponivel = cartao.getLimite();

        if (valorCompra > limiteDisponivel) {
            System.out.println("Operadora: Compra negada. Limite insuficiente.");
            return false;
        }

        return true; // Passou no limite
    }
}