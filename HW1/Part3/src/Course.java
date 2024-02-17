import org.w3c.dom.Text;

public class Course {

    private String name;

    private Instructor instructor;
    private Textbook textbook;

    public Course(String name, Instructor instructor, Textbook textbook){
        this.name = name;
        this.instructor = instructor;
        this.textbook = textbook;
    }
    @Override
    public String toString(){
        return "Course Name: " + name + " " + instructor.toString() + " " + " " +  textbook.toString();
    }

}

