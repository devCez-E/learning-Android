public class Character {
    String name;
    int hp;
    int attack;

    public Character(String name, int hp, int attack){
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    public void Attack(Character enemy){
        System.out.println(this.name + " Attack!");
        enemy.hp -= this.attack;
        System.out.println(enemy.name + " HP : " + enemy.hp);
    }

    public boolean isLive(){
        if(hp >= 0) return true;
        else return false;
    }
}
