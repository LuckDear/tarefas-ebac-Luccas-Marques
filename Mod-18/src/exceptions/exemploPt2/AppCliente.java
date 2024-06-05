package exceptions.exemploPt2;

import javax.swing.*;
import java.util.Scanner;

public class AppCliente {
    public static void main(String[] args) {
        String scan = JOptionPane.showInputDialog(null,"Digite o codigo do cliente: ","insert",JOptionPane.INFORMATION_MESSAGE);

        try {
            ClienteService.consultarCliente(scan);
        } catch (ClienteNaoEncontrado2Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
