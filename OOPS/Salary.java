public class Salary {
    float HRA, DA, TA, MA, pf, tax, grossSalary, netSalary;

    public void calculate(int basicSalary) {
        HRA = (float) 0.5 * (basicSalary);
        DA = (float) 0.1 * (basicSalary);
        TA = (float) 0.4 * (basicSalary);
        MA = (float) 0.3 * (basicSalary);
        pf = (float) 0.05 * (basicSalary);
        grossSalary = HRA + DA + TA + MA;
        tax = 0.10f * pf;
        netSalary = grossSalary - pf - tax;
        Employee employee = new Employee();
        employee.printInfo(netSalary);
    }

}
