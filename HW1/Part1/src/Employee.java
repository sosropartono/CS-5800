public class Employee {

    private final String first;
    private final String last;
    private final String SSN;

    public Employee(String first, String last, String SSN){
        this.first = first;
        this.last = last;
        this.SSN = SSN;

    }

    @Override
    public String toString(){
        return "First Name: " + first + " Last Name: " +  last + " SSN: " +  SSN;

    }


}
