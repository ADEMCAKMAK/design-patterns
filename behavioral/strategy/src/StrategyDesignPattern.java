public class StrategyDesignPattern {

    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new DefaultDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
        model.setFlyBehavior(new FlyNoWay());
        model.performFly();
    }
}
