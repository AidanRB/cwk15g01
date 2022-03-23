package cwk15g01;

public class Human extends Animal implements Predator, Prey {
    @Override
    public double nutrition() {
        return 20;
    }

    @Override
    public boolean hunt(Prey prey) {
        System.out.println("Human hunting " + prey);
        return true;
    }

    @Override
    public void eat(Prey prey) {
        System.out.println("Human eating " + prey + (prey.nutrition() > 0 ? " delightfully" : " begrudgingly"));
    }

    @Override
    public String toString() {
        return "Human";
    }
}
