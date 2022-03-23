package cwk15g01;

public abstract class Animal {
    private int health;

    public Animal() {
        this.health = 10;
    }

    public Animal(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "Animal";
    }
}
