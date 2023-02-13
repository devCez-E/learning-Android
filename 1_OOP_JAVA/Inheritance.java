public class Inheritance {
    public static void main(String[] args) {
        PlayerC player = new PlayerC("devcez", 100, 12);
        EnemyC enemy = new EnemyC("orc", 80, 5);

        while(player.isLive() && enemy.isLive()){
            if(player.hp > 0) player.Attack(enemy);
            if(enemy.hp > 0)enemy.Attack(player);
        }

        if(player.isLive()) System.out.println("Player Win");
        else System.out.println("Enemy Win");
    }
}
