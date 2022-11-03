import java.util.ArrayList;
import java.util.List;

public class ListaFuncionario {
    public static List<Funcionario> funcionarios = new ArrayList();

    public ListaFuncionario() {
    }

    public static void adicionar(Funcionario funci) {
        funcionarios.add(funci);
    }

    public static Funcionario retornar(Integer id) {
        return (Funcionario)funcionarios.get(id);
    }

    public static List<Funcionario> retornarTodos() {
        return funcionarios;
    }
}
