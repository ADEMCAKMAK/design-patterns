public class TorinoPizzaStore extends PizzaStore {

    public TorinoPizzaStore() {
        super(new TorinoPizzaFactory());
    }

    public TorinoPizzaStore(PizzaStoreFactory factory) {
        super(factory);
    }
}
