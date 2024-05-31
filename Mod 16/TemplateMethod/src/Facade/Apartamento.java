package Facade;

public class Apartamento {
    private Long codigo;
    private String endereco;

    public Apartamento(Long cod, String end) {
        this.codigo = cod;
        this.endereco = end;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
