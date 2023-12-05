public class a1 {
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
    }

    public static void main(String[] args) {
        Student s1=new Student();
        s1.display();
    }
}
