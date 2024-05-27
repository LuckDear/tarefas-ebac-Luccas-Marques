import java.util.Objects;

public class Carros implements IPersistente {

    private String nome;

    public Carros(String nome){
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carros carros = (Carros) o;
        return Objects.equals(nome, carros.nome);
    }
    @Override
    public Long getCodigo() {
        return Long.valueOf(this.nome);
    }
}
