public class SalariedEmployee extends Employee{

    private int weeklySalary;


    public SalariedEmployee(String first, String last, String SSN, int weeklySalary) {
        super(first, last, SSN);
        this.weeklySalary =  weeklySalary;
    }

    @Override
    public String toString(){
        return super.toString() + " Weekly Salary: " + weeklySalary;
    }

}
