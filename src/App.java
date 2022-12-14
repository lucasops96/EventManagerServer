import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente c1 = new Cliente("Miguel Santos", "miguel_s34@gmail.com", "12345","8896692738","05622895481");

        Promotor p1 = new Promotor("Martins Filho","mfilho784@gmail.com" ,"8456561", "88985236410", "98765412354", new Endereco("PB", "Patos", "centro", "Rua portugal", 24));



        int op = 0;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite:\n1-Promotor\n2-Cliente\n8-Encerrar"));

            if(op == 1){
                op = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "PROMOTOR\nDigite:\n1-Cadastrar Evento\n2-Atualizar Evento\n3-Remover Evento\n4-Meus Eventos\n8-Encerrar"));

                switch (op) {
                    case 1:
                        p1.getMeusEventos().addEvento(new LerDados().criarEvento());
                        break;

                    case 2:                    
                        p1.getMeusEventos().atualizarEvento(JOptionPane.showInputDialog(null,"Digite o nome do Evento que quer Atualizar : "));
                        break;

                    case 3:
                        p1.getMeusEventos().remover(JOptionPane.showInputDialog(null,"Digite o nome do Evento que quer Remover : "));
                        break;

                    case 4:
                        JOptionPane.showMessageDialog(null,"Meus Eventos  "+ p1);
                        break;
                    
                    case 8:

                        System.out.println("Programa encerrado :/");
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Digite uma operação válida!");
                        break;
            }
            }else if(op == 2){
                op = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "ClIENTE\nDigite:\n1-Comprar Ingresso\n2-Cancelar Ingresso\n3-Meus Ingressos\n8-Encerrar"));

                switch (op) {
                    case 1:
                        c1.getMeusIngressos().gerarIngresso(p1, JOptionPane.showInputDialog(null,"Digite o nome do Evento que quer comprar o ingresso : "));
                        break;

                    case 2:                    
                        c1.getMeusIngressos().cancelarIngresso(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o código do ingresso: ")), p1, JOptionPane.showInputDialog(null,"Digite o nome do Evento que quer cancelar o ingresso : ") );
                        break;

                    case 3:
                        JOptionPane.showMessageDialog(null,"Meus Ingressos "+ c1);
                        break;
                    
                    case 8:

                        System.out.println("Programa encerrado :/");
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Digite uma operação válida!");
                        break;

                }
            }

        } while (op != 8);
    }
}
