package src.heranca.classes;

public class Pessoa {

    //  AO UTILIAR O MODIFICADOR PROTECTED, É POSSÍVEL ACESSAR OS ATRIBUTOS DA CLASSE DIRETAMENTE
    // ESSE ACESSO É PERMITIDO ÀS CLASSES DENTRO DO MESMO PACOTE, OU CLASSES EM OUTROS PACOTES QUE HERDAM DESSA CLASSE
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Cpf: " + this.cpf);
        System.out.println("Rua: " + this.endereco.getRua() + ". Bairro: " + this.endereco.getBairro());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
