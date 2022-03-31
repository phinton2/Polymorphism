public class Polymorphism { 
    public static void main(String[] args) { 
    Person p; 
    Student s; 
    Person p1 = new Person("Helen"); 
    Student s1 = new Student("John"); 
    Person poly = new Student("Polly"); 
    System.out.println(p1 instanceof Student);  System.out.println(s1 instanceof Student);  System.out.println(poly instanceof Student);  } 
   }


public class Person {
   private String name;
    Person(String name) {
       this.name = name;
   }

   public Person(String name) {
       this.name = name;
   }
}

class Student extends Person {
   public Student(String name) {
       super(name);
   }
}
