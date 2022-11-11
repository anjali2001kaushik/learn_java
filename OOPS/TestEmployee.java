import java.util.Scanner;

public class TestEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int id = sc.nextInt();
        int basicSalary = sc.nextInt();
        Employee employee = new Employee();
        employee.TakeInput(id, name, basicSalary);
        Salary salary = new Salary();
        salary.calculate(basicSalary);
        sc.close();
    }
}
