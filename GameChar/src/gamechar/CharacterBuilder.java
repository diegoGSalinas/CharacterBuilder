package gamechar;

public interface CharacterBuilder {

    void setName(String name);

    void setHealth(int health);

    void setPower(int power);

    Character build();
}
