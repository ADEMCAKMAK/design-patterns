import java.util.Objects;

public abstract class Duck {

    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;

    public void swim(){
        System.out.println("swimming ...");
    };
    public void display(){
        System.out.println("displaying ...");
    };
    public void performFly(){
        if(Objects.isNull(flyBehavior))
            flyBehavior = new DefaultFly();
        flyBehavior.fly();
    };
    public void performQuack(){
        if(Objects.isNull(quackBehavior))
            quackBehavior = new DefaultQuack();
        quackBehavior.quack();
    };

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
