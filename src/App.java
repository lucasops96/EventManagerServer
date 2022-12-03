import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // Cliente c1 = new Cliente("Miguel Santos", "miguel_s34@gmail.com", "12345","8896692738","05622895481");

        Promotor p1 = new Promotor("Martins Filho","mfilho784@gmail.com" ,"8456561", "88985236410", "98765412354", new Endereco("PB", "Patos", "centro", "Rua portugal", 24));

        Funcionalidades f = new Funcionalidades();



        int op = 0;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite:\n1-Cadastrar Evento\n2-Atualizar Evento\n3-Remover Evento\n4-Imprimir Eventos\n8-Encerrar"));

            switch (op) {
                case 1:
                    f.cadastrarEvento(p1, new LerDados().criarEvento());
                    break;

                case 2:                    
                    f.atuaEvento(p1);
                    break;

                case 3:
                    f.removerEvento(p1);
                    break;

                case 4:
                    f.imprimirEventos(p1);
                    break;
                
                case 8:

                    System.out.println("Programa encerrado :/");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Digite uma operação válida!");
                    break;
            }

        } while (op != 8);
    }
}
