package src.ClassesAbstratas.classes;

// CLASSES ABSTRATAS PODEM TER TANTO MÉTODOS ABSTRATOS QUANTO NÃO ABSTRATOS
public abstract class Funcionario extends Pessoa {

    protected String clt;
    protected double salario;

    public Funcionario() {

    }

    public Funcionario(String nome, String clt, double salario) {
        this.nome = nome;
        this.clt = clt;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", clt='" + clt + '\'' +
                ", salario=" + salario +
                '}';
    }

    // SE HOUVER AO MENOS UM MÉTODO ABSTRATO NA CLASSE, ELA DEVE SER TORNADA ABSTRATA
    // ESSE MÉTODO ABSTRATO DEVE SER SOBRESCRITO OBRIGATORIAMENTE
    public abstract void calculaSalario();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClt() {
        return clt;
    }

    public void setClt(String clt) {
        this.clt = clt;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
