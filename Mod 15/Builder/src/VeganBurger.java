public class VeganBurger extends BurgerBuilder{
    @Override
    void buildBun() {
        burger.setPao("Pão Vegano");
    }

    @Override
    void buildMeat() {
        burger.setCarne("Carne Vegana");
    }

    @Override
    void buildSalad() {
        burger.setSalada("Alface");
    }

    @Override
    void buildCheese() {
        burger.setQueijo("Queijo Americano");
    }

    @Override
    void buildSauce() {
        burger.setMolho("Molho especial");
    }
}
