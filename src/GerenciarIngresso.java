import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GerenciarIngresso {

    private ArrayList<Ingresso> ingressos = new ArrayList<Ingresso>();

    public void addIngresso(Ingresso ingresso){
        this.ingressos.add(ingresso);
        JOptionPane.showMessageDialog(null,"Ingresso comprado."+"\n"+ingresso);
    }

    public void gerarIngresso(Promotor promotor, String nomeEvento){
        for(Evento evento : promotor.getMeusEventos().getEventos()){
            if(evento.getNomeEvento().equals(nomeEvento) && evento.getQuantIngressos() > 0){
                int q = evento.getQuantIngressos();
                int codigo = q + 100;
                q = q - 1;
                evento.setQuantIngressos(q);
                
                Ingresso novoIngresso = new Ingresso(codigo,evento,evento.getData(),evento.getValorEntrada());

                addIngresso(novoIngresso);
                return;
            }
        }   
    }

    public void cancelarIngresso(int codigo,Promotor promotor, String nomeEvento){
        for(int i=0;i<ingressos.size();i++){
            if(ingressos.get(i).getCodigo() == codigo){
                this.ingressos.remove(i);
                JOptionPane.showMessageDialog(null,"Ingresso Cancelado.");
            }
        }

        for(Evento evento : promotor.getMeusEventos().getEventos()){
            if(evento.getNomeEvento().equals(nomeEvento) && evento.getQuantIngressos() > 0){
                int q = evento.getQuantIngressos();
                q+=1;
                evento.setQuantIngressos(q);
                return;
            }
        }
    }

    @Override
    public String toString() {
        return "|" + ingressos + "|";
    }

    
}
