public class Documento {
    private Integer idetificador;
    private String colaboradorResposavel;
    private String colaboradorCriador;
    private String link;
    private static Integer contador = 0;
    private String estado = " ";

    public Documento(String colaboradorResposavel, String colaboradorCriador, String link) {
        Integer var4 = contador;
        contador = contador + 1;
        this.idetificador = var4;
        this.colaboradorResposavel = colaboradorResposavel;
        this.colaboradorCriador = colaboradorCriador;
        this.link = link;
        this.estado = this.estado;
    }

    public Integer getIdetificador() {
        return this.idetificador;
    }

    public void setIdetificador(Integer idetificador) {
        this.idetificador = idetificador;
    }

    public String getColaboradorResposavel(String colaborador) {
        return this.colaboradorResposavel;
    }

    public void setColaboradorResposavel(String colaboradorResposavel) {
        this.colaboradorResposavel = colaboradorResposavel;
    }

    public String getColaboradorCriador() {
        return this.colaboradorCriador;
    }

    public void setColaboradorCriador(String colaboradorCriador) {
        this.colaboradorCriador = colaboradorCriador;
    }

    public String getLink() {
        return this.link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public static Integer getContador() {
        return contador;
    }

    public static void setContador(Integer contador) {
        Documento.contador = contador;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return this.estado;
    }

    public String toString() {
        return "Documento{idetificador=" + this.idetificador + ", colaboradorResposavel='" + this.colaboradorResposavel + "', colaboradorCriador='" + this.colaboradorCriador + "', link='" + this.link + "', estado='" + this.estado + "'}";
    }
}