package gamechar;

public class CharacterDirector {

    private CharacterBuilder builder;

    public CharacterDirector(CharacterBuilder builder) {
        this.builder = builder;
    }

    public Character constructCharacter(String name, int health, int power) {
        builder.setName(name);
        builder.setHealth(health);
        builder.setPower(power);
        return builder.build();
    }
}
