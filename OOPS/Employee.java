public class Employee {
    private int id;
    private String name;
    private int basicSalary;

    public void TakeInput(int id, String name, int basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public void printInfo(float netSalary) {
        System.out.println("id=" + id);
        System.out.println("Name=" + name);
        System.out.println("Basicalary=" + basicSalary);
        System.out.println("NetSalary=" + netSalary);
    }
}
