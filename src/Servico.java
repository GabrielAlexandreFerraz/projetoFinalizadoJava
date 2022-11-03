import java.util.Scanner;

public class Servico {
    public Servico() {
    }

    public int validarCargo() {
        Scanner scannerNavegacao = new Scanner(System.in);
        System.out.println("Qual seu cargo na Empresa? digit 1 Funcionário digite 2 Supervisor digite 3 Gerente");
        return scannerNavegacao.nextInt();
    }

    public void funcaoFuncionario(Funcionario funcionario) {
        Scanner scannerNavegacao = new Scanner(System.in);
        System.out.print("Bem vindo ");
        System.out.println(funcionario.getNome());
        System.out.println("Qual operacao você deseja realizar: \n 1 - Criar Documento;\n 2 - Pedir revisão de Documento;\n 3 - Vizualisar seus Documentos.\n Entre a opção escolhida:");
        int operacao = scannerNavegacao.nextInt();
        switch (operacao) {
            case 1:
                this.criarDocumentoTela(funcionario);
                break;
            case 2:
                this.pedirRevisao(funcionario);
                break;
            case 3:
                System.out.println(ListaDocumento.retornarTodos(funcionario));
        }

    }

    public void funcaoSupervisor(Supervisor supervisor) {
        Scanner scannerNavegacao = new Scanner(System.in);
        System.out.print("Bem vindo ");
        System.out.println(supervisor.getNome());
        System.out.println("Qual operacao você deseja realizar: \n 1 - Vizualisar seus Documentos;\n 2 - Tramitar de Documento;\n 3 - Pedir Revisao do Documento.\n Entre a opção escolhida:");
        int operacao = scannerNavegacao.nextInt();
        switch (operacao) {
            case 1:
                System.out.println(supervisor.getDocumentos());
                break;
            case 2:
                this.preAprovacao(supervisor);
                break;
            case 3:
                this.revisar(supervisor);
        }

    }

    public void funcaoGerente(Gerente gerente) {
        Scanner scannerNavegacao = new Scanner(System.in);
        System.out.print("Bem vindo ");
        System.out.println(gerente.getNome());
        System.out.println("Qual operacao você deseja realizar: \n 1 - Vizualisar seus Documentos;\n 2 - Aprovar Documento;\n 3 - Arquivar Documento;\n 4 - Vizualisar todos os Documentos.\n 5 - Listar Documentos.\n Entre a opção escolhida:");
        int operacao = scannerNavegacao.nextInt();
        switch (operacao) {
            case 1:
                System.out.println(gerente.getDocumentos());
                break;
            case 2:
                this.aprovar(gerente);
                break;
            case 3:
                this.arquivar(gerente);
                break;
            case 4:
                System.out.println("Aprovados:");
                System.out.println(gerente.getDocumentos());
                System.out.println("Arquivados:");
                System.out.println(gerente.getDocumentosArquivados());
                break;
            case 5:
                this.listar();
        }

    }

    public void criarDocumentoTela(Funcionario funcionario) {
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Qual é o link do Documento");
        String link = scanner2.nextLine();
        Documento documento = new Documento(" ", funcionario.getNome(), link);
        ListaDocumento.adicionar(documento, funcionario);
    }

    public void pedirRevisao(Funcionario usuarioFuncionario) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o identificador do Aprovador:");
        Integer idAprovador = scanner.nextInt();
        System.out.println("Qual é o identificador do Documento:");
        Integer idDocumento = scanner.nextInt();
        usuarioFuncionario.pedirRevisaoDocumento(idAprovador, idDocumento);
    }

    public void preAprovacao(Supervisor supervisor) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o identificador do Documento:");
        int idDocumento = scanner.nextInt();
        System.out.println("Qual é o identificador do Aprovador:");
        Integer idAprovador = scanner.nextInt();
        supervisor.pedirAprovacaoDocumento(idAprovador, idDocumento);
    }

    public void revisar(Supervisor supervisor) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o identificador do Criador:");
        Integer idCriador = scanner.nextInt();
        Funcionario funcionario = ListaFuncionario.retornar(idCriador);
        System.out.println("Qual é o identificador do Documento:");
        int idDocumento = scanner.nextInt();
        Documento documento = (Documento)supervisor.getDocumentos().get(idDocumento);
        Funcionario.revisarDocumento(documento);
    }

    public void aprovar(Gerente gerente) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o identificador do Documento:");
        int idDocumento = scanner.nextInt();
        Documento documento = (Documento)gerente.getDocumentos().get(idDocumento);
        gerente.aprovarDocumento(documento);
    }

    public void arquivar(Gerente gerente) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o identificador do Documento:");
        int idDocumento = scanner.nextInt();
        Documento documento = (Documento)gerente.getDocumentos().get(idDocumento);
        gerente.arquivarDocumento(documento);
    }

    public void listar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual lista de documentos?: \n 1 - Cadastrados;\n 2 - Pre-aprovados;\n 3 - Aprovados;\n 4 - Arquivados.\n Entre a opção escolhida:");
        int n = scanner.nextInt();
        System.out.println("Qual ID do responsável?");
        int identificador = scanner.nextInt();
        System.out.println("Qual é o identificador do Documento:");
        int idDocumento = scanner.nextInt();
        Documento documento;
        switch (n) {
            case 1:
                Funcionario funcionario = ListaFuncionario.retornar(identificador);
                documento = (Documento)funcionario.getDocumentos().get(idDocumento);
                System.out.println(documento);
                break;
            case 2:
                Supervisor supervisor = ListaSupervisor.retornar(identificador);
                documento = (Documento)supervisor.getDocumentos().get(idDocumento);
                System.out.println(documento);
                break;
            case 3:
                Gerente gerente = ListaGerente.retornar(identificador);
                documento = (Documento)gerente.getDocumentos().get(idDocumento);
                System.out.println(documento);
        }

    }
}