public class Wolf extends Animal implements Pet{

    public Wolf(String name) { super(name); }

    @Override
    public void Howl() {
        System.out.println(name + "~~~~~~~~~~~~~~~");
    }

    @Override
    public void FoodCall() {
        System.out.println(name + "~~~~!!");
    }
    
}
