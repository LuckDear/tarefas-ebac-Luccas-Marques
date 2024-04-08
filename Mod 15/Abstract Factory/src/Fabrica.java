public abstract class Fabrica {
    public Carro criar(String solicitaGrade){
        Carro carro = recuperaCarro(solicitaGrade);
        carro = preparaCarro(carro);
        return carro;
    }

    private Carro preparaCarro( Carro carro){
        carro.limpo();
        carro.checarMecanica();
        carro.fuelCar();
        return carro;
    }
    abstract Carro recuperaCarro(String solicitaGrade);
}
