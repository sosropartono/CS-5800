public class CommissionEmployee extends Employee{

    private final float comissionRate;
    private float grossSales;


    public CommissionEmployee(String first, String last, String SSN, float comissionRate, float grossSales) {
        super(first, last, SSN);
        this.comissionRate = comissionRate;
        this.grossSales = grossSales;
    }

    @Override
    public String toString(){
        return super.toString() + " Commission: " + comissionRate + " Gross Sales: " + grossSales;
    }
}
