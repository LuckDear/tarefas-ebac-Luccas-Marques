public class Main {
    public static void main(String[] args) {

        assalariado();
        comissionado();
        horista();

    }

    public static void assalariado(){
        Assalariado empregado = new Assalariado();
        empregado.setCpf("1");
        empregado.setNome("Luccas");
        empregado.setSobrenome("Marques");
        empregado.setSalario(3000d);
        imprimirFuncionario(empregado);
    }

    public static void comissionado(){
        Comissionado comissionado = new Comissionado();
        comissionado.setCpf("2");
        comissionado.setNome("Luccas2");
        comissionado.setSobrenome("Marques");
        comissionado.setTotalVenda(2000d);
        comissionado.setTotalComissao(0.1d);
        imprimirFuncionario(comissionado);
    }

    public static void horista(){
        Horista horista = new Horista();
        horista.setCpf("3");
        horista.setNome("Luccas3");
        horista.setSobrenome("Marques");
        horista.setPrecoHora(200d);
        horista.setHoraTrabalhada(48d);
        imprimirFuncionario(horista);
    }

    public static void imprimirFuncionario(Empregado funcionario){
        System.out.println(funcionario.getNome() + " tem salario: " + funcionario.vencimento());
    }
}