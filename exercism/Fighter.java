package pl.globallogic.exercism;

class Fighter {

    boolean isVulnerable() {
        return true;
    }
    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}
class Warrior extends Fighter {
    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }
    @Override
    boolean isVulnerable() {
        return false;
    }
    @Override
    int getDamagePoints(Fighter fighter) {
        return !fighter.isVulnerable() ? 6 : 10;
    }
}
class Wizard extends Fighter {

    private boolean spell = false;

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }
    public void prepareSpell() {
        spell = true;
    }
    @Override
    boolean isVulnerable() {
        return !spell;
    }
    @Override
    int getDamagePoints(Fighter fighter) {
        return spell ? 12 : 3;
    }
}
