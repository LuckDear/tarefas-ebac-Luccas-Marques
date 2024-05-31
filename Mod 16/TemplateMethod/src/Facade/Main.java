package Facade;

public class Main {
    public static void main(String[] args) {

        IApartamentoService service = new ApartamentoService();
        service.cadastrarApartamento(new Apartamento(1L,"End"));
    }
}
