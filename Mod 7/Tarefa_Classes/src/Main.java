/**
 * @author Luccas Marques
 */
public class Main {
    public static void main(String[] args) {
        // instancia propriedades da classe Carro
        Carro carro = new Carro();
        carro.setAno(2010);
        carro.setCor("preto");
        carro.setMarca("Honda");
        carro.setModelo("CR-V");
        // chama função de escrita na tela da classe Carro
        carro.obterInformacoes();
    }

}