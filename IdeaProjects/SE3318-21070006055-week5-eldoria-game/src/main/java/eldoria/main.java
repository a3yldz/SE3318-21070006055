package eldoria;

public class main {
    public static void main(String[] args) {
        Hero hero = new Hero("Aragon", 5);
        Enemy enemy = new Enemy("Goblin", 3);
        QuestBoard questBoard = new QuestBoard();
        questBoard.assignQuest(enemy, "Defeat the dragon");
        BattleManager battleManager = new BattleManager();
        battleManager.simulateBattle(hero, enemy);
    }
}
