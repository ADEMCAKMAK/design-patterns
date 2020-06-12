public class MallardDuck extends Duck {

    public MallardDuck() {
        this.setFlyBehavior(new FlyWithWings());
        this.setQuackBehavior(new Squeak());
    }
}
