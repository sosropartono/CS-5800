public class HourlyEmployee extends Employee{

    private int wage;
    private int hours;
    public HourlyEmployee(String first, String last, String SSN, int wage, int hours){
        super(first, last, SSN);
        this.wage = wage;
        this.hours = hours;

    }


    @Override
    public String toString(){
        return super.toString() + " Wage: " + wage + " Hours: " + hours;
    }


}
