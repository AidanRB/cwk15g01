package cwk15g01;

public class Salmon extends Animal implements Prey {
    public Salmon(int health) {
        super(health);
    }

    @Override
    public double nutrition() {
        return getHealth() * 1.5;
    }

    @Override
    public String toString() {
        return "Salmon";
    }
}
