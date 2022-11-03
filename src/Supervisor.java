import java.util.ArrayList;
import java.util.List;

public class Supervisor extends Colaborador{
    private static Integer contador = 0;
    private static List<Documento> documentosPendentes = new ArrayList<>();

    public Supervisor(Integer identificador, String nome,String sobreNome, Double dataDeNascimento, Integer cpf, String endereco){
        super( identificador, nome ,sobreNome ,dataDeNascimento, cpf, endereco );
        ListaPessoa.adicionar(this);
    }

    public void adicionarDocumento(Documento documento){
        System.out.println("Documento será aprovado por , nome: " + this.getNome());
        documentosPendentes.add(documento);
    }
    public void pedirAprovacaoDocumento(Integer idAprovador,
                                        Integer idDocumento){
        Gerente aprovador = ListaGerente.retornar(idAprovador);
        aprovador.aprovarDocumento(documentosPendentes.get(idDocumento));

    }
    public List<Documento> getDocumentos() {
        return documentosPendentes;
    }
}
