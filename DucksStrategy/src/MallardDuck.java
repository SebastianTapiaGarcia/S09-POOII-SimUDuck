public class MallardDuck extends Duck{

    public MallardDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }
    
    @Override
    public void display(){
        System.out.println("Soy un pato de verdad!");
    }
}
