public class HashCodeWithEqulas {
    public static void main(String[] args) {
        // Record object create
        Student s1 = new Student(1, "Raju");
        Student s2 = new Student(1, "Raju");
        Student s3 = new Student(2, "Amit");

        // toString() auto generate hota hai
        System.out.println(s1); // Output: Student[id=1, name=Raju]

        // equals() auto generate hota hai
        System.out.println("s1.equals(s2): " + s1.equals(s2)); // true
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // false

        // hashCode() auto generate hota hai
        System.out.println("s1.hashCode(): " + s1.hashCode());
        System.out.println("s2.hashCode(): " + s2.hashCode()); // same as s1
        System.out.println("s3.hashCode(): " + s3.hashCode());
    }
}

// Record declaration
record Student(int id, String name) {}
//ye class ke barabar hai jisme humne equals, hashcode and toString method ko override kiya hai
// ye immutable hota hai yani ek baar value set karne ke baad change nahi kar sakte
// ye final hota hai yani isse extend nahi kar sakte
// ye thread safe hota hai
// ye concise hota hai yani kam code me zyada kaam kar sakte hain
// ye data carrier ke liye best hota hai