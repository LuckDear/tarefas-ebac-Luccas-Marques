public abstract class Carro {
    private int potencia;
    private String combustivel;
    private String cor;


    public Carro(int potencia, String combustivel, String cor) {
        this.potencia = potencia;
        this.combustivel = combustivel;
        this.cor = cor;
    }

    public void iniciarMotor(){
        System.out.println("O motor do " + getClass().getSimpleName() + " foi iniciado e está pronto para utilizar " + potencia + " CV");
    }
    public void limpo(){
        System.out.println("O carro está limpo, e a cor " + cor + " está brilhando");
    }
    public void checarMecanica(){
        System.out.println("A mecanica  do carro foi checada, está tudo certo");
    }
    public void fuelCar(){
        System.out.println("O carro está cheio com " + combustivel.toLowerCase());
    }
}
