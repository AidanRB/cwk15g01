package cwk15g01;

public class RoboHunter implements Predator {
    @Override
    public boolean hunt(Prey prey) {
        System.out.println("Robohunter hunting " + prey);
        return true;
    }

    @Override
    public void eat(Prey prey) {
        System.out.println("Robohunter blowing up " + prey + " with laser");
    }

    @Override
    public String toString() {
        return "RobotHunter";
    }
}
