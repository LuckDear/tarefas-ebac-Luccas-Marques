public class Burger {

    private String pao = "sem pão";
    private String carne = "sem carne";
    private String  salada = "sem salada";
    private String queijo = "sem queijo";
    private String molho = "sem molho";

    public void setPao(String pao) {
        this.pao = pao;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public void setSalada(String salada) {
        this.salada = salada;
    }

    public void setQueijo(String queijo) {
        this.queijo = queijo;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }

    public void print(){
        System.out.println("Hamburger finalizado!" + "\n" + "Pão: " + pao + "\n Carne: " + carne + "\n Salada: " + salada + "\n Queijo: " + queijo + "\n Molho: " + molho);
    }
}
