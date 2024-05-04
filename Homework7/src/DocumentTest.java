import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class DocumentTest {

    @Test
    public void testAddCharacter() {
        Document document = new Document();
        CharacterState properties = new CharacterState("Arial", "Red", 12);
        document.addCharacter('A', properties);
        assertEquals(1, document.getCharacters().size());
        assertEquals('A', document.getCharacters().get(0).getCharacter());
        assertEquals(properties, document.getCharacters().get(0).getProperties());
    }

    @Test
    public void testSaveAndLoad() throws IOException {
        Document document = new Document();
        document.addCharacter('H', new CharacterState("Arial", "Red", 12));
        document.addCharacter('e', new CharacterState("Arial", "Red", 12));
        document.addCharacter('l', new CharacterState("Calibri", "Blue", 14));
        document.addCharacter('l', new CharacterState("Calibri", "Blue", 14));
        document.addCharacter('o', new CharacterState("Verdana", "Black", 16));

        String filename = "test_document.txt";
        document.save(filename);

        Document loadedDocument = new Document();
        loadedDocument.load(filename);

        assertEquals(document.getCharacters().size(), loadedDocument.getCharacters().size());
        for (int i = 0; i < document.getCharacters().size(); i++) {
            Character expectedCharacter = document.getCharacters().get(i);
            Character loadedCharacter = loadedDocument.getCharacters().get(i);
            assertEquals(expectedCharacter.getCharacter(), loadedCharacter.getCharacter());
            assertEquals(expectedCharacter.getProperties().getSize(), loadedCharacter.getProperties().getSize());
        }
    }
}
