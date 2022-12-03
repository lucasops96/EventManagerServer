public class Promotor extends Pessoa{
    private String cnpj;
    private Endereco endereco;
    private GerenciarEventos meusEventos;

    public Promotor(String cnpj, Endereco endereco){
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.meusEventos = new GerenciarEventos();
    }

    public Promotor(String nome, String email, String senha, String telefone, String cnpj, Endereco endereco ){
        super(nome, email, senha, telefone);
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.meusEventos = new GerenciarEventos();
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public GerenciarEventos getMeusEventos() {
        return meusEventos;
    }

    public void setMeusEventos(GerenciarEventos meusEventos) {
        this.meusEventos = meusEventos;
    }
    

    @Override
    public String toString() {
        return getNome()+" cnpj=" + cnpj + "\n"+ meusEventos;
    }

    
}
