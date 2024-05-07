public class Estagiario extends Funcionario {

   
    private int horasTrabalho;

    public Estagiario(int matricula, String nome, String supervisor, int horasTrabalho) {
        super(matricula, nome, supervisor, horasTrabalho);
        this.horasTrabalho = horasTrabalho;
    }

    public int getHorasTrabalho() {
        return horasTrabalho;
    }

    public void setHorasTrabalho(int horasTrabalho) {
        this.horasTrabalho = horasTrabalho;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nHoras Trabalho: " + horasTrabalho + "\n";
    }
}
