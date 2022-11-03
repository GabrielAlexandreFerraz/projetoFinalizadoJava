import java.util.ArrayList;
import java.util.List;

public class Gerente extends Colaborador {
    private static Integer contador = 0;
    private static List<Documento> documentosPendentes = new ArrayList();
    private static List<Documento> arquivados = new ArrayList();

    public Gerente(Integer identificador, String nome, String sobreNome, Double dataDeNascimento, Integer cpf, String endereco) {
        super(identificador, nome, sobreNome, dataDeNascimento, cpf, endereco);
        ListaPessoa.adicionar(this);
    }

    public void adicionarDocumento(Documento documento) {
        documentosPendentes.add(documento);
    }

    public void arquivarDocumento(Documento documento) {
        documento.setEstado("ARQUIVADO");
        arquivados.add(documento);
    }

    public void aprovarDocumento(Documento documento) {
        System.out.println("Documento será aprovado por , nome: " + this.getNome());
        documento.setEstado("ATIVO");
        documentosPendentes.add(documento);
        System.out.println(documentosPendentes);
    }

    public List<Documento> getDocumentos() {
        return documentosPendentes;
    }

    public List<Documento> getDocumentosArquivados() {
        return arquivados;
    }
}
