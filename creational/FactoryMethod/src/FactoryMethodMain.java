/**
 * A factory method handles object creation and encapsulates it in
 * a subclass. This decouples the client code in the superclass from
 * the object creation code in the subclass.
 */

public class FactoryMethodMain {

    public static void main(String[] args) {

        PalermoPizzaStore palermoPizzaStore = new PalermoPizzaStore();

        TorinoPizzaStore torinoPizzaStore = new TorinoPizzaStore();

        palermoPizzaStore.orderPizza("cheese");

        torinoPizzaStore.orderPizza("cheese");
    }

}
