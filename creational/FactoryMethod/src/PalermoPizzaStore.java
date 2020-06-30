public class PalermoPizzaStore extends PizzaStore {

    public PalermoPizzaStore() {
        super(new PalermoPizzaFactory());
    }

    public PalermoPizzaStore(PizzaStoreFactory factory) {
        super(factory);
    }

}
