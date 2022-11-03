public abstract class Pessoa {
    private Integer identificador;
    private String nome;
    private String sobreNome;
    private Double dataDeNascimento;
    private Integer cpf;
    private String endereco;
    private static Integer contador = 0;

    public Pessoa(Integer identificador, String nome, String sobreNome, Double dataDeNascimento, Integer cpf, String endereco) {
        Integer var7 = contador;
        contador = contador + 1;
        this.identificador = var7;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.dataDeNascimento = dataDeNascimento;
        this.cpf = cpf;
        this.endereco = endereco;
        ListaPessoa.adicionar(this);
    }

    public Integer getIdentificador() {
        return this.identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return this.sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public Double getDataDeNascimento() {
        return this.dataDeNascimento;
    }

    public void setDataDeNascimento(Double dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Integer getCpf() {
        return this.cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public static Integer getContador() {
        return contador;
    }

    public static void setContador(Integer contador) {
        Pessoa.contador = contador;
    }

    public String toString() {
        return "Pessoa{identificador=" + this.identificador + ", nome='" + this.nome + "', sobreNome='" + this.sobreNome + "', dataDeNascimento=" + this.dataDeNascimento + ", cpf=" + this.cpf + ", endereco='" + this.endereco + "'}";
    }
}