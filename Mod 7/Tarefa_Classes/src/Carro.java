
public class Carro {
    // Criando variaveis
    private String modelo;
    private int ano;
    private String cor;
    private String marca;

    // Criando getters e setters
    public String getModelo(String modelo) {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno(int ano) {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor(String cor) {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca(String marca) {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // escreve na tela parametros recebidos das variaveis do carro
    public void obterInformacoes() {
        System.out.println("Carro: " + getModelo(modelo) + ", Cor: " + getCor(cor) + ", Ano: " + getAno(ano) + ", marca: " + getMarca(marca));
    }
}
