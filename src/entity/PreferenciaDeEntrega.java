package entity;

public class PreferenciaDeEntrega {
    private Integer idPreferencia;
    private String diaDaSemana;
    private String horarioPreferencial;
    private String observacoes;
    private Integer idEndereco;

    public PreferenciaDeEntrega(Integer idPreferencia, String diaDaSemana, String horarioPreferencial, String observacoes, Integer idEndereco) {
        this.idPreferencia = idPreferencia;
        this.diaDaSemana = diaDaSemana;
        this.horarioPreferencial = horarioPreferencial;
        this.observacoes = observacoes;
        this.idEndereco = idEndereco;
    }

    public void definirHorario(String janelaTempo) {
        this.horarioPreferencial = janelaTempo;
    }

    public Integer getIdPreferencia() { return idPreferencia; }
    public void setIdPreferencia(Integer idPreferencia) { this.idPreferencia = idPreferencia; }
    public String getDiaDaSemana() { return diaDaSemana; }
    public void setDiaDaSemana(String diaDaSemana) { this.diaDaSemana = diaDaSemana; }
    public String getHorarioPreferencial() { return horarioPreferencial; }
    public void setHorarioPreferencial(String horarioPreferencial) { this.horarioPreferencial = horarioPreferencial; }
    public String getObservacoes() { return observacoes; }
    public void setObservacoes(String observacoes) { this.observacoes = observacoes; }
    public Integer getIdEndereco() { return idEndereco; }
    public void setIdEndereco(Integer idEndereco) { this.idEndereco = idEndereco; }
}