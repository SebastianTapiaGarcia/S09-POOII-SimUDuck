public class DecoyDuck extends Duck{

    public DecoyDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new MuteQuack();
    }
    
    @Override
    public void display(){
        System.out.println("Soy un señuelo!");
    }
}
