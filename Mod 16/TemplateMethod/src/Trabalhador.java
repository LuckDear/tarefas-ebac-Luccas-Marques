public abstract class Trabalhador {

    public void executarRotina(){
        iniciarRotina();
        levantar();
        irAoTrabalho();
        trabalhar();
        voltarPraCasa();
    }

    protected abstract void trabalhar();

    private void voltarPraCasa() {
        System.out.println("Voltando pra casa");
    }

    private void irAoTrabalho() {
        System.out.println("Indo trabalhar");
    }

    private void levantar() {
        System.out.println("Levantando da cama");
    }

    private void iniciarRotina() {
        System.out.println("Iniciando rotina");
    }
}
