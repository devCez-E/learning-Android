public class PlayerC extends Character {

    public PlayerC(String name, int hp, int attack) {
        super(name, hp, attack);
        //TODO Auto-generated constructor stub
    }
    
    public void Heal(){
        this.hp += 20;
        System.out.println(name + " HEAL!!!");
        System.out.println(name + " HP : " + hp);
    }
}
