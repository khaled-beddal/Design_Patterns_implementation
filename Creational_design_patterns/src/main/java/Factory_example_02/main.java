package Factory_example_02;

public class main {
    
    public static void main(String[] args) {

        Enemy enemyBird = EnemyFactory.createEnemy(EnemyFactory.BIRD);
        Enemy enemyTurtle = EnemyFactory.createEnemy(EnemyFactory.TURTLE);

        enemyBird.showUp();
        enemyTurtle.showUp();
        
    }
}
