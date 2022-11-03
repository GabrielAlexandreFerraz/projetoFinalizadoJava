import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Colaborador {
    private static List<Documento> documentos = new ArrayList();
    private static List<Documento> documentosRevisao = new ArrayList();

    public Funcionario(Integer identificador, String nome, String sobreNome, Double dataDeNascimento, Integer cpf, String endereco) {
        super(identificador, nome, sobreNome, dataDeNascimento, cpf, endereco);
        ListaPessoa.adicionar(this);
    }

    public static void adicionarDocumento(Documento documento) {
        documentos.add(documento);
    }

    public static void revisarDocumento(Documento documento) {
        documentosRevisao.add(documento);
    }

    public void pedirRevisaoDocumento(Integer idAprovador, Integer idDocumento) {
        try {
            Supervisor aprovador = ListaSupervisor.retornar(idAprovador);
            Documento documento = (Documento)documentos.get(idDocumento);
            documento.setColaboradorResposavel(aprovador.getNome());
            ListaDocumento.adicionarDocumentoPendente(documento, aprovador);
        } catch (Exception var5) {
            throw var5;
        }
    }

    public List<Documento> getDocumentos() {
        return documentos;
    }
}