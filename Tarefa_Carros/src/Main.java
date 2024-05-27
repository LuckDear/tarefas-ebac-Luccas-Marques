import javax.swing.*;

public class Main {

    private static ICarroDAO iCarroDAO;

    public static void main(String[] args) {
        iCarroDAO = new CarroMapDAO();

        String opcao = JOptionPane.showInputDialog(null, "Digite 1 para adicionar um novo modelo, 2 para consultar, 3 para excluir, 4 para sair", "inicio programa", JOptionPane.INFORMATION_MESSAGE);

        while (!isOpcaoValida(opcao)){
            if ("".equals(opcao)){
                sair();
            }
        }
        while (isOpcaoValida(opcao)){
            if (isOpcaoSair(opcao)){
                sair();
            }else if (isCadastrado(opcao)){
                String dados = JOptionPane.showInputDialog(null,"Digite o modelo do carro: ", "cadastro", JOptionPane.INFORMATION_MESSAGE);
                cadastrar(dados);
            } else if (isConsultar(opcao)){
                String dados = JOptionPane.showInputDialog(null,"Digite o nome do carro: ","Teste",JOptionPane.INFORMATION_MESSAGE);
                Consultar(dados);
            }else if (isExcluir(opcao)){
                String dados = JOptionPane.showInputDialog(null,"Digite o nome do carro que deseja excluir: ","Excluir",JOptionPane.INFORMATION_MESSAGE);
                Excluir(dados);
            }
            opcao = JOptionPane.showInputDialog(null, "Digite 1 para adicionar um novo modelo, 2 para consultar, 3 para excluir, 4 para sair", "inicio programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void Excluir(String dados) {
        Carros carros = iCarroDAO.excluir(dados);
        if (carros != null){
            JOptionPane.showMessageDialog(null, "Carro excluido com sucesso!","Sucesso",JOptionPane.INFORMATION_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(null, "Carro não encontrado!","Erro",JOptionPane.INFORMATION_MESSAGE);
        }

    }

    private static boolean isExcluir(String opcao) {
        if ("3".equals(opcao)){
            return true;
        }
        return false;
    }

    private static boolean isOpcaoSair(String opcao) {
        if ("4".equals(opcao)){
            return true;
        }
        return false;
    }

    private static void Consultar(String dados) {
        Carros carros = iCarroDAO.consultar(dados);
        if (carros != null){
            JOptionPane.showMessageDialog(null,"Carro encontrado: " + carros.toString(),"Sucesso",JOptionPane.INFORMATION_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(null,"Carro não encontrado!","Erro",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static boolean isConsultar(String opcao) {
        if ("2".equals(opcao)){
            return true;
        }
        return false;
    }

    private static void cadastrar(String dados) {
        Carros carros = new Carros(dados);
        Boolean isCadastrado = iCarroDAO.cadastrar(carros);
        if (isCadastrado){
            JOptionPane.showMessageDialog(null, "Carro cadastrado com sucesso!","Sucesso",JOptionPane.INFORMATION_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(null, "Carro ja esta cadastrado!","Erro",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static boolean isCadastrado( String opcao){
        if ("1".equals(opcao)){
            return true;
        }
        return false;
    }

    private static void sair() {
        JOptionPane.showMessageDialog(null, "O progama será fechado!", "sair",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    private static boolean isOpcaoValida(String opcao) {
        if ("1".equals(opcao) || "2".equals(opcao) || "3".equals(opcao)
        || "4".equals(opcao) || "5".equals(opcao)) {
            return true;
        }
        return false;
    }
}