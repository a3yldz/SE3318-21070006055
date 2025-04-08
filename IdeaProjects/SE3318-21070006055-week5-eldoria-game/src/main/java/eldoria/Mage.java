package eldoria;

public class Mage extends Hero implements Questable {
    public Mage(String name, int level) {
        super(name, level);
    }

    public void castSpell() {
        System.out.println(getName() + " casts a powerful spell!");
    }

    @Override
    public void acceptQuest(String questName) {
        System.out.println(getName() + " accepted quest: " + questName);
    }

    @Override
    public void speak() {
        System.out.println(getName() + " says: Knowledge is power!");
    }
}
