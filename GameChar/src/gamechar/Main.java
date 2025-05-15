package gamechar;

public class Main {

    public static void main(String[] args) {
        // Crear un Guerrero
        WarriorBuilder warriorBuilder = new WarriorBuilder();
        CharacterDirector director = new CharacterDirector(warriorBuilder);
        Character warrior = director.constructCharacter("Guts", 120, 25);
        System.out.println("Personaje: " + warrior.getName() + ", Tipo: "+
                warrior.getCharacterType() +", Salud: " +
                warrior.getHealth() + ", Poder: " +
                warrior.getPower());

        // Crear un Mago
        MageBuilder mageBuilder = new MageBuilder();
        director = new CharacterDirector(mageBuilder);
        Character mage = director.constructCharacter("Gandalf", 90, 35);
        System.out.println("Personaje: " + mage.getName() + ", Tipo: " +
                mage.getCharacterType() + ", Salud: " +
                mage.getHealth() + ", Poder: " +
                mage.getPower());

        // Crear un Jefe Enemigo
        BossBuilder bossBuilder = new BossBuilder();
        director = new CharacterDirector(bossBuilder);
        Character boss = director.constructCharacter("Sauron", 1000, 250);
        System.out.println("Personaje: " + boss.getName() + ", Tipo: " +
                boss.getCharacterType() + ", Salud: " +
                boss.getHealth() + ", Poder: " +
                boss.getPower());
    }
}
