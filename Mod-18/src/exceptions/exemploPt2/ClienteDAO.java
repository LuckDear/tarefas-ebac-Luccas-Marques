package exceptions.exemploPt2;

public class ClienteDAO {
    public static void consultarCliente(String codigo) throws ClienteNaoEncontradoException {
        boolean isCadastrado =false;

        if (!isCadastrado){
            throw new ClienteNaoEncontradoException("Cliente não foi encontrado");
        }
    }
}
