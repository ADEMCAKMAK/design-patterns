public class RubberDuck extends Duck {

    public RubberDuck() {
        this.setFlyBehavior(new FlyNoWay());
        this.setQuackBehavior(new MuteQuack());
    }
}
