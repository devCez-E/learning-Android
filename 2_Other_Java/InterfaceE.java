public class InterfaceE {
    public static void main(String[] args) {
        Animal dog = new Dog("Baduk");
        Animal cat = new Cat("Miho");
        Animal wolf = new Wolf("Awoo");

        dog.Howl();
        cat.Howl();
        wolf.Howl();

        Pet dog1 = new Dog("Baduk");
        Pet cat2 = new Cat("Miho");

        dog1.FoodCall();
        cat2.FoodCall();
    }
}
