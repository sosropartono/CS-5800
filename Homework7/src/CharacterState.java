import java.util.ArrayList;

// Supposedly the "Flyweight" class, less RAM usage, using an object to keep track of a state
// color, font, size are intrinsic(constant) state?
public class CharacterState {

    private String color;
    private String font;
    private int size;

    public CharacterState(String color, String font, int size){
        this.color = color;
        this.font = font;
        this.size = size;

    }

    public String getFont() {
        return font;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }
}

