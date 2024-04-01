public class Horista extends Empregado{

    private double precoHora;
    private double horaTrabalhada;

    public double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }

    public double getHoraTrabalhada() {
        return horaTrabalhada;
    }

    public void setHoraTrabalhada(double horaTrabalhada) {
        this.horaTrabalhada = horaTrabalhada;
    }

    @Override
    public double vencimento() {
        return horaTrabalhada*precoHora;
    }
}
