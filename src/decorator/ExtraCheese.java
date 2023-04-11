package decorator;

public class ExtraCheese extends ToppingDecorator{

    public ExtraCheese(PizzaBase pizzaBase) {
        this.pizzaBase = pizzaBase;
    }

    @Override
    public int cost() {
        return this.pizzaBase.cost() + 10;
    }
}
