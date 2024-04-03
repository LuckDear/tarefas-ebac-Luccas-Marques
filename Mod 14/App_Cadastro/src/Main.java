import dao.ClienteMapDAO;
import dao.IClienteDAO;
import domain.Cliente;

import javax.swing.*;

public class Main {
    private static IClienteDAO iClienteDAO;

    public static void main(String[] args) {

        iClienteDAO = new ClienteMapDAO();

        String opcao = JOptionPane.showInputDialog(null, "Digite 1 para cadastro, 2 para consultar, 3 para excluir, 4 para alterar, 5 para sair",
                "Cadastro", JOptionPane.INFORMATION_MESSAGE);

        while (!isOpcaoValida(opcao)){
            if ("5".equals(opcao)){
                sair();
            }
            opcao = JOptionPane.showInputDialog(null, "Opção Invalida. \nDigite 1 para cadastro, 2 para consultar, 3 para excluir, 4 para alterar, 5 para sair",
                    "Cadastro", JOptionPane.INFORMATION_MESSAGE);
        }
        while (isOpcaoValida(opcao)){
            if ("5".equals(opcao) || "".equals(opcao)){
                sair();
            } else if (isCadastro(opcao)) {
                String dados = JOptionPane.showInputDialog(null, "Digite os dados do cliente separados por virgula, conforme o exemplo: Nome, CPF, Telefone," +
                                " Endereço, Número Cidade, Estado", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                cadastrar(dados);
            } else if (isConsultar(opcao)) {
                String dados = JOptionPane.showInputDialog(null, "Digite o CPF: ", "Consultar", JOptionPane.INFORMATION_MESSAGE);
                consultar(dados);
            } else if (isExluir(opcao)) {
                String dados = JOptionPane.showInputDialog(null, "Digite o CPF do cliente: ", "Excluir", JOptionPane.INFORMATION_MESSAGE);
                excluir(dados);
            } else if (isAlterar(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite os dados do cliente separados por vígula, conforme exemplo: Nome, CPF, Telefone, Endereço, Número, Cidade e Estado",
                        "Atualização", JOptionPane.INFORMATION_MESSAGE);
                alterar(dados);
            }
            opcao = JOptionPane.showInputDialog(null, "Digite 1 para cadastro, 2 para consultar, 3 para excluir, 4 para alterar, 5 para sair",
                    "Cadastro", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    private static void alterar(String dados) {
        String[] dadosSeparados = dados.split(",");
        Cliente cliente = new Cliente(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6]);
        iClienteDAO.alterar(cliente);
    }

    private static void excluir(String dados) {
        iClienteDAO.excluir(Long.parseLong(dados));
        if (dados != null){
            JOptionPane.showMessageDialog(null, "Cliente Excluido com sucesso", "Excluir", JOptionPane.INFORMATION_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(null, "Cliente Não Encontrado", "Erro", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static boolean isAlterar(String opcao) {
        if ("4".equals(opcao)){
            return true;
        }
        return false;
    }
    private static boolean isExluir(String opcao) {
        if ("3".equals(opcao)){
            return true;
        }
        return false;
    }

    private static void consultar(String dados) {
        Cliente cliente = iClienteDAO.consultar(Long.parseLong(dados));
        if (cliente != null) {

            JOptionPane.showMessageDialog(null, "Cliente Encontrado" + cliente.toString(), "Consultar", JOptionPane.INFORMATION_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(null, "Cliente Não Encontrado", "Erro", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static boolean isConsultar(String opcao){
        if ("2".equals(opcao)){
            return true;
        }
        return false;
    }
    private static void cadastrar(String dados) {
        String[] dadosSeparados = dados.split(",");
        Cliente cliente = new Cliente(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6]);
        Boolean isCadastrado = iClienteDAO.cadastrar(cliente);
        if (isCadastrado){
            JOptionPane.showMessageDialog(null,"Cliente cadastrado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(null,"Cliente ja esta cadastrado", "Erro", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static boolean isCadastro(String opcao) {
        if ("1".equals(opcao)){
            return true;
        }
        return false;
    }

    private static void sair() {
        JOptionPane.showMessageDialog(null, "Até Logo",
                "sair", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
    private static boolean isOpcaoValida(String opcao) {
        if ("1".equals(opcao) || "2".equals(opcao) || "3".equals(opcao) || "4".equals(opcao) || "5".equals(opcao)){
            return true;
        }
        return false;
    }
}