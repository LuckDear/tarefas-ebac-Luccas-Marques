public class Main {
    public static void main(String[] args) {

        pessoaJuridica();
        pessoaFisica();

    }

    private static void pessoaFisica() {
        PessoaFisica pf = new PessoaFisica();
        pf.setNome("Luccas");
        pf.setSobrenome("Marques");
        pf.setCpf("30");

        imprimePf(pf);
    }

    private static void imprimePf(PessoaFisica pessoa) {
        System.out.println("Nome : " + pessoa.getNome() + " " + pessoa.getSobrenome() + " CPF: " + pessoa.getCpf());
    }

    private static void pessoaJuridica() {
        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome("Kleber");
        pj.setSobrenome("Souza");
        pj.setCnpj("10");

        imprimePj(pj);
    }

    private static void imprimePj(PessoaJuridica pessoa) {
        System.out.println("Nome : " + pessoa.getNome() + " " + pessoa.getSobrenome() + " CNPJ: " + pessoa.getCnpj());
    }
}