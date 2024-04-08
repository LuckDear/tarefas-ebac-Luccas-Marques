public class MeatBurger extends BurgerBuilder {
    @Override
    void buildBun() {
        burger.setPao("Pão de Brioche");
    }

    @Override
    void buildMeat() {
    burger.setCarne("Carne Bovina");
    }

    @Override
    void buildSalad() {
        burger.setSalada("Alface");
    }

    @Override
    void buildCheese() {
        burger.setQueijo("Queijo Cheddar");
    }

    @Override
    void buildSauce() {
        burger.setMolho("Molho Especial");
    }
}
