import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Deseja fazer um pedido? 1 - sim; 2 não");
        int pedido = s.nextInt();
        while (pedido == 1){

        System.out.println("Qual hamburger você deseja? \n1 - Cheese Burger \n2 - VeganBurger");
        Integer escolha = s.nextInt();

        if (escolha == 1){
            Hamburger();
        }else if (escolha == 2){
            Vegano();
        } else {
            System.out.println("Opção invalida.");
        }
            System.out.println("Deseja fazer um pedido? 1 - sim; 2 não");
        pedido = s.nextInt();
    }

    }

    private static void Hamburger() {
        RestauranteDiretor diretor = new RestauranteDiretor();
        diretor.setBuilder(new MeatBurger());
        Burger burger = diretor.buildBurger();
        burger.print();
    }

    private static void Vegano() {
        RestauranteDiretor diretor = new RestauranteDiretor();
        diretor.setBuilder(new VeganBurger());
        Burger burger = diretor.buildBurger();
        burger.print();
    }

}