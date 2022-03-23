package cwk15g01;

public class Classy {
    public static void main(String[] args) {
        RoboHunter robo = new RoboHunter();
        Bait bait = new Bait();
        nature(robo, bait);

        Predator [] predators = {
            new RoboHunter(),
            new Human(),
            new Lion()
        };

        Prey [] preys = {
            new Bait(),
            new Salmon(10),
            new Human()
        };

        for (Prey prey : preys) {
            for (Predator predator : predators) {
                nature(predator, prey);
            }
        }
    }

    public static void nature(Predator predator, Prey prey) {
        if (predator.hunt(prey)) {
            predator.eat(prey);
        }
    }
}
