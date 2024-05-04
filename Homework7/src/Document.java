
import java.io.*;
import java.util.ArrayList;
import java.util.List;

//Acts as the factory class which holds the flyweights (characters)
//Have constant fields on the outside of the class, results in less amount of objects, instead of having multiple
//Objects with generally the same fields
public class Document {
    private List<Character> characters;

    public Document() {
        this.characters = new ArrayList<>();
    }

    public void addCharacter(char character, CharacterState properties) {
        characters.add(new Character(character, properties));
    }

    public void save(String filename) throws IOException {
        FileWriter writer = new FileWriter(filename);
        for (Character character : characters) {
            String line = character.getCharacter() + "," + character.getProperties().getFont() + "," +
                    character.getProperties().getColor() + "," + character.getProperties().getSize() + "\n";
            writer.write(line);
        }
        writer.close();
    }

    public void load(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        characters.clear();
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            char character = parts[0].charAt(0);
            String font = parts[1];
            String color = parts[2];
            int size = Integer.parseInt(parts[3]);
            characters.add(new Character(character, new CharacterState(font, color, size)));
        }
        reader.close();
    }



    public List<Character> getCharacters() {
        return characters;
    }
}
