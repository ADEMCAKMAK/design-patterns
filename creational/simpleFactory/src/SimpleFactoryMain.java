public class SimpleFactoryMain {

    public static void main(String[] args) {

        PizzaStoreFactory factory = new PizzaStoreFactory();

        PizzaStore pizzaStore = new PizzaStore(factory);

        Pizza cheesePizza = pizzaStore.orderPizza("cheese");
        Pizza clamPizza = pizzaStore.orderPizza("clam");

    }
}
