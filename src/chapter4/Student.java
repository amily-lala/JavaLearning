package chapter4;

public class Student extends Person{
    String school ;
    public Student(String name,int age,String school){
        super(name,age);
        this.school = school;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public static void main (String[] args){
        Student stu = new Student("xiaobai",20,"Tingshua");
//        Person per = new Student();
        stu.getName();
    }
}
