import java.util.ArrayList;
import java.util.*;

class Student {
    int rollno;
    String name;
    int age;

    Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Comparaterwithclass {
    
    public static void main(String[] args) {
    ArrayList<Student> list = new ArrayList<>();


        list.add(new Student(101, "John", 22));
        list.add(new Student(102, "Alice", 20));
        list.add(new Student(103, "bob", 23));
        list.add(new Student(104, "Aob", 23));
// -------------------------------------------------------------------------------------------
        // Sorting by age
        // list.sort((s1, s2) -> s1.getAge() - s2.getAge());// method 1
// -------------------------------------------------------------------------------------------

     /*    list.sort((a,b)-> {

            if(a.getAge()-b.getAge()>0)
            {
                return 1;
            }
            else if(a.getAge()-b.getAge()<0)
            {
                return -1;

            }
            // yadi mai chaahu ki name ke hisab se bhi jo jiska age same ho to
            else{

                return a.getName().compareTo(b.getName());
            }
            
            
            }); 
            
            
            
            */

// ---------------------------------------------------------------------------

            //or
            // ---------------------------------------------------------------------------
     /*      Comparator<Student> comparator = Comparator.comparing(Student::getAge).reversed()
                    .thenComparing(Student::getName);
            list.sort(comparator);

            same chij next method me hai 
            // ---------------------------------------------------------------------------

*/

            // or
            // ---------------------------------------------------------------------------  

        // Collections.sort(list, (s1, s2) -> s1.getAge() - s2.getAge()); // method 2
// -------------------------------------------------------------------------------------------
        // or
        //  Collections.sort(list, Comparator.comparingInt(Student::getAge)); // method 2
        // -------------------------------------------------------------------------------------------
        // list.sort(Comparator.comparingInt(Student::getAge).reversed().thenComparing(Student::getName)); // method 3
// -------------------------------------------------------------------------------------------
        System.out.println("Sorted by age:");
        for (Student s : list) {
            System.out.println("Student: " + s.getName() + ", Roll No: " + s.getRollno() + ", Age: " + s.getAge());
        }
    }
}
