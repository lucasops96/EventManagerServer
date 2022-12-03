public class Evento {
    private String nomeEvento;
    private String nomeEst;
    private String descricao;
    private int quantIngressos;
    private Endereco endereco;

    public Evento(String nomeEvento, String nomeEst, String descricao, int quantIngressos, Endereco endereco){
        this.nomeEvento = nomeEvento;
        this.nomeEst = nomeEst;
        this.descricao = descricao;
        this.quantIngressos = quantIngressos;
        this.endereco = endereco;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public String getNomeEst() {
        return nomeEst;
    }

    public void setNomeEst(String nomeEst) {
        this.nomeEst = nomeEst;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantIngressos() {
        return quantIngressos;
    }

    public void setQuantIngressos(int quantIngressos) {
        this.quantIngressos = quantIngressos;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return  nomeEvento + "[ nomeEst=" + nomeEst + ", descricao=" + descricao
                + ", quantIngressos=" + quantIngressos + ", endereco=" + endereco + "]";
    }

    
}
