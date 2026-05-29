import java.util.HashSet;
import java.util.Objects;

public class testHashSet {
    public static void main(String[] args) {
        Employee employee1 = new Employee("a", 10);
        Employee employee2 = new Employee("b", 20);
        Employee employee3 = new Employee("a", 10);
        HashSet hs = new HashSet();
        hs.add(employee1);
        hs.add(employee2);
        hs.add(employee3);
        System.out.println("hashSet == " + hs);

    }
}
class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
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

    @Override
    public String toString() {
        return this.name + " " + this.age;
    }
}
