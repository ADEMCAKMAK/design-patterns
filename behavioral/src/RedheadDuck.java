public class RedheadDuck extends Duck {

    public RedheadDuck() {
        this.setFlyBehavior(new FlyWithWings());
        this.setQuackBehavior(new Squeak());
    }
}
