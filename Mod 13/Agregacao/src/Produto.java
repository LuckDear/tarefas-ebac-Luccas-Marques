public class Produto {
    private Double preco;
    private String nome;
    private Long codigo;

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = Long.valueOf(codigo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void vendido(){
        System.out.println("Vendido");
    }
}
