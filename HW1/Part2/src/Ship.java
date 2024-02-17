public class Ship {

    private String name;
    private String year;

    public Ship(String name, String year){
        this.name = name;
        this.year = year;
    }



    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return "Name: " + name + " Year: " + year;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getYear(){
        return year;
    }

    public void setYear(String year){
        this.year = year;
    }
}
