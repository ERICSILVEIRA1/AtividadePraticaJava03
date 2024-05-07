public class Sistema {

    private static void exibirMenu() {

        System.out.println("\nFUNCIONARIO SYSTEM");
        System.out.println("1) Cadastrar Desenvolvedor");
        System.out.println("2) Cadastrar Gerente");
        System.out.println("3) Cadastrar Estagiario");
        System.out.println("4) Procurar Funcionario");
        System.out.println("5) Listar Todos");
        System.out.println("6) Excluir Funcionário");
        System.out.println("0) Sair");
        System.out.print("Informe uma opcao: ");

    }

    private static void cadastrarDesenvolvedor() {

        System.out.println("\nNovo Desenvolvedor:");
        System.out.print("Matrícula: ");
        int matricula = Console.lerInt();

        System.out.print("Nome: ");
        String nome = Console.lerString();

        System.out.print("Tecnologias que domina:");

        String tecnologias = null;
        int salario = 0;
        Desenvolvedor des = new Desenvolvedor(matricula, nome, tecnologias, salario);

        Cadastro.cadastrar(des);

        System.out.println("\nProgramador cadastrado com sucesso!");

    }

    private static void cadastrarGerente() {

        System.out.println("\nNovo Gerente:");

        System.out.print("Matrícula: ");
        int matricula = Console.lerInt();

        System.out.print("Nome: ");
        String nome = Console.lerString();

        System.out.print("Bonus Anual: ");
        int bonusAnual = Console.lerInt();

        System.out.print("Equipe que gerencia:");
        String equipe = Console.lerString();

      
        Gerente ger = new Gerente(matricula, nome, equipe, bonusAnual);

        Cadastro.cadastrar(ger);

        System.out.println("\nGerente cadastrado com sucesso!");

    }

    private static void cadastrarEstagiario() {

        System.out.println("\nNovo Estagiario:");

        System.out.print("Matrícula: ");
        int matricula = Console.lerInt();

        System.out.print("Nome: ");
        String nome = Console.lerString();

        System.out.print("horasTrabalho:");
        int horasTrabalho = Console.lerInt();

        System.out.print("Supervisor: ");
        String supervisor = Console.lerString();

        Estagiario est = new Estagiario(matricula, nome, supervisor, horasTrabalho);

        Cadastro.cadastrar(est);

        System.out.println("\nGerente cadastrado com sucesso!");
    }

    private static void procurarFuncionario() {

        System.out.println("\nProcurar Funcionario:");

        System.out.print("Matrícula: ");
        int matricula = Console.lerInt();

        Funcionario f = Cadastro.buscar(matricula);

        if (f != null) {

            System.out.println("\nFuncionario Localizado:");
            System.out.println(f.toString());
            return;

        }

        System.out.println("\nFuncionario " + matricula + " não foi encontrado");

    }

    private static void listarFuncionarios() {

        System.out.println("\nTodos os funcionarios Cadastrados:");

        // Se o tamanho da lista for igual a 0 (zero)
        if (Cadastro.getListaFuncionarios().isEmpty()) {

            System.out.println("\nNão há fucionarios cadastrados...");
            return; // finaliza o método

        }

        // caso contrário, percorre a lista e msotra os funcionarios um a um
        for (Funcionario temp : Cadastro.getListaFuncionarios()) {

            System.out.println(temp.toString());

        }
    }

    private static void excluirFuncionario() {

        System.out.print("\nInforme a matricula do func. que deseja excluir: ");
        int matricula = Console.lerInt();

        Funcionario f2 = Cadastro.buscar(matricula);

        if (f2 == null) {
            System.out.println("\nFuncionario " + matricula + " não foi encontrado");
            return;
        }

        Cadastro.excluir(f2);

        System.out.println("\nFuncionario excluído com sucesso!");

    }

    public class Salario {
        public double calcularSalarioTotal() {
            double salarioBruto = calcularSalarioBase() + calcularHorasExtras() + calcularBonus();
            double salarioLiquido = salarioBruto - calcularDeducoes();
            return salarioLiquido + calcularBeneficios();
        }
    
        private double calcularBeneficios() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'calcularBeneficios'");
        }
    
        private double calcularDeducoes() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'calcularDeducoes'");
        }
    
        private int calcularSalarioBase() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'calcularSalarioBase'");
        }
    
        private int calcularHorasExtras() {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    
        private int calcularBonus() {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }

    private static void verificarOpcao(int op) {

        switch (op) {
            case 1:

                cadastrarDesenvolvedor();

                break;

            case 2:

                cadastrarGerente();

                break;

            case 3:

                cadastrarEstagiario();

                break;
            

            case 4:

                procurarFuncionario();

                break;
            

            case 5:

                listarFuncionarios();

                break;

            case 6:

                excluirFuncionario();

                break;

            case 0:

                System.out.println("\nO programa foi finalizado...");
                break;

            default:

                System.out.println("\nOpção invalida. Digite novamente.");
                break;
        }

    }

    private static void calcularSalario() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularSalario'");
    }

    public static void executar() {

        int op;
        do {

            exibirMenu();
            op = Console.lerInt();
            verificarOpcao(op);

        } while (op != 0);

    }

}