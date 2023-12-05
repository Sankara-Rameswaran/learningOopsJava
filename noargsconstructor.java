public class noargsconstructor {
    public static class Student
    {
        int rno;
        String name;
        float marks;
        void display()
        {
            System.out.println("Name is "+this.name);
            System.out.println("Rno is "+this.rno);
            System.out.println("Mark is "+this.marks);
        }
        Student()
        {
            this.name="undefined";
            this.marks=0.0f;
            this.rno=0;
        }
    }
    public static void main(String[] args) {
        Student s1=new Student();
        s1.display();
    }
}
