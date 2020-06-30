import java.util.Objects;

public class PalermoPizzaFactory extends PizzaStoreFactory {
    @Override
    public Pizza createPizza(String type) {
        if (Objects.equals(type, "cheese")){
            System.out.println("palermo cheese pizza");
            return new PalermoCheesePizza();
        }
        else if (Objects.equals(type, "clam")){
            System.out.println("palermo clam pizza");
            return new PalermoClamPizza();
        }
        else if (Objects.equals(type, "veggie")){
            System.out.println("palermo veggie pizza");
            return new PalermoVeggiePizza();
        }
        return null;
    }
}
