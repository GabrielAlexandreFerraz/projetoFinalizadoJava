import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ListaFuncionario.adicionar(new Funcionario(0, "Gabriel",
                "Alexandre", 31.10, 123456789, "Rua 123456"));
        ListaSupervisor.adicionar(new Supervisor(0, "SupervisorGabriel", "Alexandre",
                31.10, 123456789, "Rua 456789123"));
        ListaGerente.adicionar(new Gerente(0, "GerenteGabriel", "Alexandre",
                31.10, 123456789, "Rua 987654321"));

        Servico servico = new Servico();
        Scanner scannerNavegacao = new Scanner(System.in);
        boolean termina = true;
        while (termina) {
            boolean executa = true;
            int id = servico.validarCargo();
            while (executa) {

                switch (id) {
                    case 1 -> {
                        System.out.println("Qual seu ID?");
                        int identificador = scannerNavegacao.nextInt();
                        try {
                            Funcionario funcionario = ListaFuncionario.retornar(identificador);
                            servico.funcaoFuncionario(funcionario);
                        } catch (Exception e) {
                            System.out.println("Invalid ID.");
                        }
                    }
                    case 2 -> {
                        System.out.println("Qual seu ID?");
                        int identificador = scannerNavegacao.nextInt();
                        try {
                            Supervisor supervisor = ListaSupervisor.retornar(identificador);
                            servico.funcaoSupervisor(supervisor);
                        } catch (Exception e) {
                            System.out.println("Invalid ID.");
                        }
                    }
                    case 3 -> {
                        System.out.println("Qual seu ID?");
                        int identificador = scannerNavegacao.nextInt();
                        try {
                            Gerente gerente = ListaGerente.retornar(identificador);
                            servico.funcaoGerente(gerente);
                        } catch (Exception e) {
                            System.out.println("Invalid ID.");
                        }
                    }
                }

                System.out.print("""
                            Deseja trocar de cargo?\s
                             1 - Sim
                             2 - Não
                             Entre a opção escolhida:""");

                int encerrar = scannerNavegacao.nextInt();

                switch (encerrar) {
                    case 1 -> executa = false;
                    case 2 -> {
                    }
                }


            }
            System.out.print("""
                        Deseja Encerrar?\s
                         1 - Sim
                         2 - Não
                         Entre a opção escolhida:""");

            int fim = scannerNavegacao.nextInt();

            switch (fim) {
                case 1 -> termina = false;
                case 2 -> {
                }
            }
        }
    }
}