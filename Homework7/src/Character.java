public class Character {
    private char character;
    private CharacterState properties;

    public Character(char character, CharacterState properties) {
        this.character = character;
        this.properties = properties;
    }

    public char getCharacter() {
        return character;
    }

    public CharacterState getProperties() {
        return properties;
    }
}