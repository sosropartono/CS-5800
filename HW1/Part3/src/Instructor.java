public class Instructor {

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    private String first;

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    private String last;

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

    private String officeNumber;


    public Instructor(String first, String last, String officeNumber){
        this.first = first;
        this.last = last;
        this.officeNumber = officeNumber;

    }


    public String toString(){
        return "Instructor First: " + first + " " + " Instructor Last: " + last + " OFfice Number: : " +officeNumber;
    }


}
