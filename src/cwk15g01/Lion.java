package cwk15g01;

public class Lion extends Animal implements Predator {
    @Override
    public boolean hunt(Prey prey) {
        boolean hunted = Math.random() > .5 ? true : false;
        System.out.println("Lion hunting " + prey + (hunted ? " " : " un") + "successfully");
        return hunted;
    }

    @Override
    public void eat(Prey prey) {
        System.out.println("Lion eating " + prey);
    }

    @Override
    public String toString() {
        return "Lion";
    }
}
