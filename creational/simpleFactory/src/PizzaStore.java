public class PizzaStore {

    /**
     *      encapsulate pizza infos from PizzaStore ;)
     */
    PizzaStoreFactory factory;

    public PizzaStore(PizzaStoreFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type){
        return factory.createPizza(type);
    }
}
