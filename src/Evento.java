import java.time.LocalDateTime;

public class Evento {
    private String nomeEvento;
    private String nomeEst;
    private String descricao;
    private int quantIngressos;
    private float valorEntrada;
    private LocalDateTime data;
    private Endereco endereco;

    public Evento(String nomeEvento, String nomeEst, String descricao, int quantIngressos, float valorEntrada, LocalDateTime data, Endereco endereco){
        this.nomeEvento = nomeEvento;
        this.nomeEst = nomeEst;
        this.descricao = descricao;
        this.quantIngressos = quantIngressos;
        this.valorEntrada = valorEntrada;
        this.data = data;
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
    public float getValorEntrada() {
        return valorEntrada;
    }

    public void setValorEntrada(float valorEntrada) {
        this.valorEntrada = valorEntrada;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }
    
    @Override
    public String toString() {
        return  "\n"+nomeEst+ " | Evento : " + nomeEvento +"\nData : "+data+ "\nDescricao : " + descricao
                + "\nNúmero de Ingressos : " + quantIngressos +"\nValor do Ingresso: R$"+valorEntrada+ "\nEndereço : " + endereco + "|\n\n";
    }

    

    

    
}
