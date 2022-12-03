import java.time.LocalDateTime;
// import java.time.format.DateTimeFormatter;

public class Ingresso {
    private int codigo;
    private LocalDateTime data;
    private float valorIngresso;

    public Ingresso(int codigo, LocalDateTime data, float valorIngresso){
        this.codigo = codigo;
        this.data = data;
        this.valorIngresso = valorIngresso;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public float getValorIngresso() {
        return valorIngresso;
    }

    public void setValorIngresso(float valorIngresso) {
        this.valorIngresso = valorIngresso;
    }

    
}
