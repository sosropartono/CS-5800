// Concrete Protein
public class Protein implements Macronutrient {
    private String name;

    public Protein(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
