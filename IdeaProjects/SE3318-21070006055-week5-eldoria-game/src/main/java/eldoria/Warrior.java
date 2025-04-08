package eldoria;

public class Warrior extends Hero implements Questable {
    public Warrior(String name, int level) {
        super(name, level);
    }

    public void attack() {
        System.out.println(getName() + " swings a mighty sword!");
    }

    @Override
    public void acceptQuest(String questName) {
        System.out.println(getName() + " accepted quest: " + questName);
    }

    @Override
    public void speak() {
        System.out.println(getName() + " says: Strength above all!");
    }
}
