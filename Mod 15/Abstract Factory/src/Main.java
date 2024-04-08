public class Main {
    public static void main(String[] args) {

        Customer cliente = new Customer("A", false);
        Fabrica fabrica  = getFabrica(cliente);
        Carro carro = fabrica.criar(cliente.solicitaGrade());
        carro.iniciarMotor();
    }

    private static Fabrica getFabrica(Customer cliente) {
        if (cliente.possuiContrato()){
            return new ContratosFabrica();
        }else {
            return new SemContratosFAbrica();
        }
    }
}