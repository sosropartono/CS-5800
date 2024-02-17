public class CourseDriver {

    public static void main(String[] args) {
        Course main = new Course("CS 5800", new Instructor("Nima", "Davarpanah", "3-2636"), new Textbook("Clean Code", "Robert C Marin", "Prentice Hall"));
        Course second = new Course("PAL 2321", new Instructor("Ash", "Ketchem", "4-4556"), new Textbook("Beating the Gym", "Carrot Top", "Ubiquitous Hall"));
        System.out.println(main);
        System.out.println(second);
    }

}
