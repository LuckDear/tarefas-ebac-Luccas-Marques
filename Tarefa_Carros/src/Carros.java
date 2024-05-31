import java.util.Objects;

public class Carros implements IPersistente {

    private String nome;
    private Long id;

    public Carros(String nome, Long id){
        this.nome = nome;
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carros carros = (Carros) o;
        return Objects.equals(id, carros.id);
    }
    @Override
    public Long getCodigo() {
            return id;
        }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Carros{" + "id=" + id + ", nome='" + nome + '\'' + '}';
    }
}
