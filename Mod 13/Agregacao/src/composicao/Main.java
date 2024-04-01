package composicao;

public class Main {
    public static void main(String[]args) {
        Banco banco = new Banco();
        banco.setNome("Banco marques");
        banco.setCodigo(10l);

        ContaCorrente cc = new ContaCorrente();
        cc.setBanco(banco);
        cc.setSaldo(10d);

        ContaPoupanca cp = new ContaPoupanca();
        cp.setBanco(banco);
        cp.setSaldo(10d);

        banco.add(cc);
        banco.add(cp);

        System.out.println(banco.getNome());

    }
}
