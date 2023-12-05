public class parameterizedconstruc {
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
        Student(int rno,String name,float marks)
        {
            this.name=name;
            this.marks=marks;
            this.rno=43;
        }
    }
    public static void main(String[] args) {
        Student s1=new Student(43, "Sankar", 98.5f);
        s1.display();
    }
}
