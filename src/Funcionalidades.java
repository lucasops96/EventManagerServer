import javax.swing.JOptionPane;

public class Funcionalidades {
    
    public void cadastrarEvento(Promotor promotor,Evento evento){
        promotor.getMeusEventos().addEvento(evento);
    }

    public void atuaEvento(Promotor promotor){
        String nomeEvento = JOptionPane.showInputDialog(null,"Digite o nome do Evento que quer Atualizar : ");
        promotor.getMeusEventos().atualizarEvento(nomeEvento);
    }

    public void removerEvento(Promotor promotor){
        String nomeEvento = JOptionPane.showInputDialog(null,"Digite o nome do Evento que quer Remover : ");
        promotor.getMeusEventos().remover(nomeEvento);
    }

    public void imprimirEventos(Promotor promotor){
        JOptionPane.showMessageDialog(null,"Meus Eventos  "+promotor);
    }

}
