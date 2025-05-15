package gamechar;

public class BossBuilder implements CharacterBuilder {

    private Character character;

    public BossBuilder() {
        character = new Character("", "Jefe Enemigo", 150, 40);
    }

    public void setName(String name) {
        character = new Character(name, character.getCharacterType(), character.getHealth(), character.getPower());
    }
    public void setHealth(int health) {
        character = new Character(character.getName(), character.getCharacterType(), health, character.getPower());
    }
    public void setPower(int power) {
        character = new Character(character.getName(), character.getCharacterType(), character.getHealth(), power);
    }

    public Character build() {
        return character;
    }
}
