package decorator;

public class Mushroom extends ToppingDecorator{

    public Mushroom(PizzaBase pizzaBase) {
        this.pizzaBase = pizzaBase;
    }

    @Override
    public int cost() {
        return pizzaBase.cost() + 20;
    }
}
