public class testFengZhuang {
    public static void main(String[] args) {
        PersonA p = new PersonA();
        p.setName("xiaowang");
        p.setAge(10);
        p.setSalary(25384.7);
        p.print_info();
    }
}
class PersonA{
    String name;
    int age;
    double salary;

    // 无参构造器
    public PersonA() {

    }

    // 全参构造器
    public PersonA(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    void print_info(){
        System.out.println(name + " " + age + " " + salary);
    }
}
