public class RestauranteDiretor {
    BurgerBuilder builder;

    public void setBuilder(BurgerBuilder builder) {
        this.builder = builder;
    }

   // public RestauranteDiretor(BurgerBuilder builder){
     //   this.builder = builder;
    //}

    public Burger buildBurger(){
        builder.buildBun();
        builder.buildMeat();
        builder.buildSalad();
        builder.buildCheese();
        builder.buildSauce();
        return builder.build();
    }
}
