import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static ICarroDAO iCarroDAO;
    private static List carros1 = new ArrayList<>();
    private static List carros2 = new ArrayList<>();

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
                String idStr = JOptionPane.showInputDialog(null, "Digite o ID do carro","Cadastro",JOptionPane.INFORMATION_MESSAGE);
                Long id = Long.parseLong(idStr);
                cadastrar(dados, id);

                Toyota carro = new Toyota(dados,id);
                Honda carro2 = new Honda(dados,id);
                carros1.add(carro);
                carros2.add(carro2);

                System.out.println(carros1);

                System.out.println(carros2);

            } else if (isConsultar(opcao)){
                //Consultar();
                JOptionPane.showMessageDialog(null,carros1.toString());
            }else if (isExcluir(opcao)){
                Excluir();
            }
            opcao = JOptionPane.showInputDialog(null, "Digite 1 para adicionar um novo modelo, 2 para consultar, 3 para excluir, 4 para sair", "inicio programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void Excluir() {
        String excluiStr = JOptionPane.showInputDialog(null, "Digite a ID do carro que deseja excluir: ","Excluir",JOptionPane.INFORMATION_MESSAGE);
        Long excluir = Long.parseLong(excluiStr);
        Carros carros = iCarroDAO.excluir(excluir);
        if (carros != null){
            carros1.removeIf(carros1 -> carros.getId().equals(excluir));
            carros2.removeIf(carros2 -> carros.getId().equals(excluir));
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

    private static void Consultar() {
        String consultaStr = JOptionPane.showInputDialog(null, "Digite o ID do carro: ","Consultar",JOptionPane.INFORMATION_MESSAGE);
        Long consulta = Long.parseLong(consultaStr);
        Carros carros = iCarroDAO.consultar(consulta);
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

    private static void cadastrar(String dados, Long id) {

        Carros carros = new Carros(dados, id);
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