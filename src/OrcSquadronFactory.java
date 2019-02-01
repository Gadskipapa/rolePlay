public class OrcSquadronFactory extends SquadronFactory {

    @Override
    public Mage createMage() {
        return new OrcMage();
    }

    @Override
    public Archer createArcher() {
        return new OrcArcher();
    }

    @Override
    public Warrior createWarrior() {
        return new OrcWarrior();
    }
}
