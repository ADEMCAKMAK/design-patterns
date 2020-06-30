import java.util.Objects;

public class TorinoPizzaFactory extends PizzaStoreFactory {
    @Override
    public Pizza createPizza(String type) {
        if (Objects.equals(type, "cheese")){
            System.out.println("torino cheese pizza");
            return new TorinoCheesePizza();
        }
        else if (Objects.equals(type, "clam")){
            System.out.println("torino clam pizza");
            return new TorinoClamPizza();
        }
        else if (Objects.equals(type, "veggie")){
            System.out.println("torino veggie pizza");
            return new TorinoVeggiePizza();
        }
        return null;
    }
}
