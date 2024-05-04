import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Document document = new Document();
        document.addCharacter('T', new CharacterState("Arial", "Red", 12));
        document.addCharacter('e', new CharacterState("Arial", "Red", 12));
        document.addCharacter('s', new CharacterState("Calibri", "Blue", 14));
        document.addCharacter('t', new CharacterState("Calibri", "Blue", 14));
        document.addCharacter('s', new CharacterState("Verdana", "Black", 16));
        document.addCharacter(' ', new CharacterState("Verdana", "Black", 16));
        document.addCharacter('W', new CharacterState("Verdana", "Black", 16));
        document.addCharacter('o', new CharacterState("Arial", "Red", 12));
        document.addCharacter('r', new CharacterState("Arial", "Red", 12));
        document.addCharacter('l', new CharacterState("Arial", "Red", 12));
        document.addCharacter('d', new CharacterState("Arial", "Red", 12));

        document.save("example_document.txt");

        Document loadedDocument = new Document();
        loadedDocument.load("example_document.txt");

        for (Character character : loadedDocument.getCharacters()) {
            System.out.println("Character: " + character.getCharacter() +
                    ", Font: " + character.getProperties().getFont() +
                    ", Color: " + character.getProperties().getColor() +
                    ", Size: " + character.getProperties().getSize());
        }
    }
}