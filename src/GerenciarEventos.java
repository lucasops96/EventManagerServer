import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import static java.time.format.DateTimeFormatter.ofPattern;

public class GerenciarEventos {
    
    private ArrayList<Evento> eventos = new ArrayList<Evento>();

    public void addEvento(Evento evento){
        this.eventos.add(evento);
        JOptionPane.showMessageDialog(null,"Evento Cadastrado."+"\n"+evento);
    }

    public ArrayList<Evento> getEventos(){
        return eventos;
    }

    public void atualizarEvento(String nomeEvento ){
        for(Evento evento : eventos){
            if(evento.getNomeEvento().equals(nomeEvento)){
                String nomeEventoAtua = JOptionPane.showInputDialog(null,"Atualize o nome do Evento: ");
                evento.setNomeEvento(nomeEventoAtua);
                
                String descricao = JOptionPane.showInputDialog(null,"Atualize a descrição do Evento: ");
                evento.setDescricao(descricao);
                
                int quantIngressos = Integer.parseInt(JOptionPane.showInputDialog(null,"Atualize a quantidade de Ingressos: "));
                evento.setQuantIngressos(quantIngressos);

                float valorEntrada = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor do Ingresso: "));
                evento.setValorEntrada(valorEntrada);

                String data = JOptionPane.showInputDialog(null,"Digite a data e hora: ");
                LocalDateTime date = LocalDateTime.parse(data, ofPattern("dd/MM/yyyy HH:mm"));
                evento.setData(date);

                String estado = JOptionPane.showInputDialog(null,"Digite o estado: ");
                String cidade = JOptionPane.showInputDialog(null,"Digite a cidade: ");
                String bairro = JOptionPane.showInputDialog(null,"Digite o bairro: ");
                String rua = JOptionPane.showInputDialog(null,"Digite a rua: ");
                int numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite número do endereço: "));

                evento.setEndereco(new Endereco(estado, cidade, bairro, rua, numero));

                JOptionPane.showMessageDialog(null,"Evento Atualizado."+"\n"+evento);
                return;
            }
        }
    }

    public void remover(String nomeEvento){
        for(int i=0;i<eventos.size();i++){
            if(eventos.get(i).getNomeEvento().equals(nomeEvento)){
                this.eventos.remove(i);
                JOptionPane.showMessageDialog(null,"Evento Removido");
                return;
            }
        }
    }

    @Override
    public String toString() {
        return  "|" + eventos +"|";
    }

}
