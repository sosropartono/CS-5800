public class Textbook {

    private String title;
    private String author;
    private String publisher;

    public Textbook(String title, String author, String publisher){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public String toString(){
        return "Title: " + title + " " + " Author: " + author + " Publisher: " + publisher;
    }
}
