/**
 *
 * @author Paydreanne E. Hinton (worked individually)
 * instructor Professor Van Custodio
 * courseSection ITSC1213-106-27949
 * Company
 * The following program holds all methods (main as well) pertaining to Company, Person, and Employee classes
 */


import java.util.*;
public class Mainz
{
  public static void main(String[] args)
  {
    Company enron = new Company();
    enron.add(new Person("Carlos",27)); // name, age
    enron.add(new Person("Liam",38));
    enron.add(new Employee("Asraf", 47,"Manager",90000)); // name, age, position, 
    Employee e2 = new Employee("Lisa", 27,"Engineer",70000);
    Person p4 = new Employee("Karla", 57,"Engineer",80000);
    enron.add(e2);
    enron.add(p4);
    System.out.println("E2 equals P4: "+e2.equals(p4));
    System.out.println("Number of people: "+enron.getNumPeople());
    System.out.println("Number of employees: "+enron.countEmployees());
  }
}
class Company 
{
  private ArrayList<Person> people;
  private int numPeople; 
  private int numEmployees;
  public Company()
  {
    people = new ArrayList<Person>();
    numPeople = 0;
  }
  public void add(Person p)
  {
    people.add(p);
    numPeople++;
  }
  //create getter method for number of people
  public int getNumPeople() {
      return numPeople;
  }
  //create method to count employees
  public int countEmployees() {
      for (int i = 0; i < people.size(); i++) {
          if (people.get(i) instanceof Employee) {
              numEmployees++;
          }
      }
      return numEmployees;
  }
}


class Person
{
  private String name;
  private String position;
    private int age;
    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    //create a getter method for position
    public String getPosition() {
      return position;
  }
  public void setPosition(String pos) {
      this.position = pos;
  }
    //override the toString method for the Person class
    public String toString() {
        return name + ", " + age;
       }
}


class Employee extends Person
  {
    //create variable for position
    private String position;
    //create variable for salary
    private int salary;
    //create constructor that calls superclass constructor

    public Employee(String name, int age, String position, int salary) {
        super(name, age);
        this.position = position;
        this.salary = salary;
    }

    public Employee(String name, int age) {
        super(name, age);
    }

    //create a getter method for position
    public String getPosition() {
        return position;
    }
    public void setPosition(String pos) {
        this.position = pos;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    } 
    //override the toString method for the Employee class
    public String toString() {
        return super.toString();
      }

  public boolean equals(Object other) {
    Person otherObj = (Person) other;
    return (this.position.equals(otherObj.getPosition()));
  }
  
}

