public abstract class Carros {
    public String modelo;
    public String cor;
    public String ano;

    public Carros(String modelo, String cor, String ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Carros{" +
                "modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", ano='" + ano + '\'' +
                '}';
    }
}
