
package udemy;

class Student{
    public String name;
    public static String studentClass;
    
    public void stdName()
    {
        System.out.println(name);
    }
    public static void classInfo()
    {
        System.out.println("Java");
    }
}

public class StaticFinal {
    public static void main(String[]args)
    {
        Student.studentClass ="Stand-Alone dev fundamentals";
         System.out.println(Student.studentClass);
         
         Student.classInfo();
        Student std1 = new Student();
        Student std2 = new Student();
        
        std1.name = "Stevens";
        std2.name = "Fredrick";
        
        System.out.println(std1.name);
        System.out.println(std2.name);
    }
    
}
