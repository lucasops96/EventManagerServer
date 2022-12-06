import java.time.LocalDateTime;
// import java.time.format.DateTimeFormatter;
// import javax.swing.JOptionPane;
// import java.util.ArrayList;
// import static java.time.format.DateTimeFormatter.ofPattern;


public class Ingresso {
    private int codigo;
    private Evento evento;
    private LocalDateTime data;
    private float valorIngresso;


    public Ingresso(int codigo,Evento evento, LocalDateTime data, float valorIngresso){
        this.codigo = codigo;
        this.evento = evento;
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

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    @Override
    public String toString() {
        return "\nIngresso - Código : " + codigo + "\nEvento : " + evento.getNomeEvento() + "\nData : " + data + "\n Valor Ingresso : R$ "+ valorIngresso +"";
    }

    
    
}
