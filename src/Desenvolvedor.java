public class Desenvolvedor extends Funcionario {

    
    private String tecnologias;

    public Desenvolvedor(int matricula, String nome, String tecnologias, int salario) {
        super(matricula, nome, tecnologias, salario);
        this.tecnologias = tecnologias;
    }

    public String getTecnologias() {
        return tecnologias;
    }

    public void setTecnologias(String tecnologias) {
        this.tecnologias = tecnologias;
    }

    @Override
    public String toString() {

        return super.toString() +
                "\nTecnologias que domina: " + tecnologias;
    }

}
