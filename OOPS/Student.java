//class is a Noun
//SRP Single responsibility principle
//class does not take any memory
//Encapsulation=BInding data members+methods ito single unit and this unit is called class
//Data Hiding
class Student {
    // members
    // class ke pass members hai and object ke pass state(value) hai
    private int rollno;
    private String name;
    private int marks[] = new int[3];
    private String course;

    public void takeInput(int rollno, String name, int marks[], String course) {
        this.rollno = rollno;// this lagana tb jyaada jruri hai jb local or member variable ka name same ho
                             // jaaye
        this.name = name;
        this.marks = marks;
        this.course = course;
    }

    public void compute(float percentage) {
        if (percentage >= 90)
            System.out.println("Grade A");
        else if (percentage < 90 && percentage >= 70)
            System.out.println("Grade B");
        else if (percentage < 70 && percentage >= 60)
            System.out.println("Grade C");
        else if (percentage < 60 && percentage >= 50)
            System.out.println("Grade D");
        else if (percentage < 50 && percentage >= 40)
            System.out.println("Grade E");
        else
            System.out.println("Grade F");

    }

    public void print() {
        // this keeps address of current calling object
        System.out.println("Roll No=" + this.rollno);
        System.out.println("Name=" + name);// By default java yha this likh dega
        System.out.println("COurse=" + course);
        // System.out.println(marks);
    }

}