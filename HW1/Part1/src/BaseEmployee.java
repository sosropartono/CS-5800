public class BaseEmployee extends Employee{

    private float baseSalary;
    public BaseEmployee(String first, String last, String SSN, float baseSalary) {
        super(first, last, SSN);
        this.baseSalary = baseSalary;

    }

    @Override
    public String toString(){
        return super.toString() + " Base: " + baseSalary;
    }
}


