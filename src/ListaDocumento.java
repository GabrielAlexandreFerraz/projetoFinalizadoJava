import java.util.List;

public class ListaDocumento {
    public ListaDocumento() {
    }

    public static void adicionar(Documento documento, Funcionario funcionario) {
        Funcionario.adicionarDocumento(documento);
        System.out.println("Documento criado por funcionário:");
        System.out.println(funcionario.getDocumentos());
    }

    public static List<Documento> retornarTodos(Funcionario funcionario) {
        return funcionario.getDocumentos();
    }

    public static void adicionarDocumentoPendente(Documento documento, Supervisor aprovador) {
        aprovador.adicionarDocumento(documento);
        System.out.println("Documentos a serem aprovados:");
        System.out.println(aprovador.getDocumentos());
    }

    public static void adicionarDocumentoPreAprovados(Documento documento, Gerente aprovador) {
        aprovador.adicionarDocumento(documento);
        System.out.println("Documentos a serem aprovados:");
        System.out.println(aprovador.getDocumentos());
    }
}