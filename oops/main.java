
class Teacher{
    protected String name;
    private int id;
    Teacher(String name, int id){
        this.name = name;
        this.id = id;
        System.out.println("Teacher class name: "+ this.name);
    }
    void Command(){
        System.out.println("Be quiet!");
    }
}

class Student extends Teacher{
    Student(String name, int id){
        super(name,id);
        System.out.println("Student class");
        System.out.println("Teacher name is:" + super.name);
        super.Command();
    }
}

public class main{
    public static void main(String args[]) {
        Student stu = new Student("kesavan",77);
    }
}