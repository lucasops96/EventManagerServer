public class Cliente extends Pessoa{
    
    private String cpf;

    public Cliente(String cpf){
        this.cpf =  cpf;
    }

    public Cliente(String nome, String email, String senha, String telefone, String cpf){
        super(nome, email, senha, telefone);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return getNome()+" [cpf=" + cpf + "]";
    }

    

}
