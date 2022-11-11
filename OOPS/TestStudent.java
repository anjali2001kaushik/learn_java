public class TestStudent {
    // DRY-Don't repeat Yourself

    public static void main(String[] args) {
        // ram ek refernce variable hai jo address rkhta hai student (object) ka . and
        // obj bna rhs se i.e. new se
        Student ram = new Student();// new is used to allocate memory and ram is also a variable of student type
        int m[] = { 100, 50, 70 };
        float percentage = (m[0] + m[1] + m[2]) / 3;
        ram.takeInput(1001, "ram", m, "java");
        ram.print();
        ram.compute(percentage);
        // Ram is a local variable
        // int x = 100;// x is a variable

    }
}
