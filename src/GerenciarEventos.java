import java.util.ArrayList;
import javax.swing.JOptionPane;


public class GerenciarEventos {
    
    private ArrayList<Evento> eventos = new ArrayList<Evento>();

    public void addEvento(Evento evento){
        this.eventos.add(evento);
        JOptionPane.showMessageDialog(null,"Evento Cadastrado."+"\n"+evento);
    }
}
