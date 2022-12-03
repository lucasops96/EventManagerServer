import javax.swing.JOptionPane;

public class LerDados {
    public Evento criarEvento(){
        String nomeEvento = JOptionPane.showInputDialog(null,"Digite o nome do Evento: ");
        String nomeEst = JOptionPane.showInputDialog(null,"Digite o nome do Estabelecimento: ");
        String descricao = JOptionPane.showInputDialog(null,"Digite a descriçao do Evento: ");
        int quantIngressos = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade de Ingressos: "));

        String estado = JOptionPane.showInputDialog(null,"Digite o estado: ");
        String cidade = JOptionPane.showInputDialog(null,"Digite a cidade: ");
        String bairro = JOptionPane.showInputDialog(null,"Digite o bairro: ");
        String rua = JOptionPane.showInputDialog(null,"Digite a rua: ");
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite número do endereço: "));

        Evento e = new Evento(nomeEvento, nomeEst, descricao, quantIngressos, new Endereco(estado, cidade, bairro, rua, numero));
        return e;
    }   
}
