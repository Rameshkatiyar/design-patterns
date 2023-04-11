package decorator;

public class MainTest {
    public static void main(String[] args) {
        //Farmhouse + Mushroom
        PizzaBase pizzaBase = new Mushroom(new FarmhousePizza());
        System.out.println("Farmhouse Cost: "+pizzaBase.cost());

        //VegDelight + Mushroom + ExtraCheese
        PizzaBase pizza = new ExtraCheese(new Mushroom(new VegDelight()));
        System.out.println("VegDelight Cost: "+pizza.cost());
    }
}
