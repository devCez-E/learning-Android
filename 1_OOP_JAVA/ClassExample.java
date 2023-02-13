import javafx.scene.media.Track;

public class ClassExample {
    static class Player{
        String name;
        int hp;
        int attack;

        public Player(String name, int hp, int attack){
            this.name = name;
            this.hp = hp;
            this.attack = attack;
        }

        public void attack(Enemy enemy){
            System.out.println("Player Attack!");
            enemy.hp -= this.attack;
            System.out.println("Enemy hp : " + enemy.hp);
        }

        public boolean isLive(){
            if(hp >= 0) return true;
            else return false;
        }
    }   
    
    static class Enemy{
        String name;
        int hp;
        int attack;

        public Enemy(String name, int hp, int attack){
            this.name = name;
            this.hp = hp;
            this.attack = attack;
        }

        public void attack(Player player){
            System.out.println("Enemy Attack!");
            player.hp -= this.attack;
            System.out.println("Player hp : " + player.hp);
        }

        public boolean isLive(){
            if(hp >= 0) return true;
            else return false;
        }
    }

    public static void main(String[] args) {
        Player player = new Player("devcez", 100, 12);
        Enemy enemy = new Enemy("orc", 80, 5);

        while(player.isLive() && enemy.isLive()){
            if(player.hp > 0) player.attack(enemy);
            if(enemy.hp > 0)enemy.attack(player);
        }

        if(player.isLive()) System.out.println("Player Win");
        else System.out.println("Enemy Win");
    }
}
