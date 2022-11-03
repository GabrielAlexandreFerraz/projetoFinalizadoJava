import java.util.ArrayList;
import java.util.List;

public class ListaSupervisor {
    public static List<Supervisor> supervisors = new ArrayList();

    public ListaSupervisor() {
    }

    public static void adicionar(Supervisor supervi) {
        supervisors.add(supervi);
    }

    public static Supervisor retornar(Integer id) {
        return (Supervisor)supervisors.get(id);
    }

    public static List<Supervisor> retornarTodos() {
        return supervisors;
    }
}
