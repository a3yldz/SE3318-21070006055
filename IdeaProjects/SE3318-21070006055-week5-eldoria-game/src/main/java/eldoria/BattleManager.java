package eldoria;

public class BattleManager {

    public void simulateBattle(Hero hero, Enemy enemy) {
        System.out.println("⚔️ Battle begins between " + hero.getName() + " and " + enemy.getName());

        hero.speak();
        enemy.speak();

        if (hero.getLevel() > enemy.getLevel()) {
            System.out.println(hero.getName() + " wins the battle!");
        } else if (enemy.getLevel() > hero.getLevel()) {
            System.out.println(enemy.getName() + " wins the battle!");
        } else {
            System.out.println("It's a draw! Both are equally strong.");
        }
    }
}
