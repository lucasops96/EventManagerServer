public class Cliente extends Pessoa{
    
    private String cpf;
    private GerenciarIngresso meusIngressos;

    public Cliente(String cpf){
        this.cpf =  cpf;
        this.meusIngressos = new GerenciarIngresso(); 
    }

    public Cliente(String nome, String email, String senha, String telefone, String cpf){
        super(nome, email, senha, telefone);
        this.cpf = cpf;
        this.meusIngressos = new GerenciarIngresso();
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public GerenciarIngresso getMeusIngressos() {
        return meusIngressos;
    }

    public void setMeusIngressos(GerenciarIngresso meusIngressos) {
        this.meusIngressos = meusIngressos;
    }

    @Override
    public String toString() {
        return getNome()+" - CPF : " + cpf + "\nmeusIngressos" + meusIngressos + "";
    }

    
    

}
