package gamechar;

public class Character {

    private final String name;
    private final String characterType;
    private final int health;
    private final int power;

    public Character(String name, String characterType, int health, int power) {
        this.name = name;
        this.characterType = characterType;
        this.health = health;
        this.power = power;
    }

    public String getName() {
        return name;
    }
    public String getCharacterType() {
        return characterType;
    }
    public int getHealth() {
        return health;
    }
    public int getPower() {
        return power;
    }
}
