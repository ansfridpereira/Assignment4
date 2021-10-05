/*Create a class 'Student' with three data members
        which are name, age and address.

        The constructor of the class assigns default values name as "unknown", age as
        '0' and address as "not available".

        It has two members with the same name 'setInfo'.

        First method has two parameters for name and age and assigns the same
        whereas the second method takes has three parameters
        which are assigned to name, age and address
        respectively.

        Print the name, age and address of 10 students. Hint - Use array of objects.*/
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student {
    String name = "unknown";
    String age = "0";
    String address = "Not avaliable";

    public void setinfo(String name, String age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String toString() {
        return "Student [name=" + this.name + ", age=" + this.age + ", address=" + this.address + "]";
    }

    public static void main(String[] args) {
        List<Student> stu = new ArrayList();
        stu.add(new Student());
        stu.add(new Student());
        stu.add(new Student());
        stu.add(new Student());
        stu.add(new Student());
        stu.add(new Student());
        stu.add(new Student());
        stu.add(new Student());
        stu.add(new Student());
        stu.add(new Student());
        ((Student) stu.get(1)).setinfo("Ansfrid", "19", "Chembur");
        ((Student) stu.get(2)).setinfo("Shubham", "20", "bandra");
        ((Student) stu.get(3)).setinfo("Dishant", "18", "Kurla");
        ((Student) stu.get(4)).setinfo("Riean", "19", "Ghatkopar");
        ((Student) stu.get(6)).setinfo("Dhairya", "20", "Powai");

        Iterator var2 = stu.iterator();

        while (var2.hasNext()) {
            Student s = (Student) var2.next();
            System.out.println(s);
        }
    }
}
