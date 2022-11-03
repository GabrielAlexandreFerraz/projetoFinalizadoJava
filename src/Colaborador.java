public class Colaborador extends Pessoa {
    public Colaborador(Integer identificador, String nome, String sobreNome, Double dataDeNascimento, Integer cpf, String endereco) {
        super(identificador, nome, sobreNome, dataDeNascimento, cpf, endereco);
        ListaPessoa.adicionar(this);
    }
}