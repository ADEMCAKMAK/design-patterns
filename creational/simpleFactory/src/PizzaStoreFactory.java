import java.util.Objects;

public class PizzaStoreFactory {

    Pizza createPizza(String type){

        if (Objects.equals(type, "cheese")){
            System.out.println("cheese pizza");
            return new CheesePizza();
        }
        else if (Objects.equals(type, "clam")){
            System.out.println("clam pizza");
            return new ClamPizza();
        }
        else if (Objects.equals(type, "veggie")){
            System.out.println("veggie pizza");
            return new ClamPizza();
        }
        return null;
    }
}
