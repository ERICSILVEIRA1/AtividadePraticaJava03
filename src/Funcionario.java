public class Funcionario {

    private int matricula;
    private String nome;
    private String outro;
    private String outra;

    public Funcionario(int matricula, String nome, String outro, int outra) {
        super();
        this.nome = nome;
    }

    

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {

        return "\nMatrícula: " + matricula +
                "\nNome: " + nome;
    }

}