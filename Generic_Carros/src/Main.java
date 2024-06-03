public class Main {
    public static void main(String[] args) {
        FabricaCarros fab = new FabricaCarros();

        Mercedes car1 = new Mercedes("C180","Prata","2020");
        Mercedes car2 = new Mercedes("A200","Preto","2018");
        Honda car3 = new Honda("CIVIC","Azul","2024");
        Honda car4 = new Honda("HR-V","Vermelho","2014");

        fab.galpao.add(car1);
        fab.galpao.add(car2);
        fab.galpao.add(car3);
        fab.galpao.add(car4);

        fab.printar();

    }
}