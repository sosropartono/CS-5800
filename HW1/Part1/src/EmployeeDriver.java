public class EmployeeDriver
{

    public static void main(String args[]){
        Employee jonJones = new SalariedEmployee("Jon", "Jones", "111-11-1111", 2500);
        Employee stephSmith = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25,32);
        Employee maryQuinn = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);
        Employee nicoleDior = new CommissionEmployee("Nicole", "Dior", "444-44-4444",15, 50000);
        Employee renwaChanel = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700);
        Employee mikeDavenport = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);
        Employee mahnazVaziri = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 22, 40000);

        System.out.println(jonJones.toString());
        System.out.println(stephSmith.toString());
        System.out.println(maryQuinn.toString());
        System.out.println(nicoleDior.toString());
        System.out.println(renwaChanel.toString());
        System.out.println(mikeDavenport.toString());
        System.out.println(mahnazVaziri.toString());






    }
}
