import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Cadastro {

    private static final List<Funcionario> listaFuncionarios = new ArrayList<>();


    public static List<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public static Funcionario buscar(int matricula) {

        for (Funcionario temp : listaFuncionarios) {

         
            if (temp.getMatricula() == matricula) {

                return temp;
            }

        }
       
        return null; 

    }

    public static void excluir(Funcionario f) {
        listaFuncionarios.remove(f);
    }

    public static void cadastrar(Estagiario est) {
        listaFuncionarios.addAll((Collection<? extends Funcionario>) est);
    }
    

    public static void cadastrar(Gerente ger) {
       
    }

    

    public static void cadastrar(Desenvolvedor des) {
        

}
}