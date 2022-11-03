import java.util.ArrayList;
import java.util.List;

public class ListaGerente {
    public static List<Gerente> gerentes = new ArrayList();

    public ListaGerente() {
    }

    public static void adicionar(Gerente geren) {
        gerentes.add(geren);
    }

    public static Gerente retornar(Integer id) {
        return (Gerente)gerentes.get(id);
    }

    public static List<Gerente> retornarTodos() {
        return gerentes;
    }
}
