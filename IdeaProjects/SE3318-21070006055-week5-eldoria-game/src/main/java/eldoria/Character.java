package eldoria;

public abstract class Character {
    protected String name;
    protected int level;

    public Character(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    // Soyut metot - alt sınıflar kendine göre dolduracak
    public abstract void speak();
}
