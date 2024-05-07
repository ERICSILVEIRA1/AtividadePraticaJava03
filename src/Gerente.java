public class Gerente extends Funcionario {

    private int bonusAnual;

    public Gerente(int matricula, String nome, String equipe, int bonusAnual) {
        super(matricula, nome, equipe, bonusAnual);
        this.bonusAnual = bonusAnual;
    }

    public int bonusAnual() {
        return bonusAnual;
    }

    public void setNomeDoProjeto(int bonusAnual) {
        this.bonusAnual = bonusAnual;
    }

    @Override
    public String toString() {

        return super.toString() +
                "\nBonus Anual: " + bonusAnual;
    }

}
