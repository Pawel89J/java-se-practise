package pl.globallogic.exercism;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DnDCharacter {

    private int strength;
    private int ability;
    private int dexterity;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private int constitution;

    public DnDCharacter() {
        this.strength = diceMethod();
        this.ability = diceMethod();
        this.dexterity = diceMethod();
        this.intelligence = diceMethod();
        this.wisdom = diceMethod();
        this.charisma = diceMethod();
        this.constitution = diceMethod();
    }

    int ability(List<Integer> scores) {
        List<Integer> copy = new ArrayList<>(scores);

        int sum = 0;
        int lowest = 7;
        int index = -1;
        for (int i = 0; i < copy.size(); i++) {
            if (copy.get(i) < lowest) {
                lowest = copy.get(i);
                index = i;
            }
        }
        copy.remove(index);
        for (Integer integer : copy) {
            sum += integer;
        }
        return sum;
    }
    List<Integer> rollDice() {
        List<Integer> diceThrows = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            diceThrows.add(random.nextInt(6) + 1);
        }
        return diceThrows;
    }
    int modifier(int input) {
        double num = ((double) (input - 10) / 2);
        if (num < 0) {
            num = -1 * num;
            return -1 * (int) Math.ceil(num);
        } else {
            return (int) num;
        }
    }
    int diceMethod() {
        return ability(rollDice());
    }
    int getStrength() {
        return strength;
    }
    int getDexterity() {
        return dexterity;
    }
    int getConstitution() {
        return constitution;
    }
    int getIntelligence() {
        return intelligence;
    }
    int getWisdom() {
        return wisdom;
    }
    int getCharisma() {
        return charisma;
    }
    int getHitpoints() {
        return 10 + modifier(constitution);
    }
}
