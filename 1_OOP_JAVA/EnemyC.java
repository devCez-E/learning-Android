public class EnemyC extends Character{

    public EnemyC(String name, int hp, int attack) {
        super(name, hp, attack);
        //TODO Auto-generated constructor stub
    }
    
    @Override
    public void Attack(Character enemy) {
        // TODO Auto-generated method stub
        if(hp<20){
            System.out.println("Orc is ANGRY....>0< !!!!");
            this.attack += 15;
        }

        super.Attack(enemy);

        PlayerC player = (PlayerC)enemy;
        if(enemy.hp < 30) player.Heal();
    }
}
