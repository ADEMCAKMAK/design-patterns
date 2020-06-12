public class DecoyDuck extends Duck {

    public DecoyDuck() {
        this.setFlyBehavior(new FlyNoWay());
        this.setQuackBehavior(new MuteQuack());
    }

}
